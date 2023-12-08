// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAddressBookResponse} extends {@link TeaModel}
 *
 * <p>AddAddressBookResponse</p>
 */
public class AddAddressBookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAddressBookResponseBody body;

    private AddAddressBookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAddressBookResponse create() {
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
    public AddAddressBookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAddressBookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAddressBookResponseBody body);

        @Override
        AddAddressBookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAddressBookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAddressBookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAddressBookResponse response) {
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
        public Builder body(AddAddressBookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAddressBookResponse build() {
            return new AddAddressBookResponse(this);
        } 

    } 

}
