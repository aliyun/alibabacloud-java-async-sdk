// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    private java.util.List < FailoverTestJobList> failoverTestJobList;

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

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return failoverTestJobList
     */
    public java.util.List < FailoverTestJobList> getFailoverTestJobList() {
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
        private java.util.List < FailoverTestJobList> failoverTestJobList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of failover tests.</p>
         */
        public Builder failoverTestJobList(java.util.List < FailoverTestJobList> failoverTestJobList) {
            this.failoverTestJobList = failoverTestJobList;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
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
        private java.util.List < String > resourceId;

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
             * <p>The description of the failover test.</p>
             * <p>The description must be 0 to 256 characters in length and cannot start with **http:// <strong>or</strong> https://**.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the failover test. Unit: minutes. Valid values: <strong>1 to 4320</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder jobDuration(String jobDuration) {
                this.jobDuration = jobDuration;
                return this;
            }

            /**
             * <p>The ID of the failover test.</p>
             * 
             * <strong>example:</strong>
             * <p>ftj-xxxxxxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Indicates whether the failover test is performed immediately. Valid values:</p>
             * <ul>
             * <li><strong>StartNow</strong></li>
             * <li><strong>StartLater</strong></li>
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
             * <p>The name of the failover test.</p>
             * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of the failover test resources.</p>
             */
            public Builder resourceId(java.util.List < String > resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the failover test resource. Only <strong>PHYSICALCONNECTION</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
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
             * <p>The status of the failover test. Valid values:</p>
             * <ul>
             * <li><strong>Init</strong></li>
             * <li><strong>Starting</strong></li>
             * <li><strong>Testing</strong></li>
             * <li><strong>Stopping</strong></li>
             * <li><strong>Stopped</strong></li>
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
             * StopTime.
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
