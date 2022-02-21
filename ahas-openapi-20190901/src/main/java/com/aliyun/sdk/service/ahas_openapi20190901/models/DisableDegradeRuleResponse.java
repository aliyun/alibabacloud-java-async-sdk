// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDegradeRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableDegradeRuleResponse</p>
 */
public class DisableDegradeRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableDegradeRuleResponseBody body;

    private DisableDegradeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableDegradeRuleResponse create() {
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
    public DisableDegradeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDegradeRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableDegradeRuleResponseBody body);

        @Override
        DisableDegradeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDegradeRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableDegradeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDegradeRuleResponse response) {
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
        public Builder body(DisableDegradeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDegradeRuleResponse build() {
            return new DisableDegradeRuleResponse(this);
        } 

    } 

}
