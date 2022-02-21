// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstantiateFabricChaincodeResponse} extends {@link TeaModel}
 *
 * <p>InstantiateFabricChaincodeResponse</p>
 */
public class InstantiateFabricChaincodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstantiateFabricChaincodeResponseBody body;

    private InstantiateFabricChaincodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstantiateFabricChaincodeResponse create() {
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
    public InstantiateFabricChaincodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstantiateFabricChaincodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstantiateFabricChaincodeResponseBody body);

        @Override
        InstantiateFabricChaincodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstantiateFabricChaincodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstantiateFabricChaincodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstantiateFabricChaincodeResponse response) {
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
        public Builder body(InstantiateFabricChaincodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstantiateFabricChaincodeResponse build() {
            return new InstantiateFabricChaincodeResponse(this);
        } 

    } 

}
