import timeword.timeWord
import metafunctionality.Module
import metafunctionality.ModuleOutput

class TimeWordController {

    def index() {
        render(view:"start.gsp")
    }

    def home() {
        render(view:"start.gsp")
    }

    def start() {
        String inputID = Module.findByModuleId(params.id).inputID
        timeWord input1 = timeWord.findByModuleDataID(inputID)
        List<String> words = input1.words
        Boolean one = input1.oneAtTime
        Double seconds = input1.seconds
        //Store Module in saveModuleService
        [words:words, one:one, seconds:seconds, modID:params.id]
    }

    def submit(){
        List valueRows = new ArrayList<String>()
        ModuleOutput output = new ModuleOutput()
        output.headers = ["timeWord"]

        String inputID = Module.findByModuleId(params.modID).inputID
        timeWord input = timeWord.findByModuleDataID(inputID)

        String valueRow = input.oneAtTime

        valueRows.add(valueRow)
        output.valueRows = valueRows
        Module m = Module.findByModuleId(params.modID)
        if (m.outputIDs != null) {
            m.outputIDs.add(output.moduleDataID)
        } else {
            m.outputIDs = [output.moduleDataID]
        }
        output.type = "timeWord"
        m.isCompleted = true
        m.save(flush: true)
        output.save(flush: true)
        render(view: "submit")
    }
}
