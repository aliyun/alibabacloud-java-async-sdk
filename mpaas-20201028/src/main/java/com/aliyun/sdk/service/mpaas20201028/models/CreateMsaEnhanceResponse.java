// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMsaEnhanceResponse} extends {@link TeaModel}
 *
 * <p>CreateMsaEnhanceResponse</p>
 */
public class CreateMsaEnhanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMsaEnhanceResponseBody body;

    private CreateMsaEnhanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMsaEnhanceResponse create() {
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
    public CreateMsaEnhanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMsaEnhanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMsaEnhanceResponseBody body);

        @Override
        CreateMsaEnhanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMsaEnhanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMsaEnhanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMsaEnhanceResponse response) {
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
        public Builder body(CreateMsaEnhanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMsaEnhanceResponse build() {
            return new CreateMsaEnhanceResponse(this);
        } 

    } 

}
