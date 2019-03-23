package client.logger;

public class IClientLogger implements Logger {
    @Override
    public void connected(int id, String message) {
        this.separator();
        System.out.println("ID" + id + "=" + message);
    }

    @Override
    public void listLength(int size) {
        this.separator();
        System.out.println("Peer : [ " + size + " ]");
    }

    @Override
    public void fileLength(int size) {
        this.separator();
        System.out.println("File : [ " + size + " ]");
    }

    @Override
    public void listPeer(int id, int port, String adr) {
        System.out.println("ID " + id + " = [ " + port + " " + adr + " ]");
    }

    @Override
    public void listFile(int id, String fileName, long sizeFile) {
        System.out.println("ID " + id + " = [ " + fileName + " " + sizeFile + " ]");
    }

    @Override
    public void file(int id, String fileName, long sizeFile, long pointer, int fragment) {
        System.out.println("ID " + id + " = [ " + fileName + ":" + sizeFile + " pointer :" + pointer + ", fragment: " + fragment + "]");
    }

    @Override
    public void error(int id) {
        this.separator();
        System.out.println("ERROR serveur send : " + id);
    }

    @Override
    public void command(int id) {
        this.separator();
        System.out.println("ID " + id);
    }

    @Override
    public void separator() {
        System.out.println("-------------------------------");
    }
}
