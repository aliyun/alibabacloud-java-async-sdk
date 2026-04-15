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
 * {@link DeleteFlowEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowEndpointRequest</p>
 */
public class DeleteFlowEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowEndpointName;

    private DeleteFlowEndpointRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowEndpointName = builder.flowEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowEndpointRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFlowEndpointRequest, Builder> {
        private String flowName; 
        private String flowEndpointName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowEndpointRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowEndpointName = request.flowEndpointName;
        } 

        /**
         * <p>工作流实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-flow</p>
         */
        public Builder flowName(String flowName) {
            this.putPathParameter("flowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>要删除的工作流端点的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder flowEndpointName(String flowEndpointName) {
            this.putPathParameter("flowEndpointName", flowEndpointName);
            this.flowEndpointName = flowEndpointName;
            return this;
        }

        @Override
        public DeleteFlowEndpointRequest build() {
            return new DeleteFlowEndpointRequest(this);
        } 

    } 

}
