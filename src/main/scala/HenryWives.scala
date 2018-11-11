object HenryWives{
  def survived (name: String, marriage: Int):Boolean ={
    //(name == "Catherine" && marriage >=2) || (name == "Anne" && marriage <=1)

//            name match {
//              case "Catherine" => marriage match {
//                case 1 => false
//                case _ => true
//              }
//              case "Anne" => marriage match {
//                case 1 => true
//                case _ => false
//              }
//              case _ => false
//            }
            name match{
              case "Catherine" if marriage >= 2  => true
              case "Anne" if marriage <= 1 => true
              case _ => false
            }

  }
}
