// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIsolationRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateIsolationRuleResponse</p>
 */
public class CreateIsolationRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIsolationRuleResponseBody body;

    private CreateIsolationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIsolationRuleResponse create() {
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
    public CreateIsolationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIsolationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIsolationRuleResponseBody body);

        @Override
        CreateIsolationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIsolationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIsolationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIsolationRuleResponse response) {
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
        public Builder body(CreateIsolationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIsolationRuleResponse build() {
            return new CreateIsolationRuleResponse(this);
        } 

    } 

}
