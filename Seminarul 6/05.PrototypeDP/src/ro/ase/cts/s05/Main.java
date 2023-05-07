package ro.ase.cts.s05;

import ro.ase.cts.s05.concrete.Report;
import ro.ase.cts.s05.concrete.ReportGenerator;
import ro.ase.cts.s05.generic.Client;
import ro.ase.cts.s05.generic.Prototype;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("sales", "Sales data", "PDF");
        //Report marketingReport = reportGenerator.generateReport("marketing", "Marketing data", "Excel");

    }
}
