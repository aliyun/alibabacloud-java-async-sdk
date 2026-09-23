// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataServiceAuthorizedAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceAuthorizedAppsResponseBody</p>
 */
public class ListDataServiceAuthorizedAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataServiceAuthorizedAppsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceAuthorizedAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataServiceAuthorizedAppsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paging query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServiceAuthorizedAppsResponseBody build() {
            return new ListDataServiceAuthorizedAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceAuthorizedAppsResponseBody</p>
     */
    public static class RemarkForDebugList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RemarkForDebugList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemarkForDebugList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(RemarkForDebugList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RemarkForDebugList build() {
                return new RemarkForDebugList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceAuthorizedAppsResponseBody</p>
     */
    public static class AuthorizedAppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ApplyUserId")
        private String applyUserId;

        @com.aliyun.core.annotation.NameInMap("ApplyUserName")
        private String applyUserName;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("IsProjectManager")
        private Boolean isProjectManager;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerUserName")
        private String ownerUserName;

        @com.aliyun.core.annotation.NameInMap("PrivilegeAccount")
        private Integer privilegeAccount;

        @com.aliyun.core.annotation.NameInMap("PrivilegeType")
        private Integer privilegeType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RealHasOwnerPrivilege")
        private Boolean realHasOwnerPrivilege;

        @com.aliyun.core.annotation.NameInMap("RealHasPrivilege")
        private Boolean realHasPrivilege;

        @com.aliyun.core.annotation.NameInMap("RemarkForDebugList")
        private java.util.List<RemarkForDebugList> remarkForDebugList;

        @com.aliyun.core.annotation.NameInMap("Revocable")
        private Boolean revocable;

        @com.aliyun.core.annotation.NameInMap("RevocableDetail")
        private Integer revocableDetail;

        private AuthorizedAppList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.applyUserId = builder.applyUserId;
            this.applyUserName = builder.applyUserName;
            this.expireDate = builder.expireDate;
            this.id = builder.id;
            this.isProjectManager = builder.isProjectManager;
            this.owner = builder.owner;
            this.ownerUserName = builder.ownerUserName;
            this.privilegeAccount = builder.privilegeAccount;
            this.privilegeType = builder.privilegeType;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.realHasOwnerPrivilege = builder.realHasOwnerPrivilege;
            this.realHasPrivilege = builder.realHasPrivilege;
            this.remarkForDebugList = builder.remarkForDebugList;
            this.revocable = builder.revocable;
            this.revocableDetail = builder.revocableDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedAppList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return applyUserId
         */
        public String getApplyUserId() {
            return this.applyUserId;
        }

        /**
         * @return applyUserName
         */
        public String getApplyUserName() {
            return this.applyUserName;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isProjectManager
         */
        public Boolean getIsProjectManager() {
            return this.isProjectManager;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerUserName
         */
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        /**
         * @return privilegeAccount
         */
        public Integer getPrivilegeAccount() {
            return this.privilegeAccount;
        }

        /**
         * @return privilegeType
         */
        public Integer getPrivilegeType() {
            return this.privilegeType;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return realHasOwnerPrivilege
         */
        public Boolean getRealHasOwnerPrivilege() {
            return this.realHasOwnerPrivilege;
        }

        /**
         * @return realHasPrivilege
         */
        public Boolean getRealHasPrivilege() {
            return this.realHasPrivilege;
        }

        /**
         * @return remarkForDebugList
         */
        public java.util.List<RemarkForDebugList> getRemarkForDebugList() {
            return this.remarkForDebugList;
        }

        /**
         * @return revocable
         */
        public Boolean getRevocable() {
            return this.revocable;
        }

        /**
         * @return revocableDetail
         */
        public Integer getRevocableDetail() {
            return this.revocableDetail;
        }

        public static final class Builder {
            private Integer appId; 
            private String appName; 
            private String applyUserId; 
            private String applyUserName; 
            private String expireDate; 
            private Integer id; 
            private Boolean isProjectManager; 
            private String owner; 
            private String ownerUserName; 
            private Integer privilegeAccount; 
            private Integer privilegeType; 
            private Integer projectId; 
            private String projectName; 
            private Boolean realHasOwnerPrivilege; 
            private Boolean realHasPrivilege; 
            private java.util.List<RemarkForDebugList> remarkForDebugList; 
            private Boolean revocable; 
            private Integer revocableDetail; 

            private Builder() {
            } 

            private Builder(AuthorizedAppList model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.applyUserId = model.applyUserId;
                this.applyUserName = model.applyUserName;
                this.expireDate = model.expireDate;
                this.id = model.id;
                this.isProjectManager = model.isProjectManager;
                this.owner = model.owner;
                this.ownerUserName = model.ownerUserName;
                this.privilegeAccount = model.privilegeAccount;
                this.privilegeType = model.privilegeType;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.realHasOwnerPrivilege = model.realHasOwnerPrivilege;
                this.realHasPrivilege = model.realHasPrivilege;
                this.remarkForDebugList = model.remarkForDebugList;
                this.revocable = model.revocable;
                this.revocableDetail = model.revocableDetail;
            } 

            /**
             * <p>The primary key ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1022</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the permission account, which is the applicant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30012101</p>
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * <p>The permission account, which is the applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder applyUserName(String applyUserName) {
                this.applyUserName = applyUserName;
                return this;
            }

            /**
             * <p>The expiration date in the format of yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1121</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the current user is a project administrator.</p>
             */
            public Builder isProjectManager(Boolean isProjectManager) {
                this.isProjectManager = isProjectManager;
                return this;
            }

            /**
             * <p>The ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1121</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ownerUserName(String ownerUserName) {
                this.ownerUserName = ownerUserName;
                return this;
            }

            /**
             * <p>The permission account. Valid values: 0: individual account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder privilegeAccount(Integer privilegeAccount) {
                this.privilegeAccount = privilegeAccount;
                return this;
            }

            /**
             * <p>The permission type. Valid values: 0: usage permission. 1: development permission.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder privilegeType(Integer privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>102122</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Indicates whether the user actually has owner permissions on this application. The user may lack permissions because of expiration or other reasons.</p>
             */
            public Builder realHasOwnerPrivilege(Boolean realHasOwnerPrivilege) {
                this.realHasOwnerPrivilege = realHasOwnerPrivilege;
                return this;
            }

            /**
             * <p>Indicates whether the user actually has permissions.</p>
             */
            public Builder realHasPrivilege(Boolean realHasPrivilege) {
                this.realHasPrivilege = realHasPrivilege;
                return this;
            }

            /**
             * <p>The descriptions used for troubleshooting.</p>
             */
            public Builder remarkForDebugList(java.util.List<RemarkForDebugList> remarkForDebugList) {
                this.remarkForDebugList = remarkForDebugList;
                return this;
            }

            /**
             * <p>Indicates whether the permissions can be returned or revoked.</p>
             */
            public Builder revocable(Boolean revocable) {
                this.revocable = revocable;
                return this;
            }

            /**
             * <p>The detailed status of the revoke button. Valid values: -1: super administrators cannot revoke. -2: owners cannot revoke. -3: project administrators without actual permissions are grayed out. -4: regular users without permissions cannot revoke. 1: project administrators with actual permissions can revoke. 2: regular users with permissions can revoke.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder revocableDetail(Integer revocableDetail) {
                this.revocableDetail = revocableDetail;
                return this;
            }

            public AuthorizedAppList build() {
                return new AuthorizedAppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceAuthorizedAppsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedAppList")
        private java.util.List<AuthorizedAppList> authorizedAppList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.authorizedAppList = builder.authorizedAppList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return authorizedAppList
         */
        public java.util.List<AuthorizedAppList> getAuthorizedAppList() {
            return this.authorizedAppList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AuthorizedAppList> authorizedAppList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.authorizedAppList = model.authorizedAppList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paginated list of authorized applications.</p>
             */
            public Builder authorizedAppList(java.util.List<AuthorizedAppList> authorizedAppList) {
                this.authorizedAppList = authorizedAppList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
