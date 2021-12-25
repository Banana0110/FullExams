package javatask;

class Main {

    public static void main(String[] args) {
        //массив кругов
        Circle[] arr = new Circle[10];
        //заполняем
        for(int i = 1; i <= 10; i++){
            arr[i-1] = new Circle(i);
        }
        int n = 0; //кол-во кругов площадь которых кратна 3-м
        for(int i = 0; i < 10; i++){
            if((int)arr[i].Area() % 3 == 0){
                n++; //увеличиваем на 1
            }
        }
        System.out.println("Кол-во кругов площадь которых кратна 3-м = " + n);
    }

}
