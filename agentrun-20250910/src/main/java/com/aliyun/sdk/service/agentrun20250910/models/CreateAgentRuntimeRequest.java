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
 * {@link CreateAgentRuntimeRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRuntimeRequest</p>
 */
public class CreateAgentRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateAgentRuntimeInput body;

    private CreateAgentRuntimeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateAgentRuntimeInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAgentRuntimeRequest, Builder> {
        private CreateAgentRuntimeInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRuntimeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>创建智能体运行时所需的完整配置信息，包括运行时名称、资源规格、网络配置、协议配置等</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateAgentRuntimeInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentRuntimeRequest build() {
            return new CreateAgentRuntimeRequest(this);
        } 

    } 

}
