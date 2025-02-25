// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitFpFileDeleteJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitFpFileDeleteJobResponseBody</p>
 */
public class SubmitFpFileDeleteJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitFpFileDeleteJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFpFileDeleteJobResponseBody create() {
        return builder().build();
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
        private String jobId; 
        private String requestId; 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D127C68E-F1A1-4CE5-A874-8FF724881A12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitFpFileDeleteJobResponseBody build() {
            return new SubmitFpFileDeleteJobResponseBody(this);
        } 

    } 

}
