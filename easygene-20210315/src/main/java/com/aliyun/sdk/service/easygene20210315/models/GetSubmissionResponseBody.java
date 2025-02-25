// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSubmissionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubmissionResponseBody</p>
 */
public class GetSubmissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Submission")
    private Submission submission;

    private GetSubmissionResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.submission = builder.submission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubmissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return submission
     */
    public Submission getSubmission() {
        return this.submission;
    }

    public static final class Builder {
        private String hostId; 
        private String requestId; 
        private Submission submission; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * Submission.
         */
        public Builder submission(Submission submission) {
            this.submission = submission;
            return this;
        }

        public GetSubmissionResponseBody build() {
            return new GetSubmissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubmissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubmissionResponseBody</p>
     */
    public static class RunStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aborted")
        private Long aborted;

        @com.aliyun.core.annotation.NameInMap("Aborting")
        private Long aborting;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Pending")
        private Long pending;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Long running;

        @com.aliyun.core.annotation.NameInMap("Submitted")
        private Long submitted;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
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
    /**
     * 
     * {@link GetSubmissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubmissionResponseBody</p>
     */
    public static class Submission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("RunStats")
        private RunStats runStats;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmissionId")
        private String submissionId;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Submission(Builder builder) {
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

        public static Submission create() {
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

            public Submission build() {
                return new Submission(this);
            } 

        } 

    }
}
