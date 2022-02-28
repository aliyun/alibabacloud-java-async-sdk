// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFixTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFixTaskResponseBody</p>
 */
public class DescribeImageFixTaskResponseBody extends TeaModel {
    @NameInMap("BuildTasks")
    private java.util.List < BuildTasks> buildTasks;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * BuildTasks.
         */
        public Builder buildTasks(java.util.List < BuildTasks> buildTasks) {
            this.buildTasks = buildTasks;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("BuildTaskId")
        private String buildTaskId;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("FixTime")
        private String fixTime;

        @NameInMap("NewTag")
        private String newTag;

        @NameInMap("NewUuid")
        private String newUuid;

        @NameInMap("OldTag")
        private String oldTag;

        @NameInMap("OldUuid")
        private String oldUuid;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskType")
        private String taskType;

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

            /**
             * BuildTaskId.
             */
            public Builder buildTaskId(String buildTaskId) {
                this.buildTaskId = buildTaskId;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * FixTime.
             */
            public Builder fixTime(String fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * NewTag.
             */
            public Builder newTag(String newTag) {
                this.newTag = newTag;
                return this;
            }

            /**
             * NewUuid.
             */
            public Builder newUuid(String newUuid) {
                this.newUuid = newUuid;
                return this;
            }

            /**
             * OldTag.
             */
            public Builder oldTag(String oldTag) {
                this.oldTag = oldTag;
                return this;
            }

            /**
             * OldUuid.
             */
            public Builder oldUuid(String oldUuid) {
                this.oldUuid = oldUuid;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespace.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public BuildTasks build() {
                return new BuildTasks(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
