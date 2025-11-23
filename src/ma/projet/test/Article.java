package ma.projet.test;

public class Article {
	
	 private static int compteur = 0;
	    private final int id;
	    private int code;
	    private String designation;
	    private Categorie categorie;
		/**
		 * @param code
		 * @param designation
		 * @param categorie
		 */
		public Article(int code, String designation, Categorie categorie) {
			this.id= compteur++;
			this.code = code;
			this.designation = designation;
			this.categorie = categorie;
		}
		public int getId() {
			return id;
		}
		public int getCode() {
			return code;
		}
		public String getDesignation() {
			return designation;
		}
		public Categorie getCategorie() {
			return categorie;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}
		@Override
		public String toString() {
			return "Article [id=" + id + ", code=" + code + ", designation=" + designation + ", categorie=" + categorie
					+ "]";
		}
		
		
	    
	    
}
