// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateAnycastEipAddressResponse} extends {@link TeaModel}
 *
 * <p>UnassociateAnycastEipAddressResponse</p>
 */
public class UnassociateAnycastEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateAnycastEipAddressResponseBody body;

    private UnassociateAnycastEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociateAnycastEipAddressResponse create() {
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
    public UnassociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateAnycastEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociateAnycastEipAddressResponseBody body);

        @Override
        UnassociateAnycastEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateAnycastEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateAnycastEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateAnycastEipAddressResponse response) {
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
        public Builder body(UnassociateAnycastEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateAnycastEipAddressResponse build() {
            return new UnassociateAnycastEipAddressResponse(this);
        } 

    } 

}
