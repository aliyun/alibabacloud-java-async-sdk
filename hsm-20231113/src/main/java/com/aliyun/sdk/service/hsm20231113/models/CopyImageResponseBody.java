// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyImageResponseBody} extends {@link TeaModel}
 *
 * <p>CopyImageResponseBody</p>
 */
public class CopyImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Completed")
    private Boolean completed;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Response")
    private String response;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CopyImageResponseBody(Builder builder) {
        this.completed = builder.completed;
        this.createTime = builder.createTime;
        this.error = builder.error;
        this.jobId = builder.jobId;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.response = builder.response;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return completed
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return response
     */
    public String getResponse() {
        return this.response;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean completed; 
        private String createTime; 
        private String error; 
        private String jobId; 
        private Integer progress; 
        private String requestId; 
        private String response; 
        private String status; 
        private String type; 

        /**
         * Completed.
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
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
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
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
         * Response.
         */
        public Builder response(String response) {
            this.response = response;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CopyImageResponseBody build() {
            return new CopyImageResponseBody(this);
        } 

    } 

}
