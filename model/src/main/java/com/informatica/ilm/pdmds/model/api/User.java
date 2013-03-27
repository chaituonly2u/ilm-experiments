package com.informatica.ilm.pdmds.model.api;

public interface User extends ILMObject {

    long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    int getVersion();

    void setVersion(int version);

    String getDescription();

    void setDescription(String description);

    String getDomainname();

    void setDomainname(String domainname);

    String getFullname();

    void setFullname(String fullname);

    String getEmail();

    void setEmail(String email);

    String getPhone();

    void setPhone(String phone);

    boolean isAdmin();

    void setAdmin(boolean admin);

    String getNamespace();

    void setNamespace(String namespace);

    UserStatus getStatus();

    void setStatus(UserStatus status);

    String getPassword();

    void setPassword(String password);

}
