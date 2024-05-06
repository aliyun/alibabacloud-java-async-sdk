// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeploymentJobResponseBody</p>
 */
public class CreateDeploymentJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDeploymentJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long jobId; 
        private String requestId; 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
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

        public CreateDeploymentJobResponseBody build() {
            return new CreateDeploymentJobResponseBody(this);
        } 

    } 

}
