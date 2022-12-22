// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFlowRequest} extends {@link RequestModel}
 *
 * <p>InvokeFlowRequest</p>
 */
public class InvokeFlowRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Data")
    private String data;

    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Body
    @NameInMap("Parameters")
    private String parameters;

    private InvokeFlowRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.data = builder.data;
        this.flowId = builder.flowId;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<InvokeFlowRequest, Builder> {
        private String clientToken; 
        private String data; 
        private String flowId; 
        private String parameters; 

        private Builder() {
            super();
        } 

        private Builder(InvokeFlowRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.data = request.data;
            this.flowId = request.flowId;
            this.parameters = request.parameters;
        } 

        /**
         * The token that is used to guarantee idempotence to avoid repeated operations.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The data for invoking the workflow.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The parameters required by the template, which must be in JSON format.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The input parameters required by the trigger of the workflow execution, which must be in JSON format.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public InvokeFlowRequest build() {
            return new InvokeFlowRequest(this);
        } 

    } 

}
