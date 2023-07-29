// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetCleanConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyAssetCleanConfigResponse</p>
 */
public class ModifyAssetCleanConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAssetCleanConfigResponseBody body;

    private ModifyAssetCleanConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAssetCleanConfigResponse create() {
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
    public ModifyAssetCleanConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAssetCleanConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAssetCleanConfigResponseBody body);

        @Override
        ModifyAssetCleanConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAssetCleanConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAssetCleanConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAssetCleanConfigResponse response) {
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
        public Builder body(ModifyAssetCleanConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAssetCleanConfigResponse build() {
            return new ModifyAssetCleanConfigResponse(this);
        } 

    } 

}
