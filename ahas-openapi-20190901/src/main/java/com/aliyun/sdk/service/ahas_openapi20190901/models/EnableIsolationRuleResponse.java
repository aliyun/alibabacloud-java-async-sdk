// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableIsolationRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableIsolationRuleResponse</p>
 */
public class EnableIsolationRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableIsolationRuleResponseBody body;

    private EnableIsolationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableIsolationRuleResponse create() {
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
    public EnableIsolationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableIsolationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableIsolationRuleResponseBody body);

        @Override
        EnableIsolationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableIsolationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableIsolationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableIsolationRuleResponse response) {
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
        public Builder body(EnableIsolationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableIsolationRuleResponse build() {
            return new EnableIsolationRuleResponse(this);
        } 

    } 

}
