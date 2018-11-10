object HenryWives{
  def survived (name: String, marriage: Int):Boolean ={
    //(name == "Catherine" && marriage >=2) || (name == "Anne" && marriage <=1)

            name match {
              case "Catherine" => marriage match {
                case 1 => false
                case _ => true
              }
              case "Anne" => marriage match {
                case 1 => true
                case _ => false
              }
              case _ => false
            }


  }
}
