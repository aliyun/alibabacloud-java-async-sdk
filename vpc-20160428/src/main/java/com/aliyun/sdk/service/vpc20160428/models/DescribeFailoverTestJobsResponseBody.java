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
 * {@link DescribeFailoverTestJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFailoverTestJobsResponseBody</p>
 */
public class DescribeFailoverTestJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("FailoverTestJobList")
    private java.util.List<FailoverTestJobList> failoverTestJobList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFailoverTestJobsResponseBody(Builder builder) {
        this.count = builder.count;
        this.failoverTestJobList = builder.failoverTestJobList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFailoverTestJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return failoverTestJobList
     */
    public java.util.List<FailoverTestJobList> getFailoverTestJobList() {
        return this.failoverTestJobList;
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
        private Integer count; 
        private java.util.List<FailoverTestJobList> failoverTestJobList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFailoverTestJobsResponseBody model) {
            this.count = model.count;
            this.failoverTestJobList = model.failoverTestJobList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of failover test jobs.</p>
         */
        public Builder failoverTestJobList(java.util.List<FailoverTestJobList> failoverTestJobList) {
            this.failoverTestJobList = failoverTestJobList;
            return this;
        }

        /**
         * <p>The number of entries per page for a paginated query. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li><p>Leave this parameter empty for the first query or if no subsequent query is required.</p>
         * </li>
         * <li><p>If a subsequent query is required, set this parameter to the NextToken value returned in the previous API call.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFailoverTestJobsResponseBody build() {
            return new DescribeFailoverTestJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFailoverTestJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFailoverTestJobsResponseBody</p>
     */
    public static class FailoverTestJobList extends TeaModel {
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

        private FailoverTestJobList(Builder builder) {
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

        public static FailoverTestJobList create() {
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

            private Builder(FailoverTestJobList model) {
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
             * <p>The description is 0 to 256 characters in length and cannot start with <strong>http://</strong> or <strong>https://</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The test duration. Unit: minutes. Valid values: <strong>1</strong> to <strong>4320</strong>.</p>
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
             * <li><p><strong>StartNow</strong>: starts the test immediately after the failover test job is created.</p>
             * </li>
             * <li><p><strong>StartLater</strong>: creates the failover test job without starting the test.</p>
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
             * <p>The start time of the failover test job. The time is displayed in UTC in the YYYY-MM-DDThh:mm:ssZ format based on the ISO 8601 standard.</p>
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
             * <p>The end time of the failover test job. The time is displayed in UTC in the YYYY-MM-DDThh:mm:ssZ format based on the ISO 8601 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T15:00:00Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public FailoverTestJobList build() {
                return new FailoverTestJobList(this);
            } 

        } 

    }
}
