// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobResponseBody</p>
 */
public class CreateJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobResponseBody create() {
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
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateJobResponseBody build() {
            return new CreateJobResponseBody(this);
        } 

    } 

}
