// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableLayer7CCRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableLayer7CCRuleResponse</p>
 */
public class EnableLayer7CCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableLayer7CCRuleResponseBody body;

    private EnableLayer7CCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableLayer7CCRuleResponse create() {
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
    public EnableLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableLayer7CCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableLayer7CCRuleResponseBody body);

        @Override
        EnableLayer7CCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableLayer7CCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableLayer7CCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableLayer7CCRuleResponse response) {
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
        public Builder body(EnableLayer7CCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableLayer7CCRuleResponse build() {
            return new EnableLayer7CCRuleResponse(this);
        } 

    } 

}
