// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Job} extends {@link TeaModel}
 *
 * <p>Job</p>
 */
public class Job extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Creator")
    private SimpleUser creator;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobResult")
    private JobResult jobResult;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private Job(Builder builder) {
        this.creator = builder.creator;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.jobId = builder.jobId;
        this.jobResult = builder.jobResult;
        this.jobType = builder.jobType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Job create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public SimpleUser getCreator() {
        return this.creator;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobResult
     */
    public JobResult getJobResult() {
        return this.jobResult;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private SimpleUser creator; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String jobId; 
        private JobResult jobResult; 
        private String jobType; 
        private String status; 

        /**
         * Creator.
         */
        public Builder creator(SimpleUser creator) {
            this.creator = creator;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
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
         * JobResult.
         */
        public Builder jobResult(JobResult jobResult) {
            this.jobResult = jobResult;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Job build() {
            return new Job(this);
        } 

    } 

    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultLink")
        private String resultLink;

        private JobResult(Builder builder) {
            this.resultLink = builder.resultLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return resultLink
         */
        public String getResultLink() {
            return this.resultLink;
        }

        public static final class Builder {
            private String resultLink; 

            /**
             * ResultLink.
             */
            public Builder resultLink(String resultLink) {
                this.resultLink = resultLink;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
}
