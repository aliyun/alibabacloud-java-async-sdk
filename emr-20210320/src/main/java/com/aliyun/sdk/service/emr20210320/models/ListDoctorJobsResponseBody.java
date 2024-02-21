// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorJobsResponseBody</p>
 */
public class ListDoctorJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the jobs.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorJobsResponseBody build() {
            return new ListDoctorJobsResponseBody(this);
        } 

    } 

    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private MemSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MemSeconds build() {
                return new MemSeconds(this);
            } 

        } 

    }
    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private VcoreSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public VcoreSeconds build() {
                return new VcoreSeconds(this);
            } 

        } 

    }
    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        private Metrics(Builder builder) {
            this.memSeconds = builder.memSeconds;
            this.vcoreSeconds = builder.vcoreSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return memSeconds
         */
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public static final class Builder {
            private MemSeconds memSeconds; 
            private VcoreSeconds vcoreSeconds; 

            /**
             * The amount of memory consumed.
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * The CPU usage.
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ElapsedTime")
        private Long elapsedTime;

        @NameInMap("FinalStatus")
        private String finalStatus;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("LaunchTime")
        private Long launchTime;

        @NameInMap("Metrics")
        private Metrics metrics;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Type")
        private String type;

        @NameInMap("User")
        private String user;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.elapsedTime = builder.elapsedTime;
            this.finalStatus = builder.finalStatus;
            this.finishTime = builder.finishTime;
            this.launchTime = builder.launchTime;
            this.metrics = builder.metrics;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return finalStatus
         */
        public String getFinalStatus() {
            return this.finalStatus;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return launchTime
         */
        public Long getLaunchTime() {
            return this.launchTime;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Long elapsedTime; 
            private String finalStatus; 
            private Long finishTime; 
            private Long launchTime; 
            private Metrics metrics; 
            private String queue; 
            private Long startTime; 
            private String state; 
            private String type; 
            private String user; 

            /**
             * The ID of the job that was submitted to YARN.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the job.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The total running time of the job. Unit: milliseconds.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The final state of the job. Valid values:
             * <p>
             * 
             * *   SUCCEEDED
             * *   FAILED
             * *   KILLED
             * *   ENDED
             * *   UNDEFINED
             */
            public Builder finalStatus(String finalStatus) {
                this.finalStatus = finalStatus;
                return this;
            }

            /**
             * The end time of the job. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The time when the job was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * The data about the metrics.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * The YARN queue to which the job was submitted.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * The time when the job was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The running state of the job. Valid values:
             * <p>
             * 
             * *   FINISHED
             * *   FAILED
             * *   KILLED
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The type of the compute engine.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The username that was used to submit the job.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
