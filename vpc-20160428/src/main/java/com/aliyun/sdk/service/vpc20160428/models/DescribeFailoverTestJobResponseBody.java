// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFailoverTestJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFailoverTestJobResponseBody</p>
 */
public class DescribeFailoverTestJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailoverTestJobModel")
    private FailoverTestJobModel failoverTestJobModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFailoverTestJobResponseBody(Builder builder) {
        this.failoverTestJobModel = builder.failoverTestJobModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFailoverTestJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return failoverTestJobModel
     */
    public FailoverTestJobModel getFailoverTestJobModel() {
        return this.failoverTestJobModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FailoverTestJobModel failoverTestJobModel; 
        private String requestId; 

        /**
         * The failover test.
         */
        public Builder failoverTestJobModel(FailoverTestJobModel failoverTestJobModel) {
            this.failoverTestJobModel = failoverTestJobModel;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFailoverTestJobResponseBody build() {
            return new DescribeFailoverTestJobResponseBody(this);
        } 

    } 

    public static class FailoverTestJobModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("JobDuration")
        private String jobDuration;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private java.util.List < String > resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        private FailoverTestJobModel(Builder builder) {
            this.description = builder.description;
            this.jobDuration = builder.jobDuration;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.name = builder.name;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailoverTestJobModel create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return jobDuration
         */
        public String getJobDuration() {
            return this.jobDuration;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceId
         */
        public java.util.List < String > getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
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
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private String description; 
            private String jobDuration; 
            private String jobId; 
            private String jobType; 
            private String name; 
            private java.util.List < String > resourceId; 
            private String resourceType; 
            private String startTime; 
            private String status; 
            private String stopTime; 

            /**
             * The description of the failover test.
             * <p>
             * 
             * The description must be 0 to 256 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The duration of the failover test. Unit: minutes. Valid values: **1 to 4320**.
             */
            public Builder jobDuration(String jobDuration) {
                this.jobDuration = jobDuration;
                return this;
            }

            /**
             * The ID of the failover test.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Indicates whether the failover test is performed immediately. Valid values:
             * <p>
             * 
             * *   **StartNow**
             * *   **StartLater**
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The name of the failover test.
             * <p>
             * 
             * The name must be 0 to 128 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The IDs of failover test resources.
             */
            public Builder resourceId(java.util.List < String > resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of failover test resource. Only **PHYSICALCONNECTION** is returned.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The start time of the failover test. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the failover test. Valid values:
             * <p>
             * 
             * *   **Init**
             * *   **Starting**
             * *   **Testing**
             * *   **Stopping**
             * *   **Stopped**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The end time of the failover test. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public FailoverTestJobModel build() {
                return new FailoverTestJobModel(this);
            } 

        } 

    }
}
