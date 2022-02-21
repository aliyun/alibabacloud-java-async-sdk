// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDegradeRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableDegradeRuleResponse</p>
 */
public class EnableDegradeRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDegradeRuleResponseBody body;

    private EnableDegradeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDegradeRuleResponse create() {
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
    public EnableDegradeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDegradeRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDegradeRuleResponseBody body);

        @Override
        EnableDegradeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDegradeRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDegradeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDegradeRuleResponse response) {
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
        public Builder body(EnableDegradeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDegradeRuleResponse build() {
            return new EnableDegradeRuleResponse(this);
        } 

    } 

}
