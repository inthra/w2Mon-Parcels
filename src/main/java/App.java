// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;
//
// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/index.vtl");
//
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/results", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/results.vtl");
//
//       int inputtedSide1 = Integer.parseInt(request.queryParams("side1"));
//       int inputtedSide2 = Integer.parseInt(request.queryParams("side2"));
//       int inputtedSide3 = Integer.parseInt(request.queryParams("side3"));
//
//       Triangle myTriangle = new Triangle(inputtedSide1, inputtedSide2, inputtedSide3);
//       model.put("myTriangle", myTriangle);
//
//       if (myTriangle.isTriangle()) {
//         if (myTriangle.isEquilateral()) {
//           model.put("myTriangleType", "Equilateral");
//         } else if (myTriangle.isIsosceles()) {
//           model.put("myTriangleType", "Isosceles");
//         } else {
//           model.put("myTriangleType", "Scalene");
//         }
//       } else {
//         model.put("myTriangle", "not a Triangle");
//       }
//
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//   }
// }
