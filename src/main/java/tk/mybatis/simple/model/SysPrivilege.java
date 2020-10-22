package tk.mybatis.simple.model;

public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String getPrivilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getGetPrivilegeUrl() {
        return getPrivilegeUrl;
    }

    public void setGetPrivilegeUrl(String getPrivilegeUrl) {
        this.getPrivilegeUrl = getPrivilegeUrl;
    }
}
