// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCommonBandwidthPackageIpsResponse} extends {@link TeaModel}
 *
 * <p>AddCommonBandwidthPackageIpsResponse</p>
 */
public class AddCommonBandwidthPackageIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCommonBandwidthPackageIpsResponseBody body;

    private AddCommonBandwidthPackageIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCommonBandwidthPackageIpsResponse create() {
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
    public AddCommonBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCommonBandwidthPackageIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCommonBandwidthPackageIpsResponseBody body);

        @Override
        AddCommonBandwidthPackageIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCommonBandwidthPackageIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCommonBandwidthPackageIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCommonBandwidthPackageIpsResponse response) {
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
        public Builder body(AddCommonBandwidthPackageIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCommonBandwidthPackageIpsResponse build() {
            return new AddCommonBandwidthPackageIpsResponse(this);
        } 

    } 

}
