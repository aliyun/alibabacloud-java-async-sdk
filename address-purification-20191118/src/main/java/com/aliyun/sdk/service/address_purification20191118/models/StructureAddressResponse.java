// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StructureAddressResponse} extends {@link TeaModel}
 *
 * <p>StructureAddressResponse</p>
 */
public class StructureAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StructureAddressResponseBody body;

    private StructureAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StructureAddressResponse create() {
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
    public StructureAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StructureAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StructureAddressResponseBody body);

        @Override
        StructureAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StructureAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StructureAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StructureAddressResponse response) {
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
        public Builder body(StructureAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StructureAddressResponse build() {
            return new StructureAddressResponse(this);
        } 

    } 

}
