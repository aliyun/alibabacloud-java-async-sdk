// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableIsolationRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableIsolationRuleResponse</p>
 */
public class DisableIsolationRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableIsolationRuleResponseBody body;

    private DisableIsolationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableIsolationRuleResponse create() {
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
    public DisableIsolationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableIsolationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableIsolationRuleResponseBody body);

        @Override
        DisableIsolationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableIsolationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableIsolationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableIsolationRuleResponse response) {
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
        public Builder body(DisableIsolationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableIsolationRuleResponse build() {
            return new DisableIsolationRuleResponse(this);
        } 

    } 

}
