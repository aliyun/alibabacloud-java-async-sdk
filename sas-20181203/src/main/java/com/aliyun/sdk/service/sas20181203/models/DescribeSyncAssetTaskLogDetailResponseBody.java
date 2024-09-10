// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncAssetTaskLogDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncAssetTaskLogDetailResponseBody</p>
 */
public class DescribeSyncAssetTaskLogDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskRecordDetails")
    private java.util.List < TaskRecordDetails> taskRecordDetails;

    private DescribeSyncAssetTaskLogDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.taskRecordDetails = builder.taskRecordDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncAssetTaskLogDetailResponseBody create() {
        return builder().build();
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

    /**
     * @return taskRecordDetails
     */
    public java.util.List < TaskRecordDetails> getTaskRecordDetails() {
        return this.taskRecordDetails;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < TaskRecordDetails> taskRecordDetails; 

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

        /**
         * The details of the tasks.
         */
        public Builder taskRecordDetails(java.util.List < TaskRecordDetails> taskRecordDetails) {
            this.taskRecordDetails = taskRecordDetails;
            return this;
        }

        public DescribeSyncAssetTaskLogDetailResponseBody build() {
            return new DescribeSyncAssetTaskLogDetailResponseBody(this);
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
             * The number of entries on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class TaskRecordDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Integer assetCount;

        @com.aliyun.core.annotation.NameInMap("IdcRegion")
        private String idcRegion;

        @com.aliyun.core.annotation.NameInMap("LeafTaskId")
        private String leafTaskId;

        @com.aliyun.core.annotation.NameInMap("LeafTaskStatus")
        private String leafTaskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskMsg")
        private String taskMsg;

        @com.aliyun.core.annotation.NameInMap("TaskReportTime")
        private Long taskReportTime;

        @com.aliyun.core.annotation.NameInMap("UnprotectedAssetCount")
        private Integer unprotectedAssetCount;

        private TaskRecordDetails(Builder builder) {
            this.assetCount = builder.assetCount;
            this.idcRegion = builder.idcRegion;
            this.leafTaskId = builder.leafTaskId;
            this.leafTaskStatus = builder.leafTaskStatus;
            this.taskMsg = builder.taskMsg;
            this.taskReportTime = builder.taskReportTime;
            this.unprotectedAssetCount = builder.unprotectedAssetCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRecordDetails create() {
            return builder().build();
        }

        /**
         * @return assetCount
         */
        public Integer getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return idcRegion
         */
        public String getIdcRegion() {
            return this.idcRegion;
        }

        /**
         * @return leafTaskId
         */
        public String getLeafTaskId() {
            return this.leafTaskId;
        }

        /**
         * @return leafTaskStatus
         */
        public String getLeafTaskStatus() {
            return this.leafTaskStatus;
        }

        /**
         * @return taskMsg
         */
        public String getTaskMsg() {
            return this.taskMsg;
        }

        /**
         * @return taskReportTime
         */
        public Long getTaskReportTime() {
            return this.taskReportTime;
        }

        /**
         * @return unprotectedAssetCount
         */
        public Integer getUnprotectedAssetCount() {
            return this.unprotectedAssetCount;
        }

        public static final class Builder {
            private Integer assetCount; 
            private String idcRegion; 
            private String leafTaskId; 
            private String leafTaskStatus; 
            private String taskMsg; 
            private Long taskReportTime; 
            private Integer unprotectedAssetCount; 

            /**
             * The total number of assets.
             */
            public Builder assetCount(Integer assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * The region of the server in the data center.
             */
            public Builder idcRegion(String idcRegion) {
                this.idcRegion = idcRegion;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder leafTaskId(String leafTaskId) {
                this.leafTaskId = leafTaskId;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is not started.
             * *   **START**: The task is started.
             * *   **MESSAGE_SEND**: The command is sent.
             * *   **SUCCESS**: The task is complete.
             * *   **FAIL**: The task failed.
             * *   **TIMEOUT**: The task timed out.
             */
            public Builder leafTaskStatus(String leafTaskStatus) {
                this.leafTaskStatus = leafTaskStatus;
                return this;
            }

            /**
             * The description of the task.
             */
            public Builder taskMsg(String taskMsg) {
                this.taskMsg = taskMsg;
                return this;
            }

            /**
             * The timestamp when the task results were reported.
             */
            public Builder taskReportTime(Long taskReportTime) {
                this.taskReportTime = taskReportTime;
                return this;
            }

            /**
             * The number of unprotected assets.
             */
            public Builder unprotectedAssetCount(Integer unprotectedAssetCount) {
                this.unprotectedAssetCount = unprotectedAssetCount;
                return this;
            }

            public TaskRecordDetails build() {
                return new TaskRecordDetails(this);
            } 

        } 

    }
}
