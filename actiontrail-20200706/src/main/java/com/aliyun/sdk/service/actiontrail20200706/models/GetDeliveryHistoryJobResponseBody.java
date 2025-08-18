// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetDeliveryHistoryJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeliveryHistoryJobResponseBody</p>
 */
public class GetDeliveryHistoryJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("HomeRegion")
    private String homeRegion;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private Integer jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<Status> status;

    @com.aliyun.core.annotation.NameInMap("TrailName")
    private String trailName;

    @com.aliyun.core.annotation.NameInMap("UpdatedTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Status> getStatus() {
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
        private java.util.List<Status> status; 
        private String trailName; 
        private String updatedTime; 

        private Builder() {
        } 

        private Builder(GetDeliveryHistoryJobResponseBody model) {
            this.createdTime = model.createdTime;
            this.endTime = model.endTime;
            this.homeRegion = model.homeRegion;
            this.jobId = model.jobId;
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.trailName = model.trailName;
            this.updatedTime = model.updatedTime;
        } 

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T07:15:03Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The time when the task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T07:20:03Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The home region of the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>16602</p>
         */
        public Builder jobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>0: The task is initializing.</li>
         * <li>1: The task is delivering historical events.</li>
         * <li>2: The task is complete.</li>
         * <li>3: The task fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder jobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FAFEC427-A00D-5653-B837-D0FA52220D8C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26T07:15:03Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>A list of task statuses in each region.</p>
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the trail based on which the task delivers events.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        public Builder trailName(String trailName) {
            this.trailName = trailName;
            return this;
        }

        /**
         * <p>The time when the task was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T07:28:47Z</p>
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public GetDeliveryHistoryJobResponseBody build() {
            return new GetDeliveryHistoryJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeliveryHistoryJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeliveryHistoryJobResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Status model) {
                this.region = model.region;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The task status in each region. Valid values:</p>
             * <ul>
             * <li>0: The task is initializing.</li>
             * <li>1: The task is delivering historical events.</li>
             * <li>2: The task is complete.</li>
             * <li>3: The task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
