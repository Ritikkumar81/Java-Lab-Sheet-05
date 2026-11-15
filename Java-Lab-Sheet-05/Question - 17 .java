interface Printer { void print(); }
interface Scanner { void scan(); }
class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;
    public void setMachineName(String n) { machineName = n; }
    public void setMachineId(int id) { machineId = id; }
    public String getMachineName() { return machineName; }
    public int getMachineId() { return machineId; }
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
}
class Main {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.setMachineName("HP"); m.setMachineId(101);
        System.out.println(m.getMachineName() + " " + m.getMachineId());
        m.print(); m.scan();
    }
}
