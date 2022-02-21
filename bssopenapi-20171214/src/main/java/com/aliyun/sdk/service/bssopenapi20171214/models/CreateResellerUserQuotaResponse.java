// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResellerUserQuotaResponse} extends {@link TeaModel}
 *
 * <p>CreateResellerUserQuotaResponse</p>
 */
public class CreateResellerUserQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResellerUserQuotaResponseBody body;

    private CreateResellerUserQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResellerUserQuotaResponse create() {
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
    public CreateResellerUserQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResellerUserQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResellerUserQuotaResponseBody body);

        @Override
        CreateResellerUserQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResellerUserQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResellerUserQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResellerUserQuotaResponse response) {
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
        public Builder body(CreateResellerUserQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResellerUserQuotaResponse build() {
            return new CreateResellerUserQuotaResponse(this);
        } 

    } 

}
