// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenBandwidthPackageSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyCenBandwidthPackageSpecResponse</p>
 */
public class ModifyCenBandwidthPackageSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCenBandwidthPackageSpecResponseBody body;

    private ModifyCenBandwidthPackageSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCenBandwidthPackageSpecResponse create() {
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
    public ModifyCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCenBandwidthPackageSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCenBandwidthPackageSpecResponseBody body);

        @Override
        ModifyCenBandwidthPackageSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCenBandwidthPackageSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCenBandwidthPackageSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCenBandwidthPackageSpecResponse response) {
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
        public Builder body(ModifyCenBandwidthPackageSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCenBandwidthPackageSpecResponse build() {
            return new ModifyCenBandwidthPackageSpecResponse(this);
        } 

    } 

}
