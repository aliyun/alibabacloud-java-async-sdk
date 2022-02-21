// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateCenBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>AssociateCenBandwidthPackageResponse</p>
 */
public class AssociateCenBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateCenBandwidthPackageResponseBody body;

    private AssociateCenBandwidthPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateCenBandwidthPackageResponse create() {
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
    public AssociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateCenBandwidthPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateCenBandwidthPackageResponseBody body);

        @Override
        AssociateCenBandwidthPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateCenBandwidthPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateCenBandwidthPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateCenBandwidthPackageResponse response) {
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
        public Builder body(AssociateCenBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateCenBandwidthPackageResponse build() {
            return new AssociateCenBandwidthPackageResponse(this);
        } 

    } 

}
