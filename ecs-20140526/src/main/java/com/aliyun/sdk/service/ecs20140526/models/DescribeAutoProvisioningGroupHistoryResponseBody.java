// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
 */
public class DescribeAutoProvisioningGroupHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupHistories")
    private AutoProvisioningGroupHistories autoProvisioningGroupHistories;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAutoProvisioningGroupHistoryResponseBody(Builder builder) {
        this.autoProvisioningGroupHistories = builder.autoProvisioningGroupHistories;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoProvisioningGroupHistories
     */
    public AutoProvisioningGroupHistories getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AutoProvisioningGroupHistories autoProvisioningGroupHistories; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array consisting of AutoProvisioningGroupHistory data.</p>
         */
        public Builder autoProvisioningGroupHistories(AutoProvisioningGroupHistories autoProvisioningGroupHistories) {
            this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B48A12CD-1295-4A38-A8F0-0E92C937****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of queried scheduling tasks in the auto provisioning group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBody build() {
            return new DescribeAutoProvisioningGroupHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
     */
    public static class ActivityDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ActivityDetail(Builder builder) {
            this.detail = builder.detail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityDetail create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String detail; 
            private String status; 

            /**
             * <p>The execution details of instance creation performed by the single scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>New ECS instances &quot;i-bp67acfmxazb4p****, i-bp67acfmxazb5p****&quot; created.</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The execution status of instance creation performed by the single scheduling task. Valid values:</p>
             * <ul>
             * <li>Successful: Instances are created.</li>
             * <li>Failed: Instances failed to be created.</li>
             * <li>InProgress: Instances are being created.</li>
             * <li>Warning: Some instances are created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ActivityDetail build() {
                return new ActivityDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
     */
    public static class ActivityDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityDetail")
        private java.util.List<ActivityDetail> activityDetail;

        private ActivityDetails(Builder builder) {
            this.activityDetail = builder.activityDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityDetails create() {
            return builder().build();
        }

        /**
         * @return activityDetail
         */
        public java.util.List<ActivityDetail> getActivityDetail() {
            return this.activityDetail;
        }

        public static final class Builder {
            private java.util.List<ActivityDetail> activityDetail; 

            /**
             * ActivityDetail.
             */
            public Builder activityDetail(java.util.List<ActivityDetail> activityDetail) {
                this.activityDetail = activityDetail;
                return this;
            }

            public ActivityDetails build() {
                return new ActivityDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
     */
    public static class AutoProvisioningGroupHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityDetails")
        private ActivityDetails activityDetails;

        @com.aliyun.core.annotation.NameInMap("LastEventTime")
        private String lastEventTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private AutoProvisioningGroupHistory(Builder builder) {
            this.activityDetails = builder.activityDetails;
            this.lastEventTime = builder.lastEventTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroupHistory create() {
            return builder().build();
        }

        /**
         * @return activityDetails
         */
        public ActivityDetails getActivityDetails() {
            return this.activityDetails;
        }

        /**
         * @return lastEventTime
         */
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private ActivityDetails activityDetails; 
            private String lastEventTime; 
            private String startTime; 
            private String status; 
            private String taskId; 

            /**
             * <p>An array consisting of ActivityDetail data.</p>
             */
            public Builder activityDetails(ActivityDetails activityDetails) {
                this.activityDetails = activityDetails;
                return this;
            }

            /**
             * <p>The execution time of the last instance creation performed by the single scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-01T15:10:20Z</p>
             */
            public Builder lastEventTime(String lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * <p>The start time of executing the single scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-01T15:10:20Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution status of the single scheduling task. Valid values:</p>
             * <ul>
             * <li>prepare: The scheduling task is being executed.</li>
             * <li>success: The scheduling task is executed.</li>
             * <li>failed: The scheduling task failed to be executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>apg-task-bp67acfmxazb4p****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public AutoProvisioningGroupHistory build() {
                return new AutoProvisioningGroupHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
     */
    public static class AutoProvisioningGroupHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupHistory")
        private java.util.List<AutoProvisioningGroupHistory> autoProvisioningGroupHistory;

        private AutoProvisioningGroupHistories(Builder builder) {
            this.autoProvisioningGroupHistory = builder.autoProvisioningGroupHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroupHistories create() {
            return builder().build();
        }

        /**
         * @return autoProvisioningGroupHistory
         */
        public java.util.List<AutoProvisioningGroupHistory> getAutoProvisioningGroupHistory() {
            return this.autoProvisioningGroupHistory;
        }

        public static final class Builder {
            private java.util.List<AutoProvisioningGroupHistory> autoProvisioningGroupHistory; 

            /**
             * AutoProvisioningGroupHistory.
             */
            public Builder autoProvisioningGroupHistory(java.util.List<AutoProvisioningGroupHistory> autoProvisioningGroupHistory) {
                this.autoProvisioningGroupHistory = autoProvisioningGroupHistory;
                return this;
            }

            public AutoProvisioningGroupHistories build() {
                return new AutoProvisioningGroupHistories(this);
            } 

        } 

    }
}
