// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QuerySharesToUserListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySharesToUserListResponseBody</p>
 */
public class QuerySharesToUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySharesToUserListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns a list of works authorized to the user.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySharesToUserListResponseBody build() {
            return new QuerySharesToUserListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySharesToUserListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySharesToUserListResponseBody</p>
     */
    public static class Directory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PathId")
        private String pathId;

        @com.aliyun.core.annotation.NameInMap("PathName")
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

            private Builder() {
            } 

            private Builder(Directory model) {
                this.id = model.id;
                this.name = model.name;
                this.pathId = model.pathId;
                this.pathName = model.pathName;
            } 

            /**
             * <p>The ID of the directory where the resource is located.</p>
             * 
             * <strong>example:</strong>
             * <p>f7f6e22b-83be-47fd-b49d-9ca686a9****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Chart Report</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path ID of the directory where the resource is located.</p>
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * <p>The path name of the directory where the resource is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Level -1 Directory /Level -2 Directory</p>
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
    /**
     * 
     * {@link QuerySharesToUserListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySharesToUserListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("ModifyName")
        private String modifyName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThirdPartAuthFlag")
        private Integer thirdPartAuthFlag;

        @com.aliyun.core.annotation.NameInMap("WorkName")
        private String workName;

        @com.aliyun.core.annotation.NameInMap("WorkType")
        private String workType;

        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.directory = model.directory;
                this.modifyName = model.modifyName;
                this.modifyTime = model.modifyTime;
                this.ownerId = model.ownerId;
                this.ownerName = model.ownerName;
                this.securityLevel = model.securityLevel;
                this.status = model.status;
                this.thirdPartAuthFlag = model.thirdPartAuthFlag;
                this.workName = model.workName;
                this.workType = model.workType;
                this.worksId = model.worksId;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The timestamp of the creation time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1530078690000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Remarks on the work.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the test report</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Information about the directory where the work is located.</p>
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account to which the modifier belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>13855265****@163.com</p>
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * <p>The timestamp of the modification time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1530078690000</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The UserID of the work owner in Quickbi.</p>
             * 
             * <strong>example:</strong>
             * <p>74f5527216d14e9892245320ebf2****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>w****@aliyun.com</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>Security policies for collaborative authorization of works. Valid values:</p>
             * <ul>
             * <li>0: private</li>
             * <li>12: Authorize specified members</li>
             * <li>1 or 11: Authorize all workspace members</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If you use legacy permissions, the return value is 1.</p>
             * </li>
             * <li><p>If you use the new permissions, the return value is 11.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>The publishing status of the report. Valid values:</p>
             * <ul>
             * <li>0: unpublished</li>
             * <li>1: published</li>
             * <li>2: modified but not published</li>
             * <li>3: unpublished</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Third-party embedding status. Valid values:</p>
             * <ul>
             * <li>0: No embedding is enabled.</li>
             * <li>1: Embed is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder thirdPartAuthFlag(Integer thirdPartAuthFlag) {
                this.thirdPartAuthFlag = thirdPartAuthFlag;
                return this;
            }

            /**
             * <p>The name of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>Test report</p>
             */
            public Builder workName(String workName) {
                this.workName = workName;
                return this;
            }

            /**
             * <p>The type of the work. Valid values:</p>
             * <ul>
             * <li>DATAPRODUCT: BI portal</li>
             * <li>PAGE: Dashboard</li>
             * <li>FULLPAGE: full-screen dashboards</li>
             * <li>REPORT: workbook</li>
             * <li>dashboardOfflineQuery: self-service data retrieval</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATAFORM</p>
             */
            public Builder workType(String workType) {
                this.workType = workType;
                return this;
            }

            /**
             * <p>The ID of the operations report.</p>
             * 
             * <strong>example:</strong>
             * <p>97f7f4c1-543a-4069-8e8d-a56cfcd6****</p>
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the report belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>c5f86ad2-ef53-4c51-8720-162ecfdb****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace to which the report belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Return to Professional Edition</p>
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
