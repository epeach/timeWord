package timeword

class FetchInputHeadersService {

    Map<String, String> getHeaders(){
        Map<String, String> headers = new LinkedHashMap<>()
        headers.put("seconds", "Double")
        headers.put("oneAtTime", "Boolean")
        headers.put("words", "[String]")
        return headers
    }
}