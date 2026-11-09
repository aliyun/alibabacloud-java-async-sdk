// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoCreativeGenerationJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitVideoCreativeGenerationJobResponseBody</p>
 */
public class SubmitVideoCreativeGenerationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitVideoCreativeGenerationJobResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoCreativeGenerationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String errorCode; 
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitVideoCreativeGenerationJobResponseBody model) {
            this.errorCode = model.errorCode;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code. This parameter is returned when the job is in the Failed state.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowTaskFailed</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B0E1A586AAC29742247</strong></strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitVideoCreativeGenerationJobResponseBody build() {
            return new SubmitVideoCreativeGenerationJobResponseBody(this);
        } 

    } 

}
