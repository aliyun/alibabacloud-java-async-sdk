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
 * {@link ListDeliveryHistoryJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryHistoryJobsResponseBody</p>
 */
public class ListDeliveryHistoryJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryHistoryJobs")
    private java.util.List<DeliveryHistoryJobs> deliveryHistoryJobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryHistoryJobs
     */
    public java.util.List<DeliveryHistoryJobs> getDeliveryHistoryJobs() {
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
        private java.util.List<DeliveryHistoryJobs> deliveryHistoryJobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDeliveryHistoryJobsResponseBody model) {
            this.deliveryHistoryJobs = model.deliveryHistoryJobs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of historical event delivery tasks.</p>
         */
        public Builder deliveryHistoryJobs(java.util.List<DeliveryHistoryJobs> deliveryHistoryJobs) {
            this.deliveryHistoryJobs = deliveryHistoryJobs;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B190816C-6DCA-4DC5-9B8E-EE0367B57CFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of historical event delivery tasks returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeliveryHistoryJobsResponseBody build() {
            return new ListDeliveryHistoryJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeliveryHistoryJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeliveryHistoryJobsResponseBody</p>
     */
    public static class DeliveryHistoryJobs extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TrailName")
        private String trailName;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
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

            private Builder() {
            } 

            private Builder(DeliveryHistoryJobs model) {
                this.createdTime = model.createdTime;
                this.endTime = model.endTime;
                this.homeRegion = model.homeRegion;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.startTime = model.startTime;
                this.trailName = model.trailName;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-26T03:17:04Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The time when the task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-26T03:22:04Z</p>
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
             * <p>The task ID.</p>
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
             * <p>The time when the task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-26T03:17:04Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the trail.</p>
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
             * <p>2021-04-26T03:20:08Z</p>
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
