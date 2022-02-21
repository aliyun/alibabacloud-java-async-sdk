// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVerifySchemeResponse} extends {@link TeaModel}
 *
 * <p>CreateVerifySchemeResponse</p>
 */
public class CreateVerifySchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVerifySchemeResponseBody body;

    private CreateVerifySchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVerifySchemeResponse create() {
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
    public CreateVerifySchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVerifySchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVerifySchemeResponseBody body);

        @Override
        CreateVerifySchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVerifySchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVerifySchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVerifySchemeResponse response) {
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
        public Builder body(CreateVerifySchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVerifySchemeResponse build() {
            return new CreateVerifySchemeResponse(this);
        } 

    } 

}
