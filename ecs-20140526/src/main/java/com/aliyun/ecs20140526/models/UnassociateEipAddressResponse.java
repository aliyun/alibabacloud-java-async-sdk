// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateEipAddressResponse} extends {@link TeaModel}
 *
 * <p>UnassociateEipAddressResponse</p>
 */
public class UnassociateEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateEipAddressResponseBody body;

    private UnassociateEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociateEipAddressResponse create() {
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
    public UnassociateEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociateEipAddressResponseBody body);

        @Override
        UnassociateEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateEipAddressResponse response) {
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
        public Builder body(UnassociateEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateEipAddressResponse build() {
            return new UnassociateEipAddressResponse(this);
        } 

    } 

}
