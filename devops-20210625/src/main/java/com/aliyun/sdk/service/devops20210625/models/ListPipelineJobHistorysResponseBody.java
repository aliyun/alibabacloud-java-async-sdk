// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobHistorysResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineJobHistorysResponseBody</p>
 */
public class ListPipelineJobHistorysResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListPipelineJobHistorysResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.jobs = builder.jobs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineJobHistorysResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Jobs> jobs; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPipelineJobHistorysResponseBody build() {
            return new ListPipelineJobHistorysResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("executeNumber")
        private Integer executeNumber;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("jobId")
        private Long jobId;

        @NameInMap("jobName")
        private String jobName;

        @NameInMap("operatorAccountId")
        private String operatorAccountId;

        @NameInMap("pipelineId")
        private Long pipelineId;

        @NameInMap("pipelineRunId")
        private Long pipelineRunId;

        @NameInMap("sources")
        private String sources;

        @NameInMap("status")
        private String status;

        private Jobs(Builder builder) {
            this.executeNumber = builder.executeNumber;
            this.identifier = builder.identifier;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.operatorAccountId = builder.operatorAccountId;
            this.pipelineId = builder.pipelineId;
            this.pipelineRunId = builder.pipelineRunId;
            this.sources = builder.sources;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return executeNumber
         */
        public Integer getExecuteNumber() {
            return this.executeNumber;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return operatorAccountId
         */
        public String getOperatorAccountId() {
            return this.operatorAccountId;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineRunId
         */
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return sources
         */
        public String getSources() {
            return this.sources;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer executeNumber; 
            private String identifier; 
            private Long jobId; 
            private String jobName; 
            private String operatorAccountId; 
            private Long pipelineId; 
            private Long pipelineRunId; 
            private String sources; 
            private String status; 

            /**
             * executeNumber.
             */
            public Builder executeNumber(Integer executeNumber) {
                this.executeNumber = executeNumber;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * jobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * operatorAccountId.
             */
            public Builder operatorAccountId(String operatorAccountId) {
                this.operatorAccountId = operatorAccountId;
                return this;
            }

            /**
             * pipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * pipelineRunId.
             */
            public Builder pipelineRunId(Long pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * sources.
             */
            public Builder sources(String sources) {
                this.sources = sources;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
