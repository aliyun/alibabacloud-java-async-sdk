// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<TaskRecordDetails> taskRecordDetails;

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
    public java.util.List<TaskRecordDetails> getTaskRecordDetails() {
        return this.taskRecordDetails;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<TaskRecordDetails> taskRecordDetails; 

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
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the tasks.</p>
         */
        public Builder taskRecordDetails(java.util.List<TaskRecordDetails> taskRecordDetails) {
            this.taskRecordDetails = taskRecordDetails;
            return this;
        }

        public DescribeSyncAssetTaskLogDetailResponseBody build() {
            return new DescribeSyncAssetTaskLogDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncAssetTaskLogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncAssetTaskLogDetailResponseBody</p>
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
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
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
    /**
     * 
     * {@link DescribeSyncAssetTaskLogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncAssetTaskLogDetailResponseBody</p>
     */
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
             * <p>The total number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder assetCount(Integer assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The region of the server in the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder idcRegion(String idcRegion) {
                this.idcRegion = idcRegion;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>6c4e4c36ffc3e5919120b405c2b3****</p>
             */
            public Builder leafTaskId(String leafTaskId) {
                this.leafTaskId = leafTaskId;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is not started.</li>
             * <li><strong>START</strong>: The task is started.</li>
             * <li><strong>MESSAGE_SEND</strong>: The command is sent.</li>
             * <li><strong>SUCCESS</strong>: The task is complete.</li>
             * <li><strong>FAIL</strong>: The task failed.</li>
             * <li><strong>TIMEOUT</strong>: The task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder leafTaskStatus(String leafTaskStatus) {
                this.leafTaskStatus = leafTaskStatus;
                return this;
            }

            /**
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>unknown reason</p>
             */
            public Builder taskMsg(String taskMsg) {
                this.taskMsg = taskMsg;
                return this;
            }

            /**
             * <p>The timestamp when the task results were reported.</p>
             * 
             * <strong>example:</strong>
             * <p>1671614217000</p>
             */
            public Builder taskReportTime(Long taskReportTime) {
                this.taskReportTime = taskReportTime;
                return this;
            }

            /**
             * <p>The number of unprotected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
