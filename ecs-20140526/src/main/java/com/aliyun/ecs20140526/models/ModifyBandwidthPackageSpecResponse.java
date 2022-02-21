// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBandwidthPackageSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyBandwidthPackageSpecResponse</p>
 */
public class ModifyBandwidthPackageSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBandwidthPackageSpecResponseBody body;

    private ModifyBandwidthPackageSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBandwidthPackageSpecResponse create() {
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
    public ModifyBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBandwidthPackageSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBandwidthPackageSpecResponseBody body);

        @Override
        ModifyBandwidthPackageSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBandwidthPackageSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBandwidthPackageSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBandwidthPackageSpecResponse response) {
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
        public Builder body(ModifyBandwidthPackageSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBandwidthPackageSpecResponse build() {
            return new ModifyBandwidthPackageSpecResponse(this);
        } 

    } 

}
