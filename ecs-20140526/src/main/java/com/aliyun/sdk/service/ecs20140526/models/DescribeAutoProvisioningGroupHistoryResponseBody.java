// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupHistoryResponseBody</p>
 */
public class DescribeAutoProvisioningGroupHistoryResponseBody extends TeaModel {
    @NameInMap("AutoProvisioningGroupHistories")
    private AutoProvisioningGroupHistories autoProvisioningGroupHistories;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * An array consisting of AutoProvisioningGroupHistory data.
         */
        public Builder autoProvisioningGroupHistories(AutoProvisioningGroupHistories autoProvisioningGroupHistories) {
            this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of queried scheduling tasks in the auto provisioning group.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBody build() {
            return new DescribeAutoProvisioningGroupHistoryResponseBody(this);
        } 

    } 

    public static class ActivityDetail extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("Status")
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
             * The execution details of instance creation performed by the single scheduling task.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The execution status of instance creation performed by the single scheduling task. Valid values:
             * <p>
             * 
             * *   Successful: Instances are created.
             * *   Failed: Instances failed to be created.
             * *   InProgress: Instances are being created.
             * *   Warning: Some instances are created.
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
    public static class ActivityDetails extends TeaModel {
        @NameInMap("ActivityDetail")
        private java.util.List < ActivityDetail> activityDetail;

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
        public java.util.List < ActivityDetail> getActivityDetail() {
            return this.activityDetail;
        }

        public static final class Builder {
            private java.util.List < ActivityDetail> activityDetail; 

            /**
             * ActivityDetail.
             */
            public Builder activityDetail(java.util.List < ActivityDetail> activityDetail) {
                this.activityDetail = activityDetail;
                return this;
            }

            public ActivityDetails build() {
                return new ActivityDetails(this);
            } 

        } 

    }
    public static class AutoProvisioningGroupHistory extends TeaModel {
        @NameInMap("ActivityDetails")
        private ActivityDetails activityDetails;

        @NameInMap("LastEventTime")
        private String lastEventTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
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
             * An array consisting of ActivityDetail data.
             */
            public Builder activityDetails(ActivityDetails activityDetails) {
                this.activityDetails = activityDetails;
                return this;
            }

            /**
             * The execution time of the last instance creation performed by the single scheduling task.
             */
            public Builder lastEventTime(String lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * The start time of executing the single scheduling task.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The execution status of the single scheduling task. Valid values:
             * <p>
             * 
             * *   prepare: The scheduling task is being executed.
             * *   success: The scheduling task is executed.
             * *   failed: The scheduling task failed to be executed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the scheduling task.
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
    public static class AutoProvisioningGroupHistories extends TeaModel {
        @NameInMap("AutoProvisioningGroupHistory")
        private java.util.List < AutoProvisioningGroupHistory> autoProvisioningGroupHistory;

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
        public java.util.List < AutoProvisioningGroupHistory> getAutoProvisioningGroupHistory() {
            return this.autoProvisioningGroupHistory;
        }

        public static final class Builder {
            private java.util.List < AutoProvisioningGroupHistory> autoProvisioningGroupHistory; 

            /**
             * AutoProvisioningGroupHistory.
             */
            public Builder autoProvisioningGroupHistory(java.util.List < AutoProvisioningGroupHistory> autoProvisioningGroupHistory) {
                this.autoProvisioningGroupHistory = autoProvisioningGroupHistory;
                return this;
            }

            public AutoProvisioningGroupHistories build() {
                return new AutoProvisioningGroupHistories(this);
            } 

        } 

    }
}
