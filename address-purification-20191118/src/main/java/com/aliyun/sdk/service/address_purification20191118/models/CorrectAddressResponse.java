// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CorrectAddressResponse} extends {@link TeaModel}
 *
 * <p>CorrectAddressResponse</p>
 */
public class CorrectAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CorrectAddressResponseBody body;

    private CorrectAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CorrectAddressResponse create() {
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
    public CorrectAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CorrectAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CorrectAddressResponseBody body);

        @Override
        CorrectAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CorrectAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CorrectAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CorrectAddressResponse response) {
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
        public Builder body(CorrectAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CorrectAddressResponse build() {
            return new CorrectAddressResponse(this);
        } 

    } 

}
