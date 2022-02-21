// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountAndAuthorityResponse} extends {@link TeaModel}
 *
 * <p>CreateAccountAndAuthorityResponse</p>
 */
public class CreateAccountAndAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccountAndAuthorityResponseBody body;

    private CreateAccountAndAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccountAndAuthorityResponse create() {
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
    public CreateAccountAndAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccountAndAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccountAndAuthorityResponseBody body);

        @Override
        CreateAccountAndAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccountAndAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccountAndAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccountAndAuthorityResponse response) {
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
        public Builder body(CreateAccountAndAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccountAndAuthorityResponse build() {
            return new CreateAccountAndAuthorityResponse(this);
        } 

    } 

}
