// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAnycastEipAddressResponse} extends {@link TeaModel}
 *
 * <p>AssociateAnycastEipAddressResponse</p>
 */
public class AssociateAnycastEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateAnycastEipAddressResponseBody body;

    private AssociateAnycastEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateAnycastEipAddressResponse create() {
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
    public AssociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateAnycastEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateAnycastEipAddressResponseBody body);

        @Override
        AssociateAnycastEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateAnycastEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateAnycastEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateAnycastEipAddressResponse response) {
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
        public Builder body(AssociateAnycastEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateAnycastEipAddressResponse build() {
            return new AssociateAnycastEipAddressResponse(this);
        } 

    } 

}
