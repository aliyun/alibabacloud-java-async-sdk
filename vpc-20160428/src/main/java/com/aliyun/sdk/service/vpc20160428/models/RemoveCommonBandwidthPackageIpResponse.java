// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCommonBandwidthPackageIpResponse} extends {@link TeaModel}
 *
 * <p>RemoveCommonBandwidthPackageIpResponse</p>
 */
public class RemoveCommonBandwidthPackageIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveCommonBandwidthPackageIpResponseBody body;

    private RemoveCommonBandwidthPackageIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveCommonBandwidthPackageIpResponse create() {
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
    public RemoveCommonBandwidthPackageIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveCommonBandwidthPackageIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveCommonBandwidthPackageIpResponseBody body);

        @Override
        RemoveCommonBandwidthPackageIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveCommonBandwidthPackageIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveCommonBandwidthPackageIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveCommonBandwidthPackageIpResponse response) {
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
        public Builder body(RemoveCommonBandwidthPackageIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveCommonBandwidthPackageIpResponse build() {
            return new RemoveCommonBandwidthPackageIpResponse(this);
        } 

    } 

}
