package com.cg.entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="PHONE_USER")
public class Phoneuser {
	 @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
        private int userid;
        private String useremail;
        private String username;
        @OneToMany(cascade=CascadeType.ALL)
        @JoinColumn(name="USERID")
        private List<Phone> phoneTables;
        public int getUserid() {
                return userid;
        }
        public void setUserid(int userid) {
                this.userid = userid;
        }
        public String getUseremail() {
                return useremail;
        }
        @Override
		public String toString() {
			return "Phoneuser [userid=" + userid + ", useremail=" + useremail + ", username=" + username
					+ ", phoneTables=" + phoneTables + "]";
		}
		public void setUseremail(String useremail) {
                this.useremail = useremail;
        }
        public String getUsername() {
                return username;
        }
        public void setUsername(String username) {
                this.username = username;
        }
        public List<Phone> getPhoneTables() {
                return phoneTables;
        }
        public void setPhoneTables(List<Phone> phoneTables) {
                this.phoneTables = phoneTables;
        }
}
