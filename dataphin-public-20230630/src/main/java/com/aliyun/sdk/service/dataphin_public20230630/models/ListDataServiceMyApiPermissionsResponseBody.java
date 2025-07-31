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
 * {@link ListDataServiceMyApiPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceMyApiPermissionsResponseBody</p>
 */
public class ListDataServiceMyApiPermissionsResponseBody extends TeaModel {
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

    private ListDataServiceMyApiPermissionsResponseBody(Builder builder) {
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

    public static ListDataServiceMyApiPermissionsResponseBody create() {
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

        private Builder(ListDataServiceMyApiPermissionsResponseBody model) {
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

        public ListDataServiceMyApiPermissionsResponseBody build() {
            return new ListDataServiceMyApiPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceMyApiPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceMyApiPermissionsResponseBody</p>
     */
    public static class PermissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

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

        @com.aliyun.core.annotation.NameInMap("Role")
        private Integer role;

        private PermissionList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.createUserName = builder.createUserName;
            this.creator = builder.creator;
            this.owner = builder.owner;
            this.ownerUserName = builder.ownerUserName;
            this.privilegeBelongTo = builder.privilegeBelongTo;
            this.privilegeFrom = builder.privilegeFrom;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
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
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private String createUserName; 
            private String creator; 
            private String owner; 
            private String ownerUserName; 
            private String privilegeBelongTo; 
            private Integer privilegeFrom; 
            private Integer projectId; 
            private String projectName; 
            private Integer role; 

            private Builder() {
            } 

            private Builder(PermissionList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.createUserName = model.createUserName;
                this.creator = model.creator;
                this.owner = model.owner;
                this.ownerUserName = model.ownerUserName;
                this.privilegeBelongTo = model.privilegeBelongTo;
                this.privilegeFrom = model.privilegeFrom;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.role = model.role;
            } 

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
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
     * {@link ListDataServiceMyApiPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceMyApiPermissionsResponseBody</p>
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
