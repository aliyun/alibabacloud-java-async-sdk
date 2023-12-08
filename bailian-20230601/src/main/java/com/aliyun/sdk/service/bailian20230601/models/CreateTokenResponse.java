// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTokenResponse} extends {@link TeaModel}
 *
 * <p>CreateTokenResponse</p>
 */
public class CreateTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTokenResponseBody body;

    private CreateTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTokenResponse create() {
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
    public CreateTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTokenResponseBody body);

        @Override
        CreateTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTokenResponse response) {
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
        public Builder body(CreateTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTokenResponse build() {
            return new CreateTokenResponse(this);
        } 

    } 

}
