// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryRequest</p>
 */
public class UpdateRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("adminSettingLanguage")
    private String adminSettingLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buildsEnabled")
    private Boolean buildsEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkEmail")
    private Boolean checkEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultBranch")
    private String defaultBranch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("issuesEnabled")
    private Boolean issuesEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mergeRequestsEnabled")
    private Boolean mergeRequestsEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("openCloneDownloadControl")
    private Boolean openCloneDownloadControl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectCloneDownloadMethodList")
    private java.util.List < ProjectCloneDownloadMethodList> projectCloneDownloadMethodList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectCloneDownloadRoleList")
    private java.util.List < ProjectCloneDownloadRoleList> projectCloneDownloadRoleList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("snippetsEnabled")
    private Boolean snippetsEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibilityLevel")
    private Integer visibilityLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wikiEnabled")
    private Boolean wikiEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private UpdateRepositoryRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.adminSettingLanguage = builder.adminSettingLanguage;
        this.avatar = builder.avatar;
        this.buildsEnabled = builder.buildsEnabled;
        this.checkEmail = builder.checkEmail;
        this.defaultBranch = builder.defaultBranch;
        this.description = builder.description;
        this.id = builder.id;
        this.issuesEnabled = builder.issuesEnabled;
        this.mergeRequestsEnabled = builder.mergeRequestsEnabled;
        this.name = builder.name;
        this.openCloneDownloadControl = builder.openCloneDownloadControl;
        this.path = builder.path;
        this.projectCloneDownloadMethodList = builder.projectCloneDownloadMethodList;
        this.projectCloneDownloadRoleList = builder.projectCloneDownloadRoleList;
        this.snippetsEnabled = builder.snippetsEnabled;
        this.visibilityLevel = builder.visibilityLevel;
        this.wikiEnabled = builder.wikiEnabled;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return adminSettingLanguage
     */
    public String getAdminSettingLanguage() {
        return this.adminSettingLanguage;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return buildsEnabled
     */
    public Boolean getBuildsEnabled() {
        return this.buildsEnabled;
    }

    /**
     * @return checkEmail
     */
    public Boolean getCheckEmail() {
        return this.checkEmail;
    }

    /**
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return issuesEnabled
     */
    public Boolean getIssuesEnabled() {
        return this.issuesEnabled;
    }

    /**
     * @return mergeRequestsEnabled
     */
    public Boolean getMergeRequestsEnabled() {
        return this.mergeRequestsEnabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return openCloneDownloadControl
     */
    public Boolean getOpenCloneDownloadControl() {
        return this.openCloneDownloadControl;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return projectCloneDownloadMethodList
     */
    public java.util.List < ProjectCloneDownloadMethodList> getProjectCloneDownloadMethodList() {
        return this.projectCloneDownloadMethodList;
    }

    /**
     * @return projectCloneDownloadRoleList
     */
    public java.util.List < ProjectCloneDownloadRoleList> getProjectCloneDownloadRoleList() {
        return this.projectCloneDownloadRoleList;
    }

    /**
     * @return snippetsEnabled
     */
    public Boolean getSnippetsEnabled() {
        return this.snippetsEnabled;
    }

    /**
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    /**
     * @return wikiEnabled
     */
    public Boolean getWikiEnabled() {
        return this.wikiEnabled;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateRepositoryRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String adminSettingLanguage; 
        private String avatar; 
        private Boolean buildsEnabled; 
        private Boolean checkEmail; 
        private String defaultBranch; 
        private String description; 
        private Long id; 
        private Boolean issuesEnabled; 
        private Boolean mergeRequestsEnabled; 
        private String name; 
        private Boolean openCloneDownloadControl; 
        private String path; 
        private java.util.List < ProjectCloneDownloadMethodList> projectCloneDownloadMethodList; 
        private java.util.List < ProjectCloneDownloadRoleList> projectCloneDownloadRoleList; 
        private Boolean snippetsEnabled; 
        private Integer visibilityLevel; 
        private Boolean wikiEnabled; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepositoryRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.adminSettingLanguage = request.adminSettingLanguage;
            this.avatar = request.avatar;
            this.buildsEnabled = request.buildsEnabled;
            this.checkEmail = request.checkEmail;
            this.defaultBranch = request.defaultBranch;
            this.description = request.description;
            this.id = request.id;
            this.issuesEnabled = request.issuesEnabled;
            this.mergeRequestsEnabled = request.mergeRequestsEnabled;
            this.name = request.name;
            this.openCloneDownloadControl = request.openCloneDownloadControl;
            this.path = request.path;
            this.projectCloneDownloadMethodList = request.projectCloneDownloadMethodList;
            this.projectCloneDownloadRoleList = request.projectCloneDownloadRoleList;
            this.snippetsEnabled = request.snippetsEnabled;
            this.visibilityLevel = request.visibilityLevel;
            this.wikiEnabled = request.wikiEnabled;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * adminSettingLanguage.
         */
        public Builder adminSettingLanguage(String adminSettingLanguage) {
            this.putBodyParameter("adminSettingLanguage", adminSettingLanguage);
            this.adminSettingLanguage = adminSettingLanguage;
            return this;
        }

        /**
         * avatar.
         */
        public Builder avatar(String avatar) {
            this.putBodyParameter("avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * buildsEnabled.
         */
        public Builder buildsEnabled(Boolean buildsEnabled) {
            this.putBodyParameter("buildsEnabled", buildsEnabled);
            this.buildsEnabled = buildsEnabled;
            return this;
        }

        /**
         * checkEmail.
         */
        public Builder checkEmail(Boolean checkEmail) {
            this.putBodyParameter("checkEmail", checkEmail);
            this.checkEmail = checkEmail;
            return this;
        }

        /**
         * defaultBranch.
         */
        public Builder defaultBranch(String defaultBranch) {
            this.putBodyParameter("defaultBranch", defaultBranch);
            this.defaultBranch = defaultBranch;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * issuesEnabled.
         */
        public Builder issuesEnabled(Boolean issuesEnabled) {
            this.putBodyParameter("issuesEnabled", issuesEnabled);
            this.issuesEnabled = issuesEnabled;
            return this;
        }

        /**
         * mergeRequestsEnabled.
         */
        public Builder mergeRequestsEnabled(Boolean mergeRequestsEnabled) {
            this.putBodyParameter("mergeRequestsEnabled", mergeRequestsEnabled);
            this.mergeRequestsEnabled = mergeRequestsEnabled;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * openCloneDownloadControl.
         */
        public Builder openCloneDownloadControl(Boolean openCloneDownloadControl) {
            this.putBodyParameter("openCloneDownloadControl", openCloneDownloadControl);
            this.openCloneDownloadControl = openCloneDownloadControl;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * projectCloneDownloadMethodList.
         */
        public Builder projectCloneDownloadMethodList(java.util.List < ProjectCloneDownloadMethodList> projectCloneDownloadMethodList) {
            this.putBodyParameter("projectCloneDownloadMethodList", projectCloneDownloadMethodList);
            this.projectCloneDownloadMethodList = projectCloneDownloadMethodList;
            return this;
        }

        /**
         * projectCloneDownloadRoleList.
         */
        public Builder projectCloneDownloadRoleList(java.util.List < ProjectCloneDownloadRoleList> projectCloneDownloadRoleList) {
            this.putBodyParameter("projectCloneDownloadRoleList", projectCloneDownloadRoleList);
            this.projectCloneDownloadRoleList = projectCloneDownloadRoleList;
            return this;
        }

        /**
         * snippetsEnabled.
         */
        public Builder snippetsEnabled(Boolean snippetsEnabled) {
            this.putBodyParameter("snippetsEnabled", snippetsEnabled);
            this.snippetsEnabled = snippetsEnabled;
            return this;
        }

        /**
         * visibilityLevel.
         */
        public Builder visibilityLevel(Integer visibilityLevel) {
            this.putBodyParameter("visibilityLevel", visibilityLevel);
            this.visibilityLevel = visibilityLevel;
            return this;
        }

        /**
         * wikiEnabled.
         */
        public Builder wikiEnabled(Boolean wikiEnabled) {
            this.putBodyParameter("wikiEnabled", wikiEnabled);
            this.wikiEnabled = wikiEnabled;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateRepositoryRequest build() {
            return new UpdateRepositoryRequest(this);
        } 

    } 

    public static class ProjectCloneDownloadMethodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowed")
        private Boolean allowed;

        @com.aliyun.core.annotation.NameInMap("permissionCode")
        private String permissionCode;

        private ProjectCloneDownloadMethodList(Builder builder) {
            this.allowed = builder.allowed;
            this.permissionCode = builder.permissionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectCloneDownloadMethodList create() {
            return builder().build();
        }

        /**
         * @return allowed
         */
        public Boolean getAllowed() {
            return this.allowed;
        }

        /**
         * @return permissionCode
         */
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public static final class Builder {
            private Boolean allowed; 
            private String permissionCode; 

            /**
             * allowed.
             */
            public Builder allowed(Boolean allowed) {
                this.allowed = allowed;
                return this;
            }

            /**
             * permissionCode.
             */
            public Builder permissionCode(String permissionCode) {
                this.permissionCode = permissionCode;
                return this;
            }

            public ProjectCloneDownloadMethodList build() {
                return new ProjectCloneDownloadMethodList(this);
            } 

        } 

    }
    public static class ProjectCloneDownloadRoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowed")
        private Boolean allowed;

        @com.aliyun.core.annotation.NameInMap("roleCode")
        private Integer roleCode;

        private ProjectCloneDownloadRoleList(Builder builder) {
            this.allowed = builder.allowed;
            this.roleCode = builder.roleCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectCloneDownloadRoleList create() {
            return builder().build();
        }

        /**
         * @return allowed
         */
        public Boolean getAllowed() {
            return this.allowed;
        }

        /**
         * @return roleCode
         */
        public Integer getRoleCode() {
            return this.roleCode;
        }

        public static final class Builder {
            private Boolean allowed; 
            private Integer roleCode; 

            /**
             * allowed.
             */
            public Builder allowed(Boolean allowed) {
                this.allowed = allowed;
                return this;
            }

            /**
             * roleCode.
             */
            public Builder roleCode(Integer roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            public ProjectCloneDownloadRoleList build() {
                return new ProjectCloneDownloadRoleList(this);
            } 

        } 

    }
}
