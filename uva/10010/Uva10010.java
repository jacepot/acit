import java.util.Scanner;
public class Uva10010 {
    Scanner in = new Scanner(System.in);

    int m, n;
    int num;

    char[][] mat = null;

    public void run() {
	mat = new char[50][50];
	num = in.nextInt();
	for(int i = 0; i < num ; i++)
	    r();
    }
    
    public void r() {
	m = in.nextInt();
	n = in.nextInt();
	//System.out.println(m + ": " + n);
	for (int i = 0 ; i < m ; i++) {
	    String s = in.next().toLowerCase();
	    //System.out.println(s);
	    for (int j = 0; j < n ; j++) 
		mat[i][j] = s.charAt(j);
	}
	int cnt = in.nextInt();
	for (int k = 0; k < cnt ; k++) {
	    String s = in.next().toLowerCase();
	    int ok = 0;
	    for(x = 0 ; ok == 0 && x < m; x++)
		for(y = 0; y < n ; y++)
	    if (find(s, 1, 0) || find(s, 0, 1)
		|| find(s, -1, 0) || find(s, 0, -1)
		|| find(s, 1, 1) || find(s, 1, -1)
		|| find(s, -1, -1) || find(s, -1, 1)) {
		System.out.println((x+1) + " " + (y+1));
		ok = 1;
		break;
	    }
	}
	
    }

	int x, y;
	public boolean find(String s, int dx, int dy) {
	    int cnt = 0;
	    while (true) {
		int i = x + dx*cnt;
		int j = y + dy*cnt;
		cnt++;
		if (cnt >= s.length())
		    return true;
		if (i<0 || i >= m)
		    return false;
		if (j<0 || j >= n)
		    return false;
		if (mat[i][j] != s.charAt(cnt-1))
		    return false;
	    }
	}

    public static void main(String[] args) {
	Uva10010 uva = new Uva10010();
	uva.run();
	return ;
    }
}
