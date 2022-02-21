// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckInvalidAddressResponse} extends {@link TeaModel}
 *
 * <p>CheckInvalidAddressResponse</p>
 */
public class CheckInvalidAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckInvalidAddressResponseBody body;

    private CheckInvalidAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckInvalidAddressResponse create() {
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
    public CheckInvalidAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckInvalidAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckInvalidAddressResponseBody body);

        @Override
        CheckInvalidAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckInvalidAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckInvalidAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckInvalidAddressResponse response) {
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
        public Builder body(CheckInvalidAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckInvalidAddressResponse build() {
            return new CheckInvalidAddressResponse(this);
        } 

    } 

}
