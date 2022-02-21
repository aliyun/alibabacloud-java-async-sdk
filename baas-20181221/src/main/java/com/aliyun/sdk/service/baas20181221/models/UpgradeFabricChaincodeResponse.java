// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeFabricChaincodeResponse} extends {@link TeaModel}
 *
 * <p>UpgradeFabricChaincodeResponse</p>
 */
public class UpgradeFabricChaincodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeFabricChaincodeResponseBody body;

    private UpgradeFabricChaincodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeFabricChaincodeResponse create() {
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
    public UpgradeFabricChaincodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeFabricChaincodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeFabricChaincodeResponseBody body);

        @Override
        UpgradeFabricChaincodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeFabricChaincodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeFabricChaincodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeFabricChaincodeResponse response) {
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
        public Builder body(UpgradeFabricChaincodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeFabricChaincodeResponse build() {
            return new UpgradeFabricChaincodeResponse(this);
        } 

    } 

}
