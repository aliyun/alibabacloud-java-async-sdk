// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableLayer7CCRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableLayer7CCRuleResponse</p>
 */
public class DisableLayer7CCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableLayer7CCRuleResponseBody body;

    private DisableLayer7CCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableLayer7CCRuleResponse create() {
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
    public DisableLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableLayer7CCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableLayer7CCRuleResponseBody body);

        @Override
        DisableLayer7CCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableLayer7CCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableLayer7CCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableLayer7CCRuleResponse response) {
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
        public Builder body(DisableLayer7CCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableLayer7CCRuleResponse build() {
            return new DisableLayer7CCRuleResponse(this);
        } 

    } 

}
