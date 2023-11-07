// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryHistoryJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryHistoryJobsResponseBody</p>
 */
public class ListDeliveryHistoryJobsResponseBody extends TeaModel {
    @NameInMap("DeliveryHistoryJobs")
    private java.util.List < DeliveryHistoryJobs> deliveryHistoryJobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDeliveryHistoryJobsResponseBody(Builder builder) {
        this.deliveryHistoryJobs = builder.deliveryHistoryJobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryHistoryJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliveryHistoryJobs
     */
    public java.util.List < DeliveryHistoryJobs> getDeliveryHistoryJobs() {
        return this.deliveryHistoryJobs;
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
        private java.util.List < DeliveryHistoryJobs> deliveryHistoryJobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of historical event delivery tasks.
         */
        public Builder deliveryHistoryJobs(java.util.List < DeliveryHistoryJobs> deliveryHistoryJobs) {
            this.deliveryHistoryJobs = deliveryHistoryJobs;
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
         * The number of entries per page.
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
         * The number of historical event delivery tasks returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeliveryHistoryJobsResponseBody build() {
            return new ListDeliveryHistoryJobsResponseBody(this);
        } 

    } 

    public static class DeliveryHistoryJobs extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("HomeRegion")
        private String homeRegion;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("JobStatus")
        private Integer jobStatus;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TrailName")
        private String trailName;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        private DeliveryHistoryJobs(Builder builder) {
            this.createdTime = builder.createdTime;
            this.endTime = builder.endTime;
            this.homeRegion = builder.homeRegion;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.startTime = builder.startTime;
            this.trailName = builder.trailName;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryHistoryJobs create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return homeRegion
         */
        public String getHomeRegion() {
            return this.homeRegion;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return trailName
         */
        public String getTrailName() {
            return this.trailName;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private String endTime; 
            private String homeRegion; 
            private Long jobId; 
            private Integer jobStatus; 
            private String startTime; 
            private String trailName; 
            private String updatedTime; 

            /**
             * The time when the task was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The time when the task ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The home region of the trail.
             */
            public Builder homeRegion(String homeRegion) {
                this.homeRegion = homeRegion;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The task status. Valid values:
             * <p>
             * 
             * *   0: The task is initializing.
             * *   1: The task is delivering historical events.
             * *   2: The task is complete.
             * *   3: The task fails.
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The time when the task started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The name of the trail.
             */
            public Builder trailName(String trailName) {
                this.trailName = trailName;
                return this;
            }

            /**
             * The time when the task was updated.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public DeliveryHistoryJobs build() {
                return new DeliveryHistoryJobs(this);
            } 

        } 

    }
}
