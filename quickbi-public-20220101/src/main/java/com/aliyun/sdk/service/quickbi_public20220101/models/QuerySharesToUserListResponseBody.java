// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySharesToUserListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySharesToUserListResponseBody</p>
 */
public class QuerySharesToUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private QuerySharesToUserListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySharesToUserListResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Returns a list of works authorized to the user.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySharesToUserListResponseBody build() {
            return new QuerySharesToUserListResponseBody(this);
        } 

    } 

    public static class Directory extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PathId")
        private String pathId;

        @NameInMap("PathName")
        private String pathName;

        private Directory(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.pathId = builder.pathId;
            this.pathName = builder.pathName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pathId
         */
        public String getPathId() {
            return this.pathId;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String pathId; 
            private String pathName; 

            /**
             * The ID of the directory where the resource is located.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The path ID of the directory where the resource is located.
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * The path name of the directory where the resource is located.
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Directory")
        private Directory directory;

        @NameInMap("ModifyName")
        private String modifyName;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("ThirdPartAuthFlag")
        private Integer thirdPartAuthFlag;

        @NameInMap("WorkName")
        private String workName;

        @NameInMap("WorkType")
        private String workType;

        @NameInMap("WorksId")
        private String worksId;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.directory = builder.directory;
            this.modifyName = builder.modifyName;
            this.modifyTime = builder.modifyTime;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.securityLevel = builder.securityLevel;
            this.status = builder.status;
            this.thirdPartAuthFlag = builder.thirdPartAuthFlag;
            this.workName = builder.workName;
            this.workType = builder.workType;
            this.worksId = builder.worksId;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public Directory getDirectory() {
            return this.directory;
        }

        /**
         * @return modifyName
         */
        public String getModifyName() {
            return this.modifyName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return thirdPartAuthFlag
         */
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        /**
         * @return workName
         */
        public String getWorkName() {
            return this.workName;
        }

        /**
         * @return workType
         */
        public String getWorkType() {
            return this.workType;
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
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
            private String createTime; 
            private String description; 
            private Directory directory; 
            private String modifyName; 
            private String modifyTime; 
            private String ownerId; 
            private String ownerName; 
            private String securityLevel; 
            private Integer status; 
            private Integer thirdPartAuthFlag; 
            private String workName; 
            private String workType; 
            private String worksId; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * The timestamp of the creation time in milliseconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Remarks on the work.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Information about the directory where the work is located.
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account to which the modifier belongs.
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * The timestamp of the modification time in milliseconds.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The UserID of the work owner in Quickbi.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The Alibaba Cloud account name of the work owner.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * Security policies for collaborative authorization of works. Valid values:
             * <p>
             * 
             * *   0: private
             * *   12: Authorize specified members
             * *   1 or 11: Authorize all workspace members
             * 
             * > 
             * 
             * *   If you use legacy permissions, the return value is 1.
             * 
             * *   If you use the new permissions, the return value is 11.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * The publishing status of the report. Valid values:
             * <p>
             * 
             * *   0: unpublished
             * *   1: published
             * *   2: modified but not published
             * *   3: unpublished
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Third-party embedding status. Valid values:
             * <p>
             * 
             * *   0: No embedding is enabled.
             * *   1: Embed is enabled.
             */
            public Builder thirdPartAuthFlag(Integer thirdPartAuthFlag) {
                this.thirdPartAuthFlag = thirdPartAuthFlag;
                return this;
            }

            /**
             * The name of the report.
             */
            public Builder workName(String workName) {
                this.workName = workName;
                return this;
            }

            /**
             * The type of the work. Valid values:
             * <p>
             * 
             * *   DATAPRODUCT: BI portal
             * *   PAGE: Dashboard
             * *   FULLPAGE: full-screen dashboards
             * *   REPORT: workbook
             * *   dashboardOfflineQuery: self-service data retrieval
             */
            public Builder workType(String workType) {
                this.workType = workType;
                return this;
            }

            /**
             * The ID of the operations report.
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * The ID of the workspace to which the report belongs.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * The name of the workspace to which the report belongs.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
