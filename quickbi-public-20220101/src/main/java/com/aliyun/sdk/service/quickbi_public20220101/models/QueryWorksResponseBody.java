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
 * {@link QueryWorksResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorksResponseBody</p>
 */
public class QueryWorksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryWorksResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the work.</p>
         */
        public Builder result(Result result) {
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

        public QueryWorksResponseBody build() {
            return new QueryWorksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWorksResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorksResponseBody</p>
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
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>Test directory</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The hierarchical structure of the directory ID to which the directory belongs. Separate the hierarchical structure with a /.</p>
             * 
             * <strong>example:</strong>
             * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * <p>The hierarchical structure of the directory to which the directory belongs. Separate the hierarchical structure with a (/).</p>
             * 
             * <strong>example:</strong>
             * <p>Test directory</p>
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
     * {@link QueryWorksResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auth3rdFlag")
        private Integer auth3rdFlag;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("ModifyName")
        private String modifyName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("PublicFlag")
        private Boolean publicFlag;

        @com.aliyun.core.annotation.NameInMap("PublicInvalidTime")
        private Long publicInvalidTime;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

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
            this.auth3rdFlag = builder.auth3rdFlag;
            this.description = builder.description;
            this.directory = builder.directory;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.modifyName = builder.modifyName;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.publicFlag = builder.publicFlag;
            this.publicInvalidTime = builder.publicInvalidTime;
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
         * @return publicFlag
         */
        public Boolean getPublicFlag() {
            return this.publicFlag;
        }

        /**
         * @return publicInvalidTime
         */
        public Long getPublicInvalidTime() {
            return this.publicInvalidTime;
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
            private Boolean publicFlag; 
            private Long publicInvalidTime; 
            private String securityLevel; 
            private Integer status; 
            private String workName; 
            private String workType; 
            private String worksId; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.auth3rdFlag = model.auth3rdFlag;
                this.description = model.description;
                this.directory = model.directory;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.modifyName = model.modifyName;
                this.ownerId = model.ownerId;
                this.ownerName = model.ownerName;
                this.publicFlag = model.publicFlag;
                this.publicInvalidTime = model.publicInvalidTime;
                this.securityLevel = model.securityLevel;
                this.status = model.status;
                this.workName = model.workName;
                this.workType = model.workType;
                this.worksId = model.worksId;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>Third-party embedding status. Valid values:</p>
             * <ul>
             * <li>0: The embed service is not enabled.</li>
             * <li>1: Embed is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder auth3rdFlag(Integer auth3rdFlag) {
                this.auth3rdFlag = auth3rdFlag;
                return this;
            }

            /**
             * <p>Remarks on the work.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The directory to which the work belongs.</p>
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The timestamp of the creation of the work in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1496651577000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp of the modification of the work in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1496651577000</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the person who modified the work.</p>
             * 
             * <strong>example:</strong>
             * <p>Tom</p>
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * <p>The user ID of the work owner in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>9187a612aa474e2a8ac1414d5529****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>Tom</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>Is it public</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicFlag(Boolean publicFlag) {
                this.publicFlag = publicFlag;
                return this;
            }

            /**
             * <p>Deadline for the public release of the report</p>
             * 
             * <strong>example:</strong>
             * <p>1721366354000</p>
             */
            public Builder publicInvalidTime(Long publicInvalidTime) {
                this.publicInvalidTime = publicInvalidTime;
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
             * <p>The status of the report. Valid values:</p>
             * <ul>
             * <li>0: unpublished</li>
             * <li>1: published</li>
             * <li>2: modified but not published</li>
             * <li>3: unpublished</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>Test report</p>
             */
            public Builder workName(String workName) {
                this.workName = workName;
                return this;
            }

            /**
             * <p>Queries the types of works. Fill in the blanks to query all types. Valid values:</p>
             * <ul>
             * <li>DATAPRODUCT: BI portal</li>
             * <li>PAGE: Dashboard</li>
             * <li>FULLPAGE: full-screen dashboards</li>
             * <li>REPORT: workbook</li>
             * <li>dashboardOfflineQuery: self-service data retrieval</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PAGE</p>
             */
            public Builder workType(String workType) {
                this.workType = workType;
                return this;
            }

            /**
             * <p>The ID of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the work belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace to which the work belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Space</p>
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
