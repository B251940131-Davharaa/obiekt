package lb6;

class matrix {
    
    private int[][] operand1;
    private int[][] operand2;
    private String operator;

    
    public matrix(int[][] operand1, int[][] operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

   
    private int[][] addition(int[][] o1, int[][] o2) {
        int rows = o1.length;
        int cols = o1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = o1[i][j] + o2[i][j];
            }
        }
        return result;
    }

   
    private int[][] subtraction(int[][] o1, int[][] o2) {
        int rows = o1.length;
        int cols = o1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = o1[i][j] - o2[i][j];
            }
        }
        return result;
    }

    
    private int[][] multiplication(int[][] o1, int[][] o2) {
        int rows1 = o1.length;
        int cols1 = o1[0].length;
        int cols2 = o2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += o1[i][k] * o2[k][j];
                }
            }
        }
        return result;
    }

   
    public void calculateAndPrint() {
        int[][] result = null;
        String opName = "";

        if (operator.equals("+")) {
            result = addition(operand1, operand2);
            opName = "Addition";
        } else if (operator.equals("-")) {
            result = subtraction(operand1, operand2);
            opName = "Subtraction";
        } else if (operator.equals("*")) {
            result = multiplication(operand1, operand2);
            opName = "Multipliction"; 

        if (result != null) {
            System.out.println(opName + " Matrix is: Size(" + result.length + "x" + result[0].length + ")");
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}
}