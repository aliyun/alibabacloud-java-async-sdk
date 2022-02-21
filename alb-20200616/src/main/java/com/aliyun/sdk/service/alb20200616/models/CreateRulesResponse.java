// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRulesResponse} extends {@link TeaModel}
 *
 * <p>CreateRulesResponse</p>
 */
public class CreateRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRulesResponseBody body;

    private CreateRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRulesResponse create() {
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
    public CreateRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRulesResponseBody body);

        @Override
        CreateRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRulesResponse response) {
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
        public Builder body(CreateRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRulesResponse build() {
            return new CreateRulesResponse(this);
        } 

    } 

}
