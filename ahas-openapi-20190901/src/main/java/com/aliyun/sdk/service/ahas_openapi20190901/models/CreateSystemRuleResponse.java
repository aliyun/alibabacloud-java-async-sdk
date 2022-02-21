// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSystemRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateSystemRuleResponse</p>
 */
public class CreateSystemRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSystemRuleResponseBody body;

    private CreateSystemRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSystemRuleResponse create() {
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
    public CreateSystemRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSystemRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSystemRuleResponseBody body);

        @Override
        CreateSystemRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSystemRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSystemRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSystemRuleResponse response) {
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
        public Builder body(CreateSystemRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSystemRuleResponse build() {
            return new CreateSystemRuleResponse(this);
        } 

    } 

}
