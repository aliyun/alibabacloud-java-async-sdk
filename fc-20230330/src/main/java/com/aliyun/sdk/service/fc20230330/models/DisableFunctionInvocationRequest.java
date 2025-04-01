// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link DisableFunctionInvocationRequest} extends {@link RequestModel}
 *
 * <p>DisableFunctionInvocationRequest</p>
 */
public class DisableFunctionInvocationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("abortOngoingRequest")
    private Boolean abortOngoingRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private DisableFunctionInvocationRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.abortOngoingRequest = builder.abortOngoingRequest;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableFunctionInvocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return abortOngoingRequest
     */
    public Boolean getAbortOngoingRequest() {
        return this.abortOngoingRequest;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<DisableFunctionInvocationRequest, Builder> {
        private String functionName; 
        private Boolean abortOngoingRequest; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(DisableFunctionInvocationRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.abortOngoingRequest = request.abortOngoingRequest;
            this.reason = request.reason;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * abortOngoingRequest.
         */
        public Builder abortOngoingRequest(Boolean abortOngoingRequest) {
            this.putBodyParameter("abortOngoingRequest", abortOngoingRequest);
            this.abortOngoingRequest = abortOngoingRequest;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public DisableFunctionInvocationRequest build() {
            return new DisableFunctionInvocationRequest(this);
        } 

    } 

}
