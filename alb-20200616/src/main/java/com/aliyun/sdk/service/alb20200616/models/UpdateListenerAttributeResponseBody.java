// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateListenerAttributeResponseBody</p>
 */
public class UpdateListenerAttributeResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateListenerAttributeResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerAttributeResponseBody create() {
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
         * 异步任务Id
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateListenerAttributeResponseBody build() {
            return new UpdateListenerAttributeResponseBody(this);
        } 

    } 

}
