// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEipAddressResponse} extends {@link TeaModel}
 *
 * <p>AssociateEipAddressResponse</p>
 */
public class AssociateEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateEipAddressResponseBody body;

    private AssociateEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateEipAddressResponse create() {
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
    public AssociateEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateEipAddressResponseBody body);

        @Override
        AssociateEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateEipAddressResponse response) {
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
        public Builder body(AssociateEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateEipAddressResponse build() {
            return new AssociateEipAddressResponse(this);
        } 

    } 

}
