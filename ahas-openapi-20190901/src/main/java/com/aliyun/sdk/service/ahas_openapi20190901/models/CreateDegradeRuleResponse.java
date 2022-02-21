// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDegradeRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateDegradeRuleResponse</p>
 */
public class CreateDegradeRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDegradeRuleResponseBody body;

    private CreateDegradeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDegradeRuleResponse create() {
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
    public CreateDegradeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDegradeRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDegradeRuleResponseBody body);

        @Override
        CreateDegradeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDegradeRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDegradeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDegradeRuleResponse response) {
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
        public Builder body(CreateDegradeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDegradeRuleResponse build() {
            return new CreateDegradeRuleResponse(this);
        } 

    } 

}
