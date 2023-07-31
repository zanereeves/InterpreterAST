//package main.com.interpreter.lox;
//class AstPrinter implements Expr.Visitor<String> {
//    String print(Expr expr) {
//        return expr.accept(this);
//    }
//    @Override
//    public String visitBinaryExpr(Expr.Binary expr) {
//        return parenthesize(expr.operator.lexeme,
//                expr.left, expr.right);
//    }
//
//    public String visitLogicalExpr(Expr.Logical expr) {
//        return "stuff so no explosion happens";
//    }
//
//    @Override
//    public String visitGroupingExpr(Expr.Grouping expr) {
//        return parenthesize("group", expr.expression);
//    }
//
//    @Override
//    public String visitLiteralExpr(Expr.Literal expr) {
//        if (expr.value == null) return "nil";
//        return expr.value.toString();
//    }
//    public String visitAssignExpr(Expr.Assign expr) {
//        return "this is here so i dont get screamed at by console";
//    }
//
//    public String visitVariableExpr(Expr.Variable expr) {
//        return "this is here so i dont get screamed at by console";
//    }
//
//    @Override
//    public String visitUnaryExpr(Expr.Unary expr) {
//        return parenthesize(expr.operator.lexeme, expr.right);
//    }
//
//    private String parenthesize(String name, Expr... exprs) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("(").append(name);
//        for (Expr expr : exprs) {
//            builder.append(" ");
//            builder.append(expr.accept(this));
//        }
//        builder.append(")");
//        return builder.toString();
//    }
//
//
//}
//
