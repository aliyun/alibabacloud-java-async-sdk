// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRegisteredVendorResponse} extends {@link TeaModel}
 *
 * <p>AddRegisteredVendorResponse</p>
 */
public class AddRegisteredVendorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRegisteredVendorResponseBody body;

    private AddRegisteredVendorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRegisteredVendorResponse create() {
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
    public AddRegisteredVendorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRegisteredVendorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRegisteredVendorResponseBody body);

        @Override
        AddRegisteredVendorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRegisteredVendorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRegisteredVendorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRegisteredVendorResponse response) {
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
        public Builder body(AddRegisteredVendorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRegisteredVendorResponse build() {
            return new AddRegisteredVendorResponse(this);
        } 

    } 

}
