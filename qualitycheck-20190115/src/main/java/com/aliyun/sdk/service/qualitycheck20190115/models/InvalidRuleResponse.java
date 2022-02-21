// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvalidRuleResponse} extends {@link TeaModel}
 *
 * <p>InvalidRuleResponse</p>
 */
public class InvalidRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvalidRuleResponseBody body;

    private InvalidRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvalidRuleResponse create() {
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
    public InvalidRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvalidRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvalidRuleResponseBody body);

        @Override
        InvalidRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvalidRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvalidRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvalidRuleResponse response) {
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
        public Builder body(InvalidRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvalidRuleResponse build() {
            return new InvalidRuleResponse(this);
        } 

    } 

}
