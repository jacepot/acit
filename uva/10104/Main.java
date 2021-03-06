/*
 *  Copyright (c) 2014 Liang Li <ll@lianglee.org>. All rights reserved.
 *
 *  This program is a free software and released under the BSD license.
 *  https://github.com/lang010/acit
 *
 *  Solutions for UVa Problem 10104
 *  UVa link: http://uva.onlinejudge.org/external/101/10104.html
 *
 *  @Authur Liang Li <ll@lianglee.org>
 *  @Date Dec  6 13:30:41 2014
 */
import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    Scanner sc = new Scanner(System.in, "ISO-8859-1");
    PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
    public Main() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.run();
        m.release();
    }
    void release() {
        sc.close();
        pw.close();
    }

    int xx, yy;

    int gcd(int a, int b) {
        if (b == 0) {
            xx = 1;
            yy = 0;
            return a;
        }
        int r = gcd(b, a%b);
        int t = yy;
        yy = xx - a/b*yy;
        xx = t;
        return r;
    }

    void run() {
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = gcd(a, b);
            pw.printf("%d %d %d%n", xx, yy, d);
        }

    }

}
