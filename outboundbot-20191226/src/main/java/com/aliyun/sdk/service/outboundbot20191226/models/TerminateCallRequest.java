// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateCallRequest} extends {@link RequestModel}
 *
 * <p>TerminateCallRequest</p>
 */
public class TerminateCallRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private TerminateCallRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<TerminateCallRequest, Builder> {
        private String callId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(TerminateCallRequest request) {
            super(request);
            this.callId = request.callId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public TerminateCallRequest build() {
            return new TerminateCallRequest(this);
        } 

    } 

}
