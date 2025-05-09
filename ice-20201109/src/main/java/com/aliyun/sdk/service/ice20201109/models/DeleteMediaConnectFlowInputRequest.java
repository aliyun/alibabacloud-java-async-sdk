// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteMediaConnectFlowInputRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaConnectFlowInputRequest</p>
 */
public class DeleteMediaConnectFlowInputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputName")
    private String inputName;

    private DeleteMediaConnectFlowInputRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.inputName = builder.inputName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaConnectFlowInputRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return inputName
     */
    public String getInputName() {
        return this.inputName;
    }

    public static final class Builder extends Request.Builder<DeleteMediaConnectFlowInputRequest, Builder> {
        private String flowId; 
        private String inputName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaConnectFlowInputRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.inputName = request.inputName;
        } 

        /**
         * <p>The flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0381f478-7d53-4076-9d5f-27680a6f73e7</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * InputName.
         */
        public Builder inputName(String inputName) {
            this.putQueryParameter("InputName", inputName);
            this.inputName = inputName;
            return this;
        }

        @Override
        public DeleteMediaConnectFlowInputRequest build() {
            return new DeleteMediaConnectFlowInputRequest(this);
        } 

    } 

}
