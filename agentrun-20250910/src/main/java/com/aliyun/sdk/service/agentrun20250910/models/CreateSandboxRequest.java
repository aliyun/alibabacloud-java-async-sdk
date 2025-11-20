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
 * {@link CreateSandboxRequest} extends {@link RequestModel}
 *
 * <p>CreateSandboxRequest</p>
 */
public class CreateSandboxRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateSandboxInput body;

    private CreateSandboxRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSandboxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateSandboxInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateSandboxRequest, Builder> {
        private CreateSandboxInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateSandboxRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>创建沙箱所需的配置信息，包括模板名称、沙箱名称等</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateSandboxInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateSandboxRequest build() {
            return new CreateSandboxRequest(this);
        } 

    } 

}
