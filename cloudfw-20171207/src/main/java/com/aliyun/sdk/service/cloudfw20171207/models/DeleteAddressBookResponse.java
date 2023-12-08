// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAddressBookResponse} extends {@link TeaModel}
 *
 * <p>DeleteAddressBookResponse</p>
 */
public class DeleteAddressBookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAddressBookResponseBody body;

    private DeleteAddressBookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAddressBookResponse create() {
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
    public DeleteAddressBookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAddressBookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAddressBookResponseBody body);

        @Override
        DeleteAddressBookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAddressBookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAddressBookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAddressBookResponse response) {
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
        public Builder body(DeleteAddressBookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAddressBookResponse build() {
            return new DeleteAddressBookResponse(this);
        } 

    } 

}
