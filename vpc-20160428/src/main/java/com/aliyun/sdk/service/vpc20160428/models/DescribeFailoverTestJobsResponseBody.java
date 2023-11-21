// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFailoverTestJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFailoverTestJobsResponseBody</p>
 */
public class DescribeFailoverTestJobsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("FailoverTestJobList")
    private java.util.List < FailoverTestJobList> failoverTestJobList;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * FailoverTestJobList.
         */
        public Builder failoverTestJobList(java.util.List < FailoverTestJobList> failoverTestJobList) {
            this.failoverTestJobList = failoverTestJobList;
            return this;
        }

        /**
         * MaxResults.
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

    public static class FailoverTestJobList extends TeaModel {
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

            public FailoverTestJobList build() {
                return new FailoverTestJobList(this);
            } 

        } 

    }
}
