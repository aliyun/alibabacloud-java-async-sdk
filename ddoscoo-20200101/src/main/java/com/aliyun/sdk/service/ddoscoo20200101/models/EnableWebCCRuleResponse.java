// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWebCCRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableWebCCRuleResponse</p>
 */
public class EnableWebCCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableWebCCRuleResponseBody body;

    private EnableWebCCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableWebCCRuleResponse create() {
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
    public EnableWebCCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableWebCCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableWebCCRuleResponseBody body);

        @Override
        EnableWebCCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableWebCCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableWebCCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableWebCCRuleResponse response) {
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
        public Builder body(EnableWebCCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableWebCCRuleResponse build() {
            return new EnableWebCCRuleResponse(this);
        } 

    } 

}
