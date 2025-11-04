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
 * {@link ForbidMediaConnectFlowOutputRequest} extends {@link RequestModel}
 *
 * <p>ForbidMediaConnectFlowOutputRequest</p>
 */
public class ForbidMediaConnectFlowOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputName")
    private String outputName;

    private ForbidMediaConnectFlowOutputRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.outputName = builder.outputName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForbidMediaConnectFlowOutputRequest create() {
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

    public static final class Builder extends Request.Builder<ForbidMediaConnectFlowOutputRequest, Builder> {
        private String flowId; 
        private String outputName; 

        private Builder() {
            super();
        } 

        private Builder(ForbidMediaConnectFlowOutputRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.outputName = request.outputName;
        } 

        /**
         * <p>The ID of the MediaConnect flow.</p>
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
         * <p>The name of the output.</p>
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
        public ForbidMediaConnectFlowOutputRequest build() {
            return new ForbidMediaConnectFlowOutputRequest(this);
        } 

    } 

}
