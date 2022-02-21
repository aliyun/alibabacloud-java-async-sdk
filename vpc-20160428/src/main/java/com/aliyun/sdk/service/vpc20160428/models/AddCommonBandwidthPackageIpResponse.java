// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCommonBandwidthPackageIpResponse} extends {@link TeaModel}
 *
 * <p>AddCommonBandwidthPackageIpResponse</p>
 */
public class AddCommonBandwidthPackageIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCommonBandwidthPackageIpResponseBody body;

    private AddCommonBandwidthPackageIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCommonBandwidthPackageIpResponse create() {
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
    public AddCommonBandwidthPackageIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCommonBandwidthPackageIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCommonBandwidthPackageIpResponseBody body);

        @Override
        AddCommonBandwidthPackageIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCommonBandwidthPackageIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCommonBandwidthPackageIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCommonBandwidthPackageIpResponse response) {
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
        public Builder body(AddCommonBandwidthPackageIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCommonBandwidthPackageIpResponse build() {
            return new AddCommonBandwidthPackageIpResponse(this);
        } 

    } 

}
