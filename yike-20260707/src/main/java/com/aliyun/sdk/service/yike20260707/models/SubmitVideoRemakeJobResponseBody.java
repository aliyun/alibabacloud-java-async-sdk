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
 * {@link SubmitVideoRemakeJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitVideoRemakeJobResponseBody</p>
 */
public class SubmitVideoRemakeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitVideoRemakeJobResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoRemakeJobResponseBody create() {
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

        private Builder(SubmitVideoRemakeJobResponseBody model) {
            this.errorCode = model.errorCode;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4321-ABCD-123456789012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitVideoRemakeJobResponseBody build() {
            return new SubmitVideoRemakeJobResponseBody(this);
        } 

    } 

}
