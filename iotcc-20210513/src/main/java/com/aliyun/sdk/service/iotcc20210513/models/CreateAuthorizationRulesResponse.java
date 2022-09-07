// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorizationRulesResponse} extends {@link TeaModel}
 *
 * <p>CreateAuthorizationRulesResponse</p>
 */
public class CreateAuthorizationRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAuthorizationRulesResponseBody body;

    private CreateAuthorizationRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAuthorizationRulesResponse create() {
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
    public CreateAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAuthorizationRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAuthorizationRulesResponseBody body);

        @Override
        CreateAuthorizationRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAuthorizationRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAuthorizationRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAuthorizationRulesResponse response) {
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
        public Builder body(CreateAuthorizationRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAuthorizationRulesResponse build() {
            return new CreateAuthorizationRulesResponse(this);
        } 

    } 

}
