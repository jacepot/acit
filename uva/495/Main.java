/*
 *  Copyright (c) 2014 Liang Li <ll@lianglee.org>. All rights reserved.
 *
 *  This program is a free software and released under the BSD license.
 *  https://github.com/lang010/acit
 *
 *  Solutions for UVa Problem 495
 *  UVa link: http://uva.onlinejudge.org/external/4/495.html
 *
 *  @Authur Liang Li <ll@lianglee.org>
 *  @Date Nov 21 20:15:35 2014
 */

import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

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

    BigInteger[] ls = new BigInteger[5001];
    void run() {
        ls[0] = BigInteger.valueOf(0);
        ls[1] = BigInteger.valueOf(1);
        for (int i = 2; i < 5001; i++ ) {
            ls[i] = ls[i-1].add(ls[i-2]);
        }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            pw.printf("The Fibonacci number for %d is %s%n", n, ls[n]);
        }

    }

}
