// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableWebCCRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableWebCCRuleResponse</p>
 */
public class DisableWebCCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableWebCCRuleResponseBody body;

    private DisableWebCCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableWebCCRuleResponse create() {
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
    public DisableWebCCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableWebCCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableWebCCRuleResponseBody body);

        @Override
        DisableWebCCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableWebCCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableWebCCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableWebCCRuleResponse response) {
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
        public Builder body(DisableWebCCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableWebCCRuleResponse build() {
            return new DisableWebCCRuleResponse(this);
        } 

    } 

}
