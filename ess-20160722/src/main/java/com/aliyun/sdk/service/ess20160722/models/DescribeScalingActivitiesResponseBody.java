// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivitiesResponseBody</p>
 */
public class DescribeScalingActivitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivities")
    private ScalingActivities scalingActivities;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingActivitiesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingActivities = builder.scalingActivities;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivitiesResponseBody create() {
        return builder().build();
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
     * @return scalingActivities
     */
    public ScalingActivities getScalingActivities() {
        return this.scalingActivities;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private ScalingActivities scalingActivities; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingActivities.
         */
        public Builder scalingActivities(ScalingActivities scalingActivities) {
            this.scalingActivities = scalingActivities;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingActivitiesResponseBody build() {
            return new DescribeScalingActivitiesResponseBody(this);
        } 

    } 

    public static class ScalingActivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedCapacity")
        private String attachedCapacity;

        @com.aliyun.core.annotation.NameInMap("AutoCreatedCapacity")
        private String autoCreatedCapacity;

        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
        private String scalingActivityId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private String totalCapacity;

        private ScalingActivity(Builder builder) {
            this.attachedCapacity = builder.attachedCapacity;
            this.autoCreatedCapacity = builder.autoCreatedCapacity;
            this.cause = builder.cause;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.progress = builder.progress;
            this.scalingActivityId = builder.scalingActivityId;
            this.scalingGroupId = builder.scalingGroupId;
            this.startTime = builder.startTime;
            this.statusCode = builder.statusCode;
            this.statusMessage = builder.statusMessage;
            this.totalCapacity = builder.totalCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivity create() {
            return builder().build();
        }

        /**
         * @return attachedCapacity
         */
        public String getAttachedCapacity() {
            return this.attachedCapacity;
        }

        /**
         * @return autoCreatedCapacity
         */
        public String getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return scalingActivityId
         */
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return totalCapacity
         */
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

        public static final class Builder {
            private String attachedCapacity; 
            private String autoCreatedCapacity; 
            private String cause; 
            private String description; 
            private String endTime; 
            private Integer progress; 
            private String scalingActivityId; 
            private String scalingGroupId; 
            private String startTime; 
            private String statusCode; 
            private String statusMessage; 
            private String totalCapacity; 

            /**
             * AttachedCapacity.
             */
            public Builder attachedCapacity(String attachedCapacity) {
                this.attachedCapacity = attachedCapacity;
                return this;
            }

            /**
             * AutoCreatedCapacity.
             */
            public Builder autoCreatedCapacity(String autoCreatedCapacity) {
                this.autoCreatedCapacity = autoCreatedCapacity;
                return this;
            }

            /**
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ScalingActivityId.
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * StatusMessage.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(String totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            public ScalingActivity build() {
                return new ScalingActivity(this);
            } 

        } 

    }
    public static class ScalingActivities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScalingActivity")
        private java.util.List < ScalingActivity> scalingActivity;

        private ScalingActivities(Builder builder) {
            this.scalingActivity = builder.scalingActivity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivities create() {
            return builder().build();
        }

        /**
         * @return scalingActivity
         */
        public java.util.List < ScalingActivity> getScalingActivity() {
            return this.scalingActivity;
        }

        public static final class Builder {
            private java.util.List < ScalingActivity> scalingActivity; 

            /**
             * ScalingActivity.
             */
            public Builder scalingActivity(java.util.List < ScalingActivity> scalingActivity) {
                this.scalingActivity = scalingActivity;
                return this;
            }

            public ScalingActivities build() {
                return new ScalingActivities(this);
            } 

        } 

    }
}
