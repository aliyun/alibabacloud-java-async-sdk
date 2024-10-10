// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncAssetTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncAssetTaskListResponseBody</p>
 */
public class DescribeSyncAssetTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskRecords")
    private java.util.List < TaskRecords> taskRecords;

    private DescribeSyncAssetTaskListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.taskRecords = builder.taskRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncAssetTaskListResponseBody create() {
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
     * @return taskRecords
     */
    public java.util.List < TaskRecords> getTaskRecords() {
        return this.taskRecords;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < TaskRecords> taskRecords; 

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
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDC scan tasks.</p>
         */
        public Builder taskRecords(java.util.List < TaskRecords> taskRecords) {
            this.taskRecords = taskRecords;
            return this;
        }

        public DescribeSyncAssetTaskListResponseBody build() {
            return new DescribeSyncAssetTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncAssetTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncAssetTaskListResponseBody</p>
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
             * <p>The number of IDC scan tasks on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The number of IDC scan tasks per page. Default value: 20. If you leave this parameter empty, 20 IDC scan tasks are returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of IDC scan tasks returned.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
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
     * {@link DescribeSyncAssetTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncAssetTaskListResponseBody</p>
     */
    public static class TaskRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Integer assetCount;

        @com.aliyun.core.annotation.NameInMap("IpSegments")
        private String ipSegments;

        @com.aliyun.core.annotation.NameInMap("ProcessRate")
        private Integer processRate;

        @com.aliyun.core.annotation.NameInMap("RootTaskId")
        private String rootTaskId;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private Long taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private Long taskStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TaskRecords(Builder builder) {
            this.assetCount = builder.assetCount;
            this.ipSegments = builder.ipSegments;
            this.processRate = builder.processRate;
            this.rootTaskId = builder.rootTaskId;
            this.taskEndTime = builder.taskEndTime;
            this.taskName = builder.taskName;
            this.taskStartTime = builder.taskStartTime;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRecords create() {
            return builder().build();
        }

        /**
         * @return assetCount
         */
        public Integer getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return ipSegments
         */
        public String getIpSegments() {
            return this.ipSegments;
        }

        /**
         * @return processRate
         */
        public Integer getProcessRate() {
            return this.processRate;
        }

        /**
         * @return rootTaskId
         */
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        /**
         * @return taskEndTime
         */
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStartTime
         */
        public Long getTaskStartTime() {
            return this.taskStartTime;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Integer assetCount; 
            private String ipSegments; 
            private Integer processRate; 
            private String rootTaskId; 
            private Long taskEndTime; 
            private String taskName; 
            private Long taskStartTime; 
            private String taskStatus; 
            private String taskType; 

            /**
             * <p>The number of assets that are detected by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetCount(Integer assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The CIDR blocks that are used for scanning. Multiple CIDR blocks are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1/24,1.1.1.1/24</p>
             */
            public Builder ipSegments(String ipSegments) {
                this.ipSegments = ipSegments;
                return this;
            }

            /**
             * <p>The progress of the task, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder processRate(Integer processRate) {
                this.processRate = processRate;
                return this;
            }

            /**
             * <p>The ID of the root task.</p>
             * 
             * <strong>example:</strong>
             * <p>73c392f9c505129a257472a3f911d65d</p>
             */
            public Builder rootTaskId(String rootTaskId) {
                this.rootTaskId = rootTaskId;
                return this;
            }

            /**
             * <p>The timestamp when the task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1653965680000</p>
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IDC_PROBE_SCAN-1.1.1..124-lse_ubuntu_test1</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The timestamp when the task started. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1633746651715</p>
             */
            public Builder taskStartTime(Long taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * <p>The status of the IDC scan task. Valid Values:</p>
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
             * <p>SUCCESS</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The type of the task. The value is fixed as <strong>IDC_PROBE_SCAN</strong>, which indicates an IDC scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>IDC_PROBE_SCAN</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskRecords build() {
                return new TaskRecords(this);
            } 

        } 

    }
}
