public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target =new Adapter(adaptee);
        target.request();


        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("{ \"name\": \"Json\", \"age\": 30}");
    }
}
