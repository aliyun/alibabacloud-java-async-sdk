// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The tasks returned.</p>
         */
        public Builder buildTasks(java.util.List < BuildTasks> buildTasks) {
            this.buildTasks = buildTasks;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8AC52BBA-85D3-5F64-9B48-D08437CAF916</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageFixTaskResponseBody build() {
            return new DescribeImageFixTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageFixTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFixTaskResponseBody</p>
     */
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
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>ivf-939536b5-c3ca-427b-8183-91007756</p>
             */
            public Builder buildTaskId(String buildTaskId) {
                this.buildTaskId = buildTaskId;
                return this;
            }

            /**
             * <p>The timestamp when the task starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-14 20:34:07</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The timestamp when the task ends. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-14 20:32:05</p>
             */
            public Builder fixTime(String fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * <p>The version of the image after image risks are fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>redhat8-vault</p>
             */
            public Builder newTag(String newTag) {
                this.newTag = newTag;
                return this;
            }

            /**
             * <p>The UUID of the image after image risks are fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa731681911ae8d1b5f11893ace****</p>
             */
            public Builder newUuid(String newUuid) {
                this.newUuid = newUuid;
                return this;
            }

            /**
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos8.1-ja</p>
             */
            public Builder oldTag(String oldTag) {
                this.oldTag = oldTag;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>2fa731681911ae8d1b5f11893ace****</p>
             */
            public Builder oldUuid(String oldUuid) {
                this.oldUuid = oldUuid;
                return this;
            }

            /**
             * <p>The region of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test-redhat</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>name-002</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The task is running.</li>
             * <li><strong>2</strong>: The task is successful.</li>
             * <li><strong>3</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the task. The value is fixed as IMAGE_REPAIR. The value indicates a task that fixes image risks.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_REPAIR</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The alias of the fixed vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2007-5686:rpath_linux Information Disclosure</p>
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
    /**
     * 
     * {@link DescribeImageFixTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageFixTaskResponseBody</p>
     */
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
             * <p>The number of tasks returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page. Default value: <strong>1</strong></p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong></p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of tasks returned.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
