void main(){
    int i, k;
    double P;

    P = 1;
    i = 1;
    while (i <= 3){
        k = 1;
        while (k <= 4 - i){
            P *= (Math.sin(i * k * k) + Math.cos(k * i * i)) /
                    (k * k + i * i);
            k++;
        }
        i++;
    }
    System.out.println("P = " + P);

    P = 1;
    i = 1;
    do {
        k = 1;
        do {
            P *= (Math.sin(i * k * k) + Math.cos(k * i * i)) /
                    (k * k + i * i);
            k++;
        } while (k <= 4 - i);
        i++;
    } while (i <= 3);
    System.out.println("P = " + P);

    P = 1;
    for (i = 1; i <= 3; i++){
        for (k = 1; k <= 4 - i; k++){
            P *= (Math.sin(i * k * k) + Math.cos(k * i * i)) /
                    (k * k + i * i);
        }
    }
    System.out.println("P = " + P);

    P = 1;
    for (i = 3; i >= 1; i--){
        for (k = 4 - i; k >= 1; k--){
            P *= (Math.sin(i * k * k) + Math.cos(k * i * i)) /
                    (k * k + i * i);
        }
    }
    System.out.println("P = " + P);
}