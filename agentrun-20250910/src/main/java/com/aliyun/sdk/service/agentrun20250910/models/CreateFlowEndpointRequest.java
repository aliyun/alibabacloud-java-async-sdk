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
 * {@link CreateFlowEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowEndpointRequest</p>
 */
public class CreateFlowEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateFlowEndpointInput body;

    private CreateFlowEndpointRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowEndpointRequest create() {
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
     * @return body
     */
    public CreateFlowEndpointInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateFlowEndpointRequest, Builder> {
        private String flowName; 
        private CreateFlowEndpointInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowEndpointRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.body = request.body;
        } 

        /**
         * <p>要创建端点的工作流实例的唯一标识符</p>
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
         * <p>创建工作流端点所需的完整配置信息</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateFlowEndpointInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowEndpointRequest build() {
            return new CreateFlowEndpointRequest(this);
        } 

    } 

}
