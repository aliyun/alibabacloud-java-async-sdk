// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateSignalResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSignalResponseBody</p>
 */
public class CreateSignalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signal")
    private String signal;

    @com.aliyun.core.annotation.NameInMap("SignalId")
    private String signalId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateSignalResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.signal = builder.signal;
        this.signalId = builder.signalId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return signal
     */
    public String getSignal() {
        return this.signal;
    }

    /**
     * @return signalId
     */
    public String getSignalId() {
        return this.signalId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private String signal; 
        private String signalId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateSignalResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.signal = model.signal;
            this.signalId = model.signalId;
            this.status = model.status;
        } 

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
         * Signal.
         */
        public Builder signal(String signal) {
            this.signal = signal;
            return this;
        }

        /**
         * SignalId.
         */
        public Builder signalId(String signalId) {
            this.signalId = signalId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateSignalResponseBody build() {
            return new CreateSignalResponseBody(this);
        } 

    } 

}
