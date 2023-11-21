// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFailoverTestJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFailoverTestJobResponseBody</p>
 */
public class DescribeFailoverTestJobResponseBody extends TeaModel {
    @NameInMap("FailoverTestJobModel")
    private FailoverTestJobModel failoverTestJobModel;

    @NameInMap("RequestId")
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
         * FailoverTestJobModel.
         */
        public Builder failoverTestJobModel(FailoverTestJobModel failoverTestJobModel) {
            this.failoverTestJobModel = failoverTestJobModel;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("JobDuration")
        private String jobDuration;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceId")
        private java.util.List < String > resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StopTime")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * JobDuration.
             */
            public Builder jobDuration(String jobDuration) {
                this.jobDuration = jobDuration;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(java.util.List < String > resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StopTime.
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
