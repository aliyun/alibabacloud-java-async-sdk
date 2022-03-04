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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("AutoProvisioningGroupHistories")
    private AutoProvisioningGroupHistories autoProvisioningGroupHistories;

    private DescribeAutoProvisioningGroupHistoryResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.autoProvisioningGroupHistories = builder.autoProvisioningGroupHistories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupHistoryResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return autoProvisioningGroupHistories
     */
    public AutoProvisioningGroupHistories getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private AutoProvisioningGroupHistories autoProvisioningGroupHistories; 

        /**
         * The number of rows per page.
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of queried scheduling tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information of all scheduling tasks.
         */
        public Builder autoProvisioningGroupHistories(AutoProvisioningGroupHistories autoProvisioningGroupHistories) {
            this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
            return this;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBody build() {
            return new DescribeAutoProvisioningGroupHistoryResponseBody(this);
        } 

    } 

    public static class ActivityDetail extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Detail")
        private String detail;

        private ActivityDetail(Builder builder) {
            this.status = builder.status;
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityDetail create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private String status; 
            private String detail; 

            /**
             * The execution status of an instance creation activity for a single scheduling task. Possible values:
             * <p>
             * 
             * -Successful: the instance is created.
             * -Failed: the instance Failed to be created.
             * -InProgress: the instance is being created.
             * -Warning: the instance is created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The execution details of a single scheduling task and an instance creation activity.
             */
            public Builder detail(String detail) {
                this.detail = detail;
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
        @NameInMap("Status")
        private String status;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("LastEventTime")
        private String lastEventTime;

        @NameInMap("ActivityDetails")
        private ActivityDetails activityDetails;

        private AutoProvisioningGroupHistory(Builder builder) {
            this.status = builder.status;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
            this.lastEventTime = builder.lastEventTime;
            this.activityDetails = builder.activityDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroupHistory create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return lastEventTime
         */
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        /**
         * @return activityDetails
         */
        public ActivityDetails getActivityDetails() {
            return this.activityDetails;
        }

        public static final class Builder {
            private String status; 
            private String startTime; 
            private String taskId; 
            private String lastEventTime; 
            private ActivityDetails activityDetails; 

            /**
             * The status of a single scheduling task. Possible values:
             * <p>
             * 
             * -prepare: the scheduling task is running.
             * -success: the scheduling task is successfully executed.
             * -failed: the scheduling task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when a single scheduling task starts.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of a single scheduling task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The execution time of the last instance creation activity for a single scheduling task.
             */
            public Builder lastEventTime(String lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * The details of a single scheduling task.
             */
            public Builder activityDetails(ActivityDetails activityDetails) {
                this.activityDetails = activityDetails;
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
