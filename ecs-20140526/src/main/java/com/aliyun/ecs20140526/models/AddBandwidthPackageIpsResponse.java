// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBandwidthPackageIpsResponse} extends {@link TeaModel}
 *
 * <p>AddBandwidthPackageIpsResponse</p>
 */
public class AddBandwidthPackageIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBandwidthPackageIpsResponseBody body;

    private AddBandwidthPackageIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBandwidthPackageIpsResponse create() {
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
    public AddBandwidthPackageIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBandwidthPackageIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBandwidthPackageIpsResponseBody body);

        @Override
        AddBandwidthPackageIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBandwidthPackageIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBandwidthPackageIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBandwidthPackageIpsResponse response) {
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
        public Builder body(AddBandwidthPackageIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBandwidthPackageIpsResponse build() {
            return new AddBandwidthPackageIpsResponse(this);
        } 

    } 

}
