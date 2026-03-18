// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterChatCompletionsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterChatCompletionsRequest</p>
 */
public class ModelRouterChatCompletionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Object body;

    private ModelRouterChatCompletionsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterChatCompletionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Object getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModelRouterChatCompletionsRequest, Builder> {
        private Object body; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterChatCompletionsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Object body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModelRouterChatCompletionsRequest build() {
            return new ModelRouterChatCompletionsRequest(this);
        } 

    } 

}
