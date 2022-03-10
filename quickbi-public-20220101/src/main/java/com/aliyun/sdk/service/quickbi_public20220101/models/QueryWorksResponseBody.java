// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorksResponseBody</p>
 */
public class QueryWorksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryWorksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksResponseBody create() {
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
         * QueryWorksModel
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

        public QueryWorksResponseBody build() {
            return new QueryWorksResponseBody(this);
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
             * 目录ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 目录名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 目录ID的路径，例如：aa/bb/cc/dd
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * 目录ID的路径名称，例如：一层目录/二层目录
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
        @NameInMap("Auth3rdFlag")
        private Integer auth3rdFlag;

        @NameInMap("Description")
        private String description;

        @NameInMap("Directory")
        private Directory directory;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("ModifyName")
        private String modifyName;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("Status")
        private Integer status;

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
            this.auth3rdFlag = builder.auth3rdFlag;
            this.description = builder.description;
            this.directory = builder.directory;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.modifyName = builder.modifyName;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.securityLevel = builder.securityLevel;
            this.status = builder.status;
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
         * @return auth3rdFlag
         */
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return modifyName
         */
        public String getModifyName() {
            return this.modifyName;
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
            private Integer auth3rdFlag; 
            private String description; 
            private Directory directory; 
            private String gmtCreate; 
            private String gmtModify; 
            private String modifyName; 
            private String ownerId; 
            private String ownerName; 
            private String securityLevel; 
            private Integer status; 
            private String workName; 
            private String workType; 
            private String worksId; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * 第三方嵌入状态
             */
            public Builder auth3rdFlag(Integer auth3rdFlag) {
                this.auth3rdFlag = auth3rdFlag;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 所属空间目录信息
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * 创建时间d
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * 修改显示名称
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * 所有者Id
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * 所有者显示名称
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * 安全策略：0 私有 1 协同编辑。 （
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * 报表发布状态 @PublishStatusEnum
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 作品名称
             */
            public Builder workName(String workName) {
                this.workName = workName;
                return this;
            }

            /**
             * 作品类型
             */
            public Builder workType(String workType) {
                this.workType = workType;
                return this;
            }

            /**
             * 作品ID
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * 所属工作空间
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * 所属空间名称
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
