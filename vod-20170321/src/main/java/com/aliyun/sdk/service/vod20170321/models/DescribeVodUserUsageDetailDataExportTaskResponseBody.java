// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodUserUsageDetailDataExportTaskResponseBody</p>
 */
public class DescribeVodUserUsageDetailDataExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageDataPerPage")
    private UsageDataPerPage usageDataPerPage;

    private DescribeVodUserUsageDetailDataExportTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageDataPerPage = builder.usageDataPerPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserUsageDetailDataExportTaskResponseBody create() {
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
     * @return usageDataPerPage
     */
    public UsageDataPerPage getUsageDataPerPage() {
        return this.usageDataPerPage;
    }

    public static final class Builder {
        private String requestId; 
        private UsageDataPerPage usageDataPerPage; 

        private Builder() {
        } 

        private Builder(DescribeVodUserUsageDetailDataExportTaskResponseBody model) {
            this.requestId = model.requestId;
            this.usageDataPerPage = model.usageDataPerPage;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageDataPerPage.
         */
        public Builder usageDataPerPage(UsageDataPerPage usageDataPerPage) {
            this.usageDataPerPage = usageDataPerPage;
            return this;
        }

        public DescribeVodUserUsageDetailDataExportTaskResponseBody build() {
            return new DescribeVodUserUsageDetailDataExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserUsageDetailDataExportTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TaskConfig model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
     * {@link DescribeVodUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserUsageDetailDataExportTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DataItem model) {
                this.createTime = model.createTime;
                this.downloadUrl = model.downloadUrl;
                this.status = model.status;
                this.taskConfig = model.taskConfig;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskConfig.
             */
            public Builder taskConfig(TaskConfig taskConfig) {
                this.taskConfig = taskConfig;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * UpdateTime.
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
     * {@link DescribeVodUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserUsageDetailDataExportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataItem")
        private java.util.List<DataItem> dataItem;

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
        public java.util.List<DataItem> getDataItem() {
            return this.dataItem;
        }

        public static final class Builder {
            private java.util.List<DataItem> dataItem; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataItem = model.dataItem;
            } 

            /**
             * DataItem.
             */
            public Builder dataItem(java.util.List<DataItem> dataItem) {
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
     * {@link DescribeVodUserUsageDetailDataExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodUserUsageDetailDataExportTaskResponseBody</p>
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

            private Builder() {
            } 

            private Builder(UsageDataPerPage model) {
                this.data = model.data;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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

            public UsageDataPerPage build() {
                return new UsageDataPerPage(this);
            } 

        } 

    }
}
