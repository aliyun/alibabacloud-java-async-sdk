// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAudioProduceJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAudioProduceJobResponseBody</p>
 */
public class SubmitAudioProduceJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private SubmitAudioProduceJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAudioProduceJobResponseBody create() {
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

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private String state; 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
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

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public SubmitAudioProduceJobResponseBody build() {
            return new SubmitAudioProduceJobResponseBody(this);
        } 

    } 

}
