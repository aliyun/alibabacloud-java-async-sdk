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
         * <p>The details of the applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
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
         * <p>The total number of entries returned.</p>
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

        @com.aliyun.core.annotation.NameInMap("mbSeconds")
        private Long mbSeconds;

        @com.aliyun.core.annotation.NameInMap("resourceQueueId")
        private String resourceQueueId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("vcoreSeconds")
        private Long vcoreSeconds;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.cuHours = builder.cuHours;
            this.endTime = builder.endTime;
            this.mbSeconds = builder.mbSeconds;
            this.resourceQueueId = builder.resourceQueueId;
            this.startTime = builder.startTime;
            this.state = builder.state;
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
         * @return mbSeconds
         */
        public Long getMbSeconds() {
            return this.mbSeconds;
        }

        /**
         * @return resourceQueueId
         */
        public String getResourceQueueId() {
            return this.resourceQueueId;
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
            private Long mbSeconds; 
            private String resourceQueueId; 
            private String startTime; 
            private String state; 
            private Long vcoreSeconds; 
            private String webUI; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.cuHours = model.cuHours;
                this.endTime = model.endTime;
                this.mbSeconds = model.mbSeconds;
                this.resourceQueueId = model.resourceQueueId;
                this.startTime = model.startTime;
                this.state = model.state;
                this.vcoreSeconds = model.vcoreSeconds;
                this.webUI = model.webUI;
            } 

            /**
             * <p>The ID of the application that is submitted by using a Kyuubi gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The name of the Spark application that is submitted by using a Kyuubi gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The number of CUs consumed during a specified cycle of a task. The value is an estimated value. Refer to your Alibaba Cloud bill for the actual number of consumed CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.238302</p>
             */
            public Builder cuHours(Double cuHours) {
                this.cuHours = cuHours;
                return this;
            }

            /**
             * <p>The time when the task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-12 20:02:02</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The total amount of memory allocated to the job multiplied by the running duration (seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>3513900</p>
             */
            public Builder mbSeconds(Long mbSeconds) {
                this.mbSeconds = mbSeconds;
                return this;
            }

            /**
             * <p>The name of the resource queue on which the Spark jobs run.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * <p>The time when the task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-12 19:59:16</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the Spark application.</p>
             * <ul>
             * <li>STARTING</li>
             * <li>RUNNING</li>
             * <li>TERMINATED</li>
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
             * <p>The total number of CPU cores allocated to the job multiplied by the running duration (seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>780</p>
             */
            public Builder vcoreSeconds(Long vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * <p>The URL of the web UI for the Spark application.</p>
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
