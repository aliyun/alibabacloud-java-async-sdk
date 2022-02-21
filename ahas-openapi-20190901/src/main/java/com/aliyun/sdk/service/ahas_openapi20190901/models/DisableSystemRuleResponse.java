// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSystemRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableSystemRuleResponse</p>
 */
public class DisableSystemRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSystemRuleResponseBody body;

    private DisableSystemRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSystemRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DisableSystemRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSystemRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSystemRuleResponseBody body);

        @Override
        DisableSystemRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSystemRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSystemRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSystemRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DisableSystemRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSystemRuleResponse build() {
            return new DisableSystemRuleResponse(this);
        } 

    } 

}
