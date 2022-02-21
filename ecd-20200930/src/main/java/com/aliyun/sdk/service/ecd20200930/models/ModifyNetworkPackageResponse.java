// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageResponse} extends {@link TeaModel}
 *
 * <p>ModifyNetworkPackageResponse</p>
 */
public class ModifyNetworkPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNetworkPackageResponseBody body;

    private ModifyNetworkPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNetworkPackageResponse create() {
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
    public ModifyNetworkPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNetworkPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNetworkPackageResponseBody body);

        @Override
        ModifyNetworkPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNetworkPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNetworkPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNetworkPackageResponse response) {
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
        public Builder body(ModifyNetworkPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNetworkPackageResponse build() {
            return new ModifyNetworkPackageResponse(this);
        } 

    } 

}
