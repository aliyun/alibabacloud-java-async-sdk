// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStreamingJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStreamingJobResponseBody</p>
 */
public class CreateStreamingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Integer jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateStreamingJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer jobId; 
        private String requestId; 

        /**
         * JobId.
         */
        public Builder jobId(Integer jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateStreamingJobResponseBody build() {
            return new CreateStreamingJobResponseBody(this);
        } 

    } 

}
