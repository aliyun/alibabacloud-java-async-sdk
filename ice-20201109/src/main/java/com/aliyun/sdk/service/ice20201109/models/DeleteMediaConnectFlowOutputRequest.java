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
 * {@link DeleteMediaConnectFlowOutputRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaConnectFlowOutputRequest</p>
 */
public class DeleteMediaConnectFlowOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputName;

    private DeleteMediaConnectFlowOutputRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.outputName = builder.outputName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaConnectFlowOutputRequest create() {
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
     * @return outputName
     */
    public String getOutputName() {
        return this.outputName;
    }

    public static final class Builder extends Request.Builder<DeleteMediaConnectFlowOutputRequest, Builder> {
        private String flowId; 
        private String outputName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaConnectFlowOutputRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.outputName = request.outputName;
        } 

        /**
         * <p>Flow instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * <p>Output name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestOutput</p>
         */
        public Builder outputName(String outputName) {
            this.putQueryParameter("OutputName", outputName);
            this.outputName = outputName;
            return this;
        }

        @Override
        public DeleteMediaConnectFlowOutputRequest build() {
            return new DeleteMediaConnectFlowOutputRequest(this);
        } 

    } 

}
