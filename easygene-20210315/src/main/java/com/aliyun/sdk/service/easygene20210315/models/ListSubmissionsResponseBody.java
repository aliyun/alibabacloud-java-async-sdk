// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubmissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubmissionsResponseBody</p>
 */
public class ListSubmissionsResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Submissions")
    private java.util.List < Submissions> submissions;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSubmissionsResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.submissions = builder.submissions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubmissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
     * @return submissions
     */
    public java.util.List < Submissions> getSubmissions() {
        return this.submissions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Submissions> submissions; 
        private Integer totalCount; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * Submissions.
         */
        public Builder submissions(java.util.List < Submissions> submissions) {
            this.submissions = submissions;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSubmissionsResponseBody build() {
            return new ListSubmissionsResponseBody(this);
        } 

    } 

    public static class RunStats extends TeaModel {
        @NameInMap("Aborted")
        private Long aborted;

        @NameInMap("Aborting")
        private Long aborting;

        @NameInMap("Failed")
        private Long failed;

        @NameInMap("Pending")
        private Long pending;

        @NameInMap("Running")
        private Long running;

        @NameInMap("Submitted")
        private Long submitted;

        @NameInMap("Succeeded")
        private Long succeeded;

        private RunStats(Builder builder) {
            this.aborted = builder.aborted;
            this.aborting = builder.aborting;
            this.failed = builder.failed;
            this.pending = builder.pending;
            this.running = builder.running;
            this.submitted = builder.submitted;
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunStats create() {
            return builder().build();
        }

        /**
         * @return aborted
         */
        public Long getAborted() {
            return this.aborted;
        }

        /**
         * @return aborting
         */
        public Long getAborting() {
            return this.aborting;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return pending
         */
        public Long getPending() {
            return this.pending;
        }

        /**
         * @return running
         */
        public Long getRunning() {
            return this.running;
        }

        /**
         * @return submitted
         */
        public Long getSubmitted() {
            return this.submitted;
        }

        /**
         * @return succeeded
         */
        public Long getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Long aborted; 
            private Long aborting; 
            private Long failed; 
            private Long pending; 
            private Long running; 
            private Long submitted; 
            private Long succeeded; 

            /**
             * Aborted.
             */
            public Builder aborted(Long aborted) {
                this.aborted = aborted;
                return this;
            }

            /**
             * Aborting.
             */
            public Builder aborting(Long aborting) {
                this.aborting = aborting;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Pending.
             */
            public Builder pending(Long pending) {
                this.pending = pending;
                return this;
            }

            /**
             * Running.
             */
            public Builder running(Long running) {
                this.running = running;
                return this;
            }

            /**
             * Submitted.
             */
            public Builder submitted(Long submitted) {
                this.submitted = submitted;
                return this;
            }

            /**
             * Succeeded.
             */
            public Builder succeeded(Long succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public RunStats build() {
                return new RunStats(this);
            } 

        } 

    }
    public static class Submissions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("RunStats")
        private RunStats runStats;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmissionId")
        private String submissionId;

        @NameInMap("Workspace")
        private String workspace;

        private Submissions(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.entityType = builder.entityType;
            this.runStats = builder.runStats;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submissionId = builder.submissionId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Submissions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return runStats
         */
        public RunStats getRunStats() {
            return this.runStats;
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
         * @return submissionId
         */
        public String getSubmissionId() {
            return this.submissionId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String createTime; 
            private String endTime; 
            private String entityType; 
            private RunStats runStats; 
            private String startTime; 
            private String status; 
            private String submissionId; 
            private String workspace; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * RunStats.
             */
            public Builder runStats(RunStats runStats) {
                this.runStats = runStats;
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
             * SubmissionId.
             */
            public Builder submissionId(String submissionId) {
                this.submissionId = submissionId;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Submissions build() {
                return new Submissions(this);
            } 

        } 

    }
}
