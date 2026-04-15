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
 * {@link UpdateFlowEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowEndpointRequest</p>
 */
public class UpdateFlowEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowEndpointName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateFlowEndpointInput body;

    private UpdateFlowEndpointRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowEndpointName = builder.flowEndpointName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowEndpointRequest create() {
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

    /**
     * @return body
     */
    public UpdateFlowEndpointInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateFlowEndpointRequest, Builder> {
        private String flowName; 
        private String flowEndpointName; 
        private UpdateFlowEndpointInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowEndpointRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowEndpointName = request.flowEndpointName;
            this.body = request.body;
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
         * <p>要更新的工作流端点的唯一标识符</p>
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

        /**
         * <p>包含要更新的工作流端点配置信息的请求体</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateFlowEndpointInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateFlowEndpointRequest build() {
            return new UpdateFlowEndpointRequest(this);
        } 

    } 

}
