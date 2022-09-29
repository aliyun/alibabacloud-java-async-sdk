// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMailAddressResponse} extends {@link TeaModel}
 *
 * <p>CreateMailAddressResponse</p>
 */
public class CreateMailAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMailAddressResponseBody body;

    private CreateMailAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMailAddressResponse create() {
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
    public CreateMailAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMailAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMailAddressResponseBody body);

        @Override
        CreateMailAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMailAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMailAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMailAddressResponse response) {
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
        public Builder body(CreateMailAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMailAddressResponse build() {
            return new CreateMailAddressResponse(this);
        } 

    } 

}
