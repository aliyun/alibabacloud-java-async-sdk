// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserUsageDetailDataExportTaskResponseBody</p>
 */
public class DescribeUserUsageDetailDataExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageDataPerPage")
    private UsageDataPerPage usageDataPerPage;

    private DescribeUserUsageDetailDataExportTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageDataPerPage = builder.usageDataPerPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserUsageDetailDataExportTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageDataPerPage
     */
    public UsageDataPerPage getUsageDataPerPage() {
        return this.usageDataPerPage;
    }

    public static final class Builder {
        private String requestId; 
        private UsageDataPerPage usageDataPerPage; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A91BE91F-0B34-4CBF-8E0F-A2977E15AA52</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The usage details returned per page.</p>
         */
        public Builder usageDataPerPage(UsageDataPerPage usageDataPerPage) {
            this.usageDataPerPage = usageDataPerPage;
            return this;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBody build() {
            return new DescribeUserUsageDetailDataExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserUsageDetailDataExportTaskResponseBody</p>
     */
    public static class TaskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TaskConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * <p>The end of the time range during which data was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-31T15:59:59Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start of the time range during which data was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-31T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TaskConfig build() {
                return new TaskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserUsageDetailDataExportTaskResponseBody</p>
     */
    public static class DataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskConfig")
        private TaskConfig taskConfig;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DataItem(Builder builder) {
            this.createTime = builder.createTime;
            this.downloadUrl = builder.downloadUrl;
            this.status = builder.status;
            this.taskConfig = builder.taskConfig;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataItem create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskConfig
         */
        public TaskConfig getTaskConfig() {
            return this.taskConfig;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String downloadUrl; 
            private String status; 
            private TaskConfig taskConfig; 
            private String taskId; 
            private String taskName; 
            private String updateTime; 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-09T06:33:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/billing_data/xxx">https://test.oss-cn-beijing.aliyuncs.com/billing_data/xxx</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configurations of the task.</p>
             */
            public Builder taskConfig(TaskConfig taskConfig) {
                this.taskConfig = taskConfig;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Refresh</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The time when the task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-09T06:35:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataItem build() {
                return new DataItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserUsageDetailDataExportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataItem")
        private java.util.List < DataItem> dataItem;

        private Data(Builder builder) {
            this.dataItem = builder.dataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataItem
         */
        public java.util.List < DataItem> getDataItem() {
            return this.dataItem;
        }

        public static final class Builder {
            private java.util.List < DataItem> dataItem; 

            /**
             * DataItem.
             */
            public Builder dataItem(java.util.List < DataItem> dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserUsageDetailDataExportTaskResponseBody</p>
     */
    public static class UsageDataPerPage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private UsageDataPerPage(Builder builder) {
            this.data = builder.data;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageDataPerPage create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private Data data; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The information about the task.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public UsageDataPerPage build() {
                return new UsageDataPerPage(this);
            } 

        } 

    }
}
