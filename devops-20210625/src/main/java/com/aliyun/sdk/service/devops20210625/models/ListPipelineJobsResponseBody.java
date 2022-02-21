// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineJobsResponseBody</p>
 */
public class ListPipelineJobsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListPipelineJobsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.jobs = builder.jobs;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineJobsResponseBody create() {
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

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Jobs> jobs; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
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
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPipelineJobsResponseBody build() {
            return new ListPipelineJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("identifier")
        private String identifier;

        @NameInMap("jobName")
        private String jobName;

        @NameInMap("lastJobId")
        private Long lastJobId;

        @NameInMap("lastJobParams")
        private String lastJobParams;

        private Jobs(Builder builder) {
            this.identifier = builder.identifier;
            this.jobName = builder.jobName;
            this.lastJobId = builder.lastJobId;
            this.lastJobParams = builder.lastJobParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return lastJobId
         */
        public Long getLastJobId() {
            return this.lastJobId;
        }

        /**
         * @return lastJobParams
         */
        public String getLastJobParams() {
            return this.lastJobParams;
        }

        public static final class Builder {
            private String identifier; 
            private String jobName; 
            private Long lastJobId; 
            private String lastJobParams; 

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
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
             * lastJobId.
             */
            public Builder lastJobId(Long lastJobId) {
                this.lastJobId = lastJobId;
                return this;
            }

            /**
             * lastJobParams.
             */
            public Builder lastJobParams(String lastJobParams) {
                this.lastJobParams = lastJobParams;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
