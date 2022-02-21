// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConfigRuleResponse} extends {@link TeaModel}
 *
 * <p>PutConfigRuleResponse</p>
 */
public class PutConfigRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutConfigRuleResponseBody body;

    private PutConfigRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutConfigRuleResponse create() {
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
    public PutConfigRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutConfigRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutConfigRuleResponseBody body);

        @Override
        PutConfigRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutConfigRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutConfigRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutConfigRuleResponse response) {
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
        public Builder body(PutConfigRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutConfigRuleResponse build() {
            return new PutConfigRuleResponse(this);
        } 

    } 

}
