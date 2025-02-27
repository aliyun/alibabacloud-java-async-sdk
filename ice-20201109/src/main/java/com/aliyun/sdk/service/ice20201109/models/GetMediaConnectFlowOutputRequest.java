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
 * {@link GetMediaConnectFlowOutputRequest} extends {@link RequestModel}
 *
 * <p>GetMediaConnectFlowOutputRequest</p>
 */
public class GetMediaConnectFlowOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputName;

    private GetMediaConnectFlowOutputRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.outputName = builder.outputName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectFlowOutputRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaConnectFlowOutputRequest, Builder> {
        private String flowId; 
        private String outputName; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaConnectFlowOutputRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.outputName = request.outputName;
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
         * <p>The name of the output that you want to query.</p>
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
        public GetMediaConnectFlowOutputRequest build() {
            return new GetMediaConnectFlowOutputRequest(this);
        } 

    } 

}
