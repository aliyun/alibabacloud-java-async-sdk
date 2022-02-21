// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceInternetAddressResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceInternetAddressResponse</p>
 */
public class CreateInstanceInternetAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceInternetAddressResponseBody body;

    private CreateInstanceInternetAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceInternetAddressResponse create() {
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
    public CreateInstanceInternetAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceInternetAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceInternetAddressResponseBody body);

        @Override
        CreateInstanceInternetAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceInternetAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceInternetAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceInternetAddressResponse response) {
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
        public Builder body(CreateInstanceInternetAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceInternetAddressResponse build() {
            return new CreateInstanceInternetAddressResponse(this);
        } 

    } 

}
