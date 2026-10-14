// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListKyuubiSparkApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKyuubiSparkApplicationsResponseBody</p>
 */
public class ListKyuubiSparkApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListKyuubiSparkApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKyuubiSparkApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
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
        private java.util.List<Applications> applications; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListKyuubiSparkApplicationsResponseBody model) {
            this.applications = model.applications;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application details.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The maximum number of records to retrieve at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKyuubiSparkApplicationsResponseBody build() {
            return new ListKyuubiSparkApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKyuubiSparkApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKyuubiSparkApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("applicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("cuHours")
        private Double cuHours;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("exitReason")
        private String exitReason;

        @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
        private String kyuubiServiceId;

        @com.aliyun.core.annotation.NameInMap("latestSqlStatementStatus")
        private String latestSqlStatementStatus;

        @com.aliyun.core.annotation.NameInMap("mbSeconds")
        private Long mbSeconds;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("resourceQueueId")
        private String resourceQueueId;

        @com.aliyun.core.annotation.NameInMap("runLog")
        private RunLog runLog;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tag> tags;

        @com.aliyun.core.annotation.NameInMap("vcoreSeconds")
        private Long vcoreSeconds;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.cuHours = builder.cuHours;
            this.endTime = builder.endTime;
            this.exitReason = builder.exitReason;
            this.kyuubiServiceId = builder.kyuubiServiceId;
            this.latestSqlStatementStatus = builder.latestSqlStatementStatus;
            this.mbSeconds = builder.mbSeconds;
            this.priority = builder.priority;
            this.resourceQueueId = builder.resourceQueueId;
            this.runLog = builder.runLog;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.tags = builder.tags;
            this.vcoreSeconds = builder.vcoreSeconds;
            this.webUI = builder.webUI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return cuHours
         */
        public Double getCuHours() {
            return this.cuHours;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return exitReason
         */
        public String getExitReason() {
            return this.exitReason;
        }

        /**
         * @return kyuubiServiceId
         */
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        /**
         * @return latestSqlStatementStatus
         */
        public String getLatestSqlStatementStatus() {
            return this.latestSqlStatementStatus;
        }

        /**
         * @return mbSeconds
         */
        public Long getMbSeconds() {
            return this.mbSeconds;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return resourceQueueId
         */
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        /**
         * @return runLog
         */
        public RunLog getRunLog() {
            return this.runLog;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        /**
         * @return vcoreSeconds
         */
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        /**
         * @return webUI
         */
        public String getWebUI() {
            return this.webUI;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationName; 
            private Double cuHours; 
            private String endTime; 
            private String exitReason; 
            private String kyuubiServiceId; 
            private String latestSqlStatementStatus; 
            private Long mbSeconds; 
            private String priority; 
            private String resourceQueueId; 
            private RunLog runLog; 
            private String startTime; 
            private String state; 
            private java.util.List<Tag> tags; 
            private Long vcoreSeconds; 
            private String webUI; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.cuHours = model.cuHours;
                this.endTime = model.endTime;
                this.exitReason = model.exitReason;
                this.kyuubiServiceId = model.kyuubiServiceId;
                this.latestSqlStatementStatus = model.latestSqlStatementStatus;
                this.mbSeconds = model.mbSeconds;
                this.priority = model.priority;
                this.resourceQueueId = model.resourceQueueId;
                this.runLog = model.runLog;
                this.startTime = model.startTime;
                this.state = model.state;
                this.tags = model.tags;
                this.vcoreSeconds = model.vcoreSeconds;
                this.webUI = model.webUI;
            } 

            /**
             * <p>The ID of the Spark application submitted by Kyuubi.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The name of the Spark application submitted by Kyuubi.</p>
             * 
             * <strong>example:</strong>
             * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The number of compute units (CUs) consumed during the task execution. This value is an estimate. The actual value is subject to the bill.</p>
             * 
             * <strong>example:</strong>
             * <p>0.238302</p>
             */
            public Builder cuHours(Double cuHours) {
                this.cuHours = cuHours;
                return this;
            }

            /**
             * <p>The end time of the task. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-12 20:02:02</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The exit reason of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Exit Code: 137, Exit Reason: OOMKilled</p>
             */
            public Builder exitReason(String exitReason) {
                this.exitReason = exitReason;
                return this;
            }

            /**
             * <p>The ID of the Kyuubi service that submitted the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-2b93ec*******c9440c</p>
             */
            public Builder kyuubiServiceId(String kyuubiServiceId) {
                this.kyuubiServiceId = kyuubiServiceId;
                return this;
            }

            /**
             * <p>The execution status of the latest SQL statement in the application.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder latestSqlStatementStatus(String latestSqlStatementStatus) {
                this.latestSqlStatementStatus = latestSqlStatementStatus;
                return this;
            }

            /**
             * <p>The total memory allocated to the task multiplied by the task execution duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3513900</p>
             */
            public Builder mbSeconds(Long mbSeconds) {
                this.mbSeconds = mbSeconds;
                return this;
            }

            /**
             * <p>The priority of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The name of the resource queue in which the Spark task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * <p>The application log.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;driverStdOut&quot;:&quot;oss://bucket/path/to/stdout&quot;,&quot;driverStdError&quot;:&quot;oss://bucket/path/to/stderr&quot;,&quot;driverSyslog&quot;:&quot;oss://bucket/path/to/syslog&quot;,&quot;driverStartup&quot;:&quot;oss://bucket/path/to/startup&quot;}</p>
             */
            public Builder runLog(RunLog runLog) {
                this.runLog = runLog;
                return this;
            }

            /**
             * <p>The start time of the task. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-12 19:59:16</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the Spark application. Valid values:</p>
             * <ul>
             * <li>STARTING: The application is starting.</li>
             * <li>RUNNING: The application is running.</li>
             * <li>TERMINATED: The application is terminated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STARTING</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The list of tags for the Spark application.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total number of vcores allocated to the task multiplied by the task execution duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>780</p>
             */
            public Builder vcoreSeconds(Long vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * <p>The URL of the Spark application UI.</p>
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
