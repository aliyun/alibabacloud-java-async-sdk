// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeOssPreSignedAddressResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeOssPreSignedAddressResponse</p>
 */
public class CreateEdgeOssPreSignedAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeOssPreSignedAddressResponseBody body;

    private CreateEdgeOssPreSignedAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeOssPreSignedAddressResponse create() {
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
    public CreateEdgeOssPreSignedAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeOssPreSignedAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeOssPreSignedAddressResponseBody body);

        @Override
        CreateEdgeOssPreSignedAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeOssPreSignedAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeOssPreSignedAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeOssPreSignedAddressResponse response) {
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
        public Builder body(CreateEdgeOssPreSignedAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeOssPreSignedAddressResponse build() {
            return new CreateEdgeOssPreSignedAddressResponse(this);
        } 

    } 

}
