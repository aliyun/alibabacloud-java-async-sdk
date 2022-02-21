// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnAssociateEnsEipAddressResponse} extends {@link TeaModel}
 *
 * <p>UnAssociateEnsEipAddressResponse</p>
 */
public class UnAssociateEnsEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnAssociateEnsEipAddressResponseBody body;

    private UnAssociateEnsEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnAssociateEnsEipAddressResponse create() {
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
    public UnAssociateEnsEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnAssociateEnsEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnAssociateEnsEipAddressResponseBody body);

        @Override
        UnAssociateEnsEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnAssociateEnsEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnAssociateEnsEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnAssociateEnsEipAddressResponse response) {
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
        public Builder body(UnAssociateEnsEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnAssociateEnsEipAddressResponse build() {
            return new UnAssociateEnsEipAddressResponse(this);
        } 

    } 

}
