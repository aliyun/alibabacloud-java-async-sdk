// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFixTaskResponseBody</p>
 */
public class DescribeImageFixTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildTasks")
    private java.util.List < BuildTasks> buildTasks;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageFixTaskResponseBody(Builder builder) {
        this.buildTasks = builder.buildTasks;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFixTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildTasks
     */
    public java.util.List < BuildTasks> getBuildTasks() {
        return this.buildTasks;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BuildTasks> buildTasks; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The tasks returned.
         */
        public Builder buildTasks(java.util.List < BuildTasks> buildTasks) {
            this.buildTasks = buildTasks;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageFixTaskResponseBody build() {
            return new DescribeImageFixTaskResponseBody(this);
        } 

    } 

    public static class BuildTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildTaskId")
        private String buildTaskId;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("FixTime")
        private String fixTime;

        @com.aliyun.core.annotation.NameInMap("NewTag")
        private String newTag;

        @com.aliyun.core.annotation.NameInMap("NewUuid")
        private String newUuid;

        @com.aliyun.core.annotation.NameInMap("OldTag")
        private String oldTag;

        @com.aliyun.core.annotation.NameInMap("OldUuid")
        private String oldUuid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("VulAlias")
        private String vulAlias;

        private BuildTasks(Builder builder) {
            this.buildTaskId = builder.buildTaskId;
            this.finishTime = builder.finishTime;
            this.fixTime = builder.fixTime;
            this.newTag = builder.newTag;
            this.newUuid = builder.newUuid;
            this.oldTag = builder.oldTag;
            this.oldUuid = builder.oldUuid;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.status = builder.status;
            this.taskType = builder.taskType;
            this.vulAlias = builder.vulAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildTasks create() {
            return builder().build();
        }

        /**
         * @return buildTaskId
         */
        public String getBuildTaskId() {
            return this.buildTaskId;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return fixTime
         */
        public String getFixTime() {
            return this.fixTime;
        }

        /**
         * @return newTag
         */
        public String getNewTag() {
            return this.newTag;
        }

        /**
         * @return newUuid
         */
        public String getNewUuid() {
            return this.newUuid;
        }

        /**
         * @return oldTag
         */
        public String getOldTag() {
            return this.oldTag;
        }

        /**
         * @return oldUuid
         */
        public String getOldUuid() {
            return this.oldUuid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return vulAlias
         */
        public String getVulAlias() {
            return this.vulAlias;
        }

        public static final class Builder {
            private String buildTaskId; 
            private String finishTime; 
            private String fixTime; 
            private String newTag; 
            private String newUuid; 
            private String oldTag; 
            private String oldUuid; 
            private String regionId; 
            private String repoName; 
            private String repoNamespace; 
            private Integer status; 
            private String taskType; 
            private String vulAlias; 

            /**
             * The ID of the task.
             */
            public Builder buildTaskId(String buildTaskId) {
                this.buildTaskId = buildTaskId;
                return this;
            }

            /**
             * The timestamp when the task starts. Unit: milliseconds.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The timestamp when the task ends. Unit: milliseconds.
             */
            public Builder fixTime(String fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * The version of the image after image risks are fixed.
             */
            public Builder newTag(String newTag) {
                this.newTag = newTag;
                return this;
            }

            /**
             * The UUID of the image after image risks are fixed.
             */
            public Builder newUuid(String newUuid) {
                this.newUuid = newUuid;
                return this;
            }

            /**
             * The version of the image.
             */
            public Builder oldTag(String oldTag) {
                this.oldTag = oldTag;
                return this;
            }

            /**
             * The UUID of the image.
             */
            public Builder oldUuid(String oldUuid) {
                this.oldUuid = oldUuid;
                return this;
            }

            /**
             * The region of the image.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The namespace of the image.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **1**: The task is running.
             * *   **2**: The task is successful.
             * *   **3**: The task failed.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the task. The value is fixed as IMAGE_REPAIR. The value indicates a task that fixes image risks.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The alias of the fixed vulnerability.
             */
            public Builder vulAlias(String vulAlias) {
                this.vulAlias = vulAlias;
                return this;
            }

            public BuildTasks build() {
                return new BuildTasks(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of tasks returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page. Default value: **1**
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of tasks returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
