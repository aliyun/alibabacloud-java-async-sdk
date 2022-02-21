// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallFabricChaincodeResponse} extends {@link TeaModel}
 *
 * <p>InstallFabricChaincodeResponse</p>
 */
public class InstallFabricChaincodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallFabricChaincodeResponseBody body;

    private InstallFabricChaincodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallFabricChaincodeResponse create() {
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
    public InstallFabricChaincodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallFabricChaincodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallFabricChaincodeResponseBody body);

        @Override
        InstallFabricChaincodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallFabricChaincodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallFabricChaincodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallFabricChaincodeResponse response) {
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
        public Builder body(InstallFabricChaincodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallFabricChaincodeResponse build() {
            return new InstallFabricChaincodeResponse(this);
        } 

    } 

}
