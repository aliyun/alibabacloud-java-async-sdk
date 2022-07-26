// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddressGetResponse} extends {@link TeaModel}
 *
 * <p>AddressGetResponse</p>
 */
public class AddressGetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddressGetResponseBody body;

    private AddressGetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddressGetResponse create() {
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
    public AddressGetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddressGetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddressGetResponseBody body);

        @Override
        AddressGetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddressGetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddressGetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddressGetResponse response) {
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
        public Builder body(AddressGetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddressGetResponse build() {
            return new AddressGetResponse(this);
        } 

    } 

}
