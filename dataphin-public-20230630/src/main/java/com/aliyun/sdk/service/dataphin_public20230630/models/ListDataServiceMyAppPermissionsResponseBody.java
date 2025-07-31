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
 * {@link ListDataServiceMyAppPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceMyAppPermissionsResponseBody</p>
 */
public class ListDataServiceMyAppPermissionsResponseBody extends TeaModel {
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

    private ListDataServiceMyAppPermissionsResponseBody(Builder builder) {
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

    public static ListDataServiceMyAppPermissionsResponseBody create() {
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

        private Builder(ListDataServiceMyAppPermissionsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServiceMyAppPermissionsResponseBody build() {
            return new ListDataServiceMyAppPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceMyAppPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceMyAppPermissionsResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link ListDataServiceMyAppPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceMyAppPermissionsResponseBody</p>
     */
    public static class PermissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CurrentUserRole")
        private String currentUserRole;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerUserName")
        private String ownerUserName;

        @com.aliyun.core.annotation.NameInMap("PrivilegeBelongTo")
        private String privilegeBelongTo;

        @com.aliyun.core.annotation.NameInMap("PrivilegeFrom")
        private Integer privilegeFrom;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RemarkForDebugList")
        private java.util.List<RemarkForDebugList> remarkForDebugList;

        @com.aliyun.core.annotation.NameInMap("Role")
        private Integer role;

        private PermissionList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createUserName = builder.createUserName;
            this.creator = builder.creator;
            this.currentUserRole = builder.currentUserRole;
            this.owner = builder.owner;
            this.ownerUserName = builder.ownerUserName;
            this.privilegeBelongTo = builder.privilegeBelongTo;
            this.privilegeFrom = builder.privilegeFrom;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.remarkForDebugList = builder.remarkForDebugList;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionList create() {
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
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return currentUserRole
         */
        public String getCurrentUserRole() {
            return this.currentUserRole;
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
         * @return privilegeBelongTo
         */
        public String getPrivilegeBelongTo() {
            return this.privilegeBelongTo;
        }

        /**
         * @return privilegeFrom
         */
        public Integer getPrivilegeFrom() {
            return this.privilegeFrom;
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
         * @return remarkForDebugList
         */
        public java.util.List<RemarkForDebugList> getRemarkForDebugList() {
            return this.remarkForDebugList;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        public static final class Builder {
            private Integer appId; 
            private String appName; 
            private String createUserName; 
            private String creator; 
            private String currentUserRole; 
            private String owner; 
            private String ownerUserName; 
            private String privilegeBelongTo; 
            private Integer privilegeFrom; 
            private Integer projectId; 
            private String projectName; 
            private java.util.List<RemarkForDebugList> remarkForDebugList; 
            private Integer role; 

            private Builder() {
            } 

            private Builder(PermissionList model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.createUserName = model.createUserName;
                this.creator = model.creator;
                this.currentUserRole = model.currentUserRole;
                this.owner = model.owner;
                this.ownerUserName = model.ownerUserName;
                this.privilegeBelongTo = model.privilegeBelongTo;
                this.privilegeFrom = model.privilegeFrom;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.remarkForDebugList = model.remarkForDebugList;
                this.role = model.role;
            } 

            /**
             * <p>AppId</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CurrentUserRole.
             */
            public Builder currentUserRole(String currentUserRole) {
                this.currentUserRole = currentUserRole;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerUserName.
             */
            public Builder ownerUserName(String ownerUserName) {
                this.ownerUserName = ownerUserName;
                return this;
            }

            /**
             * PrivilegeBelongTo.
             */
            public Builder privilegeBelongTo(String privilegeBelongTo) {
                this.privilegeBelongTo = privilegeBelongTo;
                return this;
            }

            /**
             * PrivilegeFrom.
             */
            public Builder privilegeFrom(Integer privilegeFrom) {
                this.privilegeFrom = privilegeFrom;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * RemarkForDebugList.
             */
            public Builder remarkForDebugList(java.util.List<RemarkForDebugList> remarkForDebugList) {
                this.remarkForDebugList = remarkForDebugList;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            public PermissionList build() {
                return new PermissionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceMyAppPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceMyAppPermissionsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermissionList")
        private java.util.List<PermissionList> permissionList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.permissionList = builder.permissionList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return permissionList
         */
        public java.util.List<PermissionList> getPermissionList() {
            return this.permissionList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<PermissionList> permissionList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.permissionList = model.permissionList;
                this.totalCount = model.totalCount;
            } 

            /**
             * PermissionList.
             */
            public Builder permissionList(java.util.List<PermissionList> permissionList) {
                this.permissionList = permissionList;
                return this;
            }

            /**
             * TotalCount.
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
