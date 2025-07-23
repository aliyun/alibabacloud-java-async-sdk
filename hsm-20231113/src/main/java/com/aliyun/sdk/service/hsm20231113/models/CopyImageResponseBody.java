// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CopyImageResponseBody model) {
            this.completed = model.completed;
            this.createTime = model.createTime;
            this.error = model.error;
            this.jobId = model.jobId;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.response = model.response;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>Indicates whether the task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * <p>The time when the task is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724379766191</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The error message returned if the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationTimeout</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>job-202401250936hze747fd7e0007005</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response returned after the task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>create</li>
         * <li>cancel</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>create</p>
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
