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
 * {@link CreateToolRequest} extends {@link RequestModel}
 *
 * <p>CreateToolRequest</p>
 */
public class CreateToolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateToolInputV2 body;

    private CreateToolRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateToolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateToolInputV2 getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateToolRequest, Builder> {
        private CreateToolInputV2 body; 

        private Builder() {
            super();
        } 

        private Builder(CreateToolRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>创建工具的请求参数，包含工具的所有配置信息</p>
         */
        public Builder body(CreateToolInputV2 body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateToolRequest build() {
            return new CreateToolRequest(this);
        } 

    } 

}
