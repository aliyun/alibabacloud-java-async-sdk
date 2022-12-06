// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDirectionalAddressResponse} extends {@link TeaModel}
 *
 * <p>AddDirectionalAddressResponse</p>
 */
public class AddDirectionalAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDirectionalAddressResponseBody body;

    private AddDirectionalAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDirectionalAddressResponse create() {
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
    public AddDirectionalAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDirectionalAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDirectionalAddressResponseBody body);

        @Override
        AddDirectionalAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDirectionalAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDirectionalAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDirectionalAddressResponse response) {
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
        public Builder body(AddDirectionalAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDirectionalAddressResponse build() {
            return new AddDirectionalAddressResponse(this);
        } 

    } 

}
