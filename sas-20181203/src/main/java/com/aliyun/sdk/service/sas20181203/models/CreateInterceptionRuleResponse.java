// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterceptionRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateInterceptionRuleResponse</p>
 */
public class CreateInterceptionRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInterceptionRuleResponseBody body;

    private CreateInterceptionRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInterceptionRuleResponse create() {
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
    public CreateInterceptionRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInterceptionRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInterceptionRuleResponseBody body);

        @Override
        CreateInterceptionRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInterceptionRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInterceptionRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInterceptionRuleResponse response) {
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
        public Builder body(CreateInterceptionRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInterceptionRuleResponse build() {
            return new CreateInterceptionRuleResponse(this);
        } 

    } 

}
