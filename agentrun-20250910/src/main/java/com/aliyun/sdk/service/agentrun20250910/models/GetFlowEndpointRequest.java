// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetFlowEndpointRequest} extends {@link RequestModel}
 *
 * <p>GetFlowEndpointRequest</p>
 */
public class GetFlowEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowEndpointName;

    private GetFlowEndpointRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowEndpointName = builder.flowEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowEndpointName
     */
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    public static final class Builder extends Request.Builder<GetFlowEndpointRequest, Builder> {
        private String flowName; 
        private String flowEndpointName; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowEndpointRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowEndpointName = request.flowEndpointName;
        } 

        /**
         * <p>工作流实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-1234567890abcdef</p>
         */
        public Builder flowName(String flowName) {
            this.putPathParameter("flowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>要获取详情的工作流端点的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe-1234567890abcdef</p>
         */
        public Builder flowEndpointName(String flowEndpointName) {
            this.putPathParameter("flowEndpointName", flowEndpointName);
            this.flowEndpointName = flowEndpointName;
            return this;
        }

        @Override
        public GetFlowEndpointRequest build() {
            return new GetFlowEndpointRequest(this);
        } 

    } 

}
