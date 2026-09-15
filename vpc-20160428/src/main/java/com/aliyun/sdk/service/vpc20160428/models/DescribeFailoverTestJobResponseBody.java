// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFailoverTestJobResponseBody model) {
            this.failoverTestJobModel = model.failoverTestJobModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The failover test job.</p>
         */
        public Builder failoverTestJobModel(FailoverTestJobModel failoverTestJobModel) {
            this.failoverTestJobModel = failoverTestJobModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C44F62BE-9CE7-4277-B117-69243F3988BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFailoverTestJobResponseBody build() {
            return new DescribeFailoverTestJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFailoverTestJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFailoverTestJobResponseBody</p>
     */
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
        private java.util.List<String> resourceId;

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
        public java.util.List<String> getResourceId() {
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
            private java.util.List<String> resourceId; 
            private String resourceType; 
            private String startTime; 
            private String status; 
            private String stopTime; 

            private Builder() {
            } 

            private Builder(FailoverTestJobModel model) {
                this.description = model.description;
                this.jobDuration = model.jobDuration;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.name = model.name;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stopTime = model.stopTime;
            } 

            /**
             * <p>The description of the failover test job.</p>
             * <p>The description is 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The failover test duration. Unit: minutes. Valid values: <strong>1 to 4320</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder jobDuration(String jobDuration) {
                this.jobDuration = jobDuration;
                return this;
            }

            /**
             * <p>The failover test job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ftj-bp1yh6mvi13aq3g8w****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The failover test type. Valid values:</p>
             * <ul>
             * <li><p><strong>StartNow</strong>: start immediately. The test starts immediately after the job is created.</p>
             * </li>
             * <li><p><strong>StartLater</strong>: start later. Only the test job is created without starting the test.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StartNow</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The name of the failover test job.</p>
             * <p>The name is 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of failover test resource IDs.</p>
             */
            public Builder resourceId(java.util.List<String> resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The failover test resource type. Valid values: <strong>PHYSICALCONNECTION</strong>: Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The start time of the failover test job. The time is displayed in UTC in the YYYY-MM-DDThh:mm:ssZ format as defined by ISO 8601.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T14:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the failover test job. Valid values:</p>
             * <ul>
             * <li><p><strong>Init</strong>: pending.</p>
             * </li>
             * <li><p><strong>Starting</strong>: starting.</p>
             * </li>
             * <li><p><strong>Testing</strong>: in progress.</p>
             * </li>
             * <li><p><strong>Stopping</strong>: stopping.</p>
             * </li>
             * <li><p><strong>Stopped</strong>: completed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The end time of the failover test job. The time is displayed in UTC in the YYYY-MM-DDThh:mm:ssZ format as defined by ISO 8601.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T15:00:00Z</p>
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
