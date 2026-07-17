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
 * {@link CreateSignalRequest} extends {@link RequestModel}
 *
 * <p>CreateSignalRequest</p>
 */
public class CreateSignalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Signal")
    private String signal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    private SignalTarget target;

    private CreateSignalRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.signal = builder.signal;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignalRequest create() {
        return builder().build();
    }

@Override
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
     * @return signal
     */
    public String getSignal() {
        return this.signal;
    }

    /**
     * @return target
     */
    public SignalTarget getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<CreateSignalRequest, Builder> {
        private String jobId; 
        private String signal; 
        private SignalTarget target; 

        private Builder() {
            super();
        } 

        private Builder(CreateSignalRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.signal = request.signal;
            this.target = request.target;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Signal.
         */
        public Builder signal(String signal) {
            this.putBodyParameter("Signal", signal);
            this.signal = signal;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(SignalTarget target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public CreateSignalRequest build() {
            return new CreateSignalRequest(this);
        } 

    } 

}
