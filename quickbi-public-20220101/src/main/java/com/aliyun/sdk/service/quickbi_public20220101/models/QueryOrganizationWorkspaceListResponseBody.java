// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrganizationWorkspaceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrganizationWorkspaceListResponseBody</p>
 */
public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryOrganizationWorkspaceListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationWorkspaceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOrganizationWorkspaceListResponseBody build() {
            return new QueryOrganizationWorkspaceListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AllowPublishOperation")
        private Boolean allowPublishOperation;

        @NameInMap("AllowShareOperation")
        private Boolean allowShareOperation;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("CreateUserAccountName")
        private String createUserAccountName;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModifyUser")
        private String modifyUser;

        @NameInMap("ModifyUserAccountName")
        private String modifyUserAccountName;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("OwnerAccountName")
        private String ownerAccountName;

        @NameInMap("WorkspaceDescription")
        private String workspaceDescription;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.allowPublishOperation = builder.allowPublishOperation;
            this.allowShareOperation = builder.allowShareOperation;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.createUserAccountName = builder.createUserAccountName;
            this.modifiedTime = builder.modifiedTime;
            this.modifyUser = builder.modifyUser;
            this.modifyUserAccountName = builder.modifyUserAccountName;
            this.organizationId = builder.organizationId;
            this.owner = builder.owner;
            this.ownerAccountName = builder.ownerAccountName;
            this.workspaceDescription = builder.workspaceDescription;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowPublishOperation
         */
        public Boolean getAllowPublishOperation() {
            return this.allowPublishOperation;
        }

        /**
         * @return allowShareOperation
         */
        public Boolean getAllowShareOperation() {
            return this.allowShareOperation;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return createUserAccountName
         */
        public String getCreateUserAccountName() {
            return this.createUserAccountName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return modifyUserAccountName
         */
        public String getModifyUserAccountName() {
            return this.modifyUserAccountName;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerAccountName
         */
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        /**
         * @return workspaceDescription
         */
        public String getWorkspaceDescription() {
            return this.workspaceDescription;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Boolean allowPublishOperation; 
            private Boolean allowShareOperation; 
            private String createTime; 
            private String createUser; 
            private String createUserAccountName; 
            private String modifiedTime; 
            private String modifyUser; 
            private String modifyUserAccountName; 
            private String organizationId; 
            private String owner; 
            private String ownerAccountName; 
            private String workspaceDescription; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * AllowPublishOperation.
             */
            public Builder allowPublishOperation(Boolean allowPublishOperation) {
                this.allowPublishOperation = allowPublishOperation;
                return this;
            }

            /**
             * AllowShareOperation.
             */
            public Builder allowShareOperation(Boolean allowShareOperation) {
                this.allowShareOperation = allowShareOperation;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * CreateUserAccountName.
             */
            public Builder createUserAccountName(String createUserAccountName) {
                this.createUserAccountName = createUserAccountName;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * ModifyUserAccountName.
             */
            public Builder modifyUserAccountName(String modifyUserAccountName) {
                this.modifyUserAccountName = modifyUserAccountName;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
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
             * OwnerAccountName.
             */
            public Builder ownerAccountName(String ownerAccountName) {
                this.ownerAccountName = ownerAccountName;
                return this;
            }

            /**
             * WorkspaceDescription.
             */
            public Builder workspaceDescription(String workspaceDescription) {
                this.workspaceDescription = workspaceDescription;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalNum")
        private Integer totalNum;

        @NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 
            private Integer totalPages; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
