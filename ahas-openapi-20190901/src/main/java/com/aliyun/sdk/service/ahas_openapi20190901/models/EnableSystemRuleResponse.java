// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSystemRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableSystemRuleResponse</p>
 */
public class EnableSystemRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSystemRuleResponseBody body;

    private EnableSystemRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSystemRuleResponse create() {
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
    public EnableSystemRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSystemRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSystemRuleResponseBody body);

        @Override
        EnableSystemRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSystemRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSystemRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSystemRuleResponse response) {
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
        public Builder body(EnableSystemRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSystemRuleResponse build() {
            return new EnableSystemRuleResponse(this);
        } 

    } 

}
