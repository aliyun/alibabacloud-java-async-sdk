// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineBuildsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineBuildsResponseBody</p>
 */
public class ListRoutineBuildsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private ListRoutineBuildsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineBuildsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageIndex; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(ListRoutineBuildsResponseBody model) {
            this.data = model.data;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The list of ER build tasks.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number, which is the same as the PageIndex request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListRoutineBuildsResponseBody build() {
            return new ListRoutineBuildsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineBuildsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineBuildsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetsDirectory")
        private String assetsDirectory;

        @com.aliyun.core.annotation.NameInMap("Branch")
        private String branch;

        @com.aliyun.core.annotation.NameInMap("BuildCommand")
        private String buildCommand;

        @com.aliyun.core.annotation.NameInMap("CommitId")
        private String commitId;

        @com.aliyun.core.annotation.NameInMap("CommitMessage")
        private String commitMessage;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
        private java.util.Map<String, String> environmentVariables;

        @com.aliyun.core.annotation.NameInMap("GitAccountId")
        private Long gitAccountId;

        @com.aliyun.core.annotation.NameInMap("GitAccountName")
        private String gitAccountName;

        @com.aliyun.core.annotation.NameInMap("InstallCommand")
        private String installCommand;

        @com.aliyun.core.annotation.NameInMap("IsPrivate")
        private Boolean isPrivate;

        @com.aliyun.core.annotation.NameInMap("NodeVersion")
        private String nodeVersion;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        @com.aliyun.core.annotation.NameInMap("PipelineRunId")
        private Long pipelineRunId;

        @com.aliyun.core.annotation.NameInMap("ProductionBranch")
        private String productionBranch;

        @com.aliyun.core.annotation.NameInMap("Repository")
        private String repository;

        @com.aliyun.core.annotation.NameInMap("RootDirectory")
        private String rootDirectory;

        @com.aliyun.core.annotation.NameInMap("RoutineBuildId")
        private Long routineBuildId;

        @com.aliyun.core.annotation.NameInMap("RoutineEntry")
        private String routineEntry;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.assetsDirectory = builder.assetsDirectory;
            this.branch = builder.branch;
            this.buildCommand = builder.buildCommand;
            this.commitId = builder.commitId;
            this.commitMessage = builder.commitMessage;
            this.createTime = builder.createTime;
            this.environmentVariables = builder.environmentVariables;
            this.gitAccountId = builder.gitAccountId;
            this.gitAccountName = builder.gitAccountName;
            this.installCommand = builder.installCommand;
            this.isPrivate = builder.isPrivate;
            this.nodeVersion = builder.nodeVersion;
            this.pipelineId = builder.pipelineId;
            this.pipelineRunId = builder.pipelineRunId;
            this.productionBranch = builder.productionBranch;
            this.repository = builder.repository;
            this.rootDirectory = builder.rootDirectory;
            this.routineBuildId = builder.routineBuildId;
            this.routineEntry = builder.routineEntry;
            this.routineName = builder.routineName;
            this.status = builder.status;
            this.templateName = builder.templateName;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetsDirectory
         */
        public String getAssetsDirectory() {
            return this.assetsDirectory;
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return buildCommand
         */
        public String getBuildCommand() {
            return this.buildCommand;
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return commitMessage
         */
        public String getCommitMessage() {
            return this.commitMessage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return environmentVariables
         */
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        /**
         * @return gitAccountId
         */
        public Long getGitAccountId() {
            return this.gitAccountId;
        }

        /**
         * @return gitAccountName
         */
        public String getGitAccountName() {
            return this.gitAccountName;
        }

        /**
         * @return installCommand
         */
        public String getInstallCommand() {
            return this.installCommand;
        }

        /**
         * @return isPrivate
         */
        public Boolean getIsPrivate() {
            return this.isPrivate;
        }

        /**
         * @return nodeVersion
         */
        public String getNodeVersion() {
            return this.nodeVersion;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineRunId
         */
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return productionBranch
         */
        public String getProductionBranch() {
            return this.productionBranch;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return rootDirectory
         */
        public String getRootDirectory() {
            return this.rootDirectory;
        }

        /**
         * @return routineBuildId
         */
        public Long getRoutineBuildId() {
            return this.routineBuildId;
        }

        /**
         * @return routineEntry
         */
        public String getRoutineEntry() {
            return this.routineEntry;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String assetsDirectory; 
            private String branch; 
            private String buildCommand; 
            private String commitId; 
            private String commitMessage; 
            private String createTime; 
            private java.util.Map<String, String> environmentVariables; 
            private Long gitAccountId; 
            private String gitAccountName; 
            private String installCommand; 
            private Boolean isPrivate; 
            private String nodeVersion; 
            private Long pipelineId; 
            private Long pipelineRunId; 
            private String productionBranch; 
            private String repository; 
            private String rootDirectory; 
            private Long routineBuildId; 
            private String routineEntry; 
            private String routineName; 
            private String status; 
            private String templateName; 
            private String updateTime; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetsDirectory = model.assetsDirectory;
                this.branch = model.branch;
                this.buildCommand = model.buildCommand;
                this.commitId = model.commitId;
                this.commitMessage = model.commitMessage;
                this.createTime = model.createTime;
                this.environmentVariables = model.environmentVariables;
                this.gitAccountId = model.gitAccountId;
                this.gitAccountName = model.gitAccountName;
                this.installCommand = model.installCommand;
                this.isPrivate = model.isPrivate;
                this.nodeVersion = model.nodeVersion;
                this.pipelineId = model.pipelineId;
                this.pipelineRunId = model.pipelineRunId;
                this.productionBranch = model.productionBranch;
                this.repository = model.repository;
                this.rootDirectory = model.rootDirectory;
                this.routineBuildId = model.routineBuildId;
                this.routineEntry = model.routineEntry;
                this.routineName = model.routineName;
                this.status = model.status;
                this.templateName = model.templateName;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * <p>The static assets directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/usr</p>
             */
            public Builder assetsDirectory(String assetsDirectory) {
                this.assetsDirectory = assetsDirectory;
                return this;
            }

            /**
             * <p>The branch used for the build.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * <p>The build command.</p>
             * 
             * <strong>example:</strong>
             * <p>npm run build</p>
             */
            public Builder buildCommand(String buildCommand) {
                this.buildCommand = buildCommand;
                return this;
            }

            /**
             * <p>The ID of the commit.</p>
             * 
             * <strong>example:</strong>
             * <p>c08057f590f8d5be56fcae1e082128254a708f94</p>
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * <p>The commit message.</p>
             * 
             * <strong>example:</strong>
             * <p>Add static files.</p>
             */
            public Builder commitMessage(String commitMessage) {
                this.commitMessage = commitMessage;
                return this;
            }

            /**
             * <p>The creation time, in the ISO 8601 format in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-26T02:19:34Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             */
            public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * <p>The Git account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>162124764031208</p>
             */
            public Builder gitAccountId(Long gitAccountId) {
                this.gitAccountId = gitAccountId;
                return this;
            }

            /**
             * <p>The Git account name.</p>
             * 
             * <strong>example:</strong>
             * <p>rwa</p>
             */
            public Builder gitAccountName(String gitAccountName) {
                this.gitAccountName = gitAccountName;
                return this;
            }

            /**
             * <p>The install command.</p>
             * 
             * <strong>example:</strong>
             * <p>npm install</p>
             */
            public Builder installCommand(String installCommand) {
                this.installCommand = installCommand;
                return this;
            }

            /**
             * <p>Indicates whether the repository is private. Valid values:</p>
             * <ul>
             * <li>true: The repository is private.</li>
             * <li>false: The repository is not private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPrivate(Boolean isPrivate) {
                this.isPrivate = isPrivate;
                return this;
            }

            /**
             * <p>The Node.js version. Valid values: <code>22.x</code>, <code>20.x</code>, <code>18.x</code>, <code>16.x</code>, <code>14.x</code>, <code>12.x</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>22.x</p>
             */
            public Builder nodeVersion(String nodeVersion) {
                this.nodeVersion = nodeVersion;
                return this;
            }

            /**
             * <p>The Yunxiao pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3850166</p>
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The Yunxiao build task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder pipelineRunId(Long pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * <p>The production branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder productionBranch(String productionBranch) {
                this.productionBranch = productionBranch;
                return this;
            }

            /**
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>rwa-test</p>
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * <p>The root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/admin</p>
             */
            public Builder rootDirectory(String rootDirectory) {
                this.rootDirectory = rootDirectory;
                return this;
            }

            /**
             * <p>The ER build task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4133325046294912</p>
             */
            public Builder routineBuildId(Long routineBuildId) {
                this.routineBuildId = routineBuildId;
                return this;
            }

            /**
             * <p>The ER entry file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder routineEntry(String routineEntry) {
                this.routineEntry = routineEntry;
                return this;
            }

            /**
             * <p>The ER name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-routine</p>
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            /**
             * <p>The status of the build task. Valid values:</p>
             * <ul>
             * <li>int: initialization</li>
             * <li>pending: preparing</li>
             * <li>building: building</li>
             * <li>succeed: build succeeded</li>
             * <li>failed: build failed</li>
             * <li>canceled: canceled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>succeed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The modification time, in the ISO 8601 format in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-20T00:44:23Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1427812834792318</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
