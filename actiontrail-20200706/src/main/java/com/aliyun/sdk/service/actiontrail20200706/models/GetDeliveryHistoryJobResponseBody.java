// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeliveryHistoryJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeliveryHistoryJobResponseBody</p>
 */
public class GetDeliveryHistoryJobResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private java.util.List < Status> status;

    @NameInMap("TrailName")
    private String trailName;

    @NameInMap("UpdatedTime")
    private String updatedTime;

    private GetDeliveryHistoryJobResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.endTime = builder.endTime;
        this.homeRegion = builder.homeRegion;
        this.jobId = builder.jobId;
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.trailName = builder.trailName;
        this.updatedTime = builder.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliveryHistoryJobResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List < Status> getStatus() {
        return this.status;
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
        private String requestId; 
        private String startTime; 
        private java.util.List < Status> status; 
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
         * The ID of the task.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * A list of task statuses in each region.
         */
        public Builder status(java.util.List < Status> status) {
            this.status = status;
            return this;
        }

        /**
         * The name of the trail based on which the task delivers events.
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

        public GetDeliveryHistoryJobResponseBody build() {
            return new GetDeliveryHistoryJobResponseBody(this);
        } 

    } 

    public static class Status extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private Integer status;

        private Status(Builder builder) {
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String region; 
            private Integer status; 

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The task status in each region. Valid values:
             * <p>
             * 
             * *   0: The task is initializing.
             * *   1: The task is delivering historical events.
             * *   2: The task is complete.
             * *   3: The task fails.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
}
