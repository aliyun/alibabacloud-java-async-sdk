// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackagesResponse</p>
 */
public class DescribeBandwidthPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandwidthPackagesResponseBody body;

    private DescribeBandwidthPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandwidthPackagesResponse create() {
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
    public DescribeBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandwidthPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandwidthPackagesResponseBody body);

        @Override
        DescribeBandwidthPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandwidthPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandwidthPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandwidthPackagesResponse response) {
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
        public Builder body(DescribeBandwidthPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandwidthPackagesResponse build() {
            return new DescribeBandwidthPackagesResponse(this);
        } 

    } 

}
