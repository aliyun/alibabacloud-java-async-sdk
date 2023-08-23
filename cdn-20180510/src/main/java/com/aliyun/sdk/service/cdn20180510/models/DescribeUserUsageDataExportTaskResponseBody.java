// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserUsageDataExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserUsageDataExportTaskResponseBody</p>
 */
public class DescribeUserUsageDataExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsageDataPerPage")
    private UsageDataPerPage usageDataPerPage;

    private DescribeUserUsageDataExportTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageDataPerPage = builder.usageDataPerPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserUsageDataExportTaskResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The usage details returned per page.
         */
        public Builder usageDataPerPage(UsageDataPerPage usageDataPerPage) {
            this.usageDataPerPage = usageDataPerPage;
            return this;
        }

        public DescribeUserUsageDataExportTaskResponseBody build() {
            return new DescribeUserUsageDataExportTaskResponseBody(this);
        } 

    } 

    public static class TaskConfig extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
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
             * The end of the time range that was queried.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The start of the time range during which data was queried.
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
    public static class DataItem extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskConfig")
        private TaskConfig taskConfig;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("UpdateTime")
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
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The download URL.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The state of the task.
             * <p>
             * 
             * *   created: The task is being created.
             * *   success: The task is successful.
             * *   failed: The task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The configurations of the task.
             */
            public Builder taskConfig(TaskConfig taskConfig) {
                this.taskConfig = taskConfig;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The time when the task was last modified.
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
    public static class Data extends TeaModel {
        @NameInMap("DataItem")
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
    public static class UsageDataPerPage extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The information about the tasks.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
