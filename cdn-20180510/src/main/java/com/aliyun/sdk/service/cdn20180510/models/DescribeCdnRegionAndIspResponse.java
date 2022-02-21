// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnRegionAndIspResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnRegionAndIspResponse</p>
 */
public class DescribeCdnRegionAndIspResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnRegionAndIspResponseBody body;

    private DescribeCdnRegionAndIspResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnRegionAndIspResponse create() {
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
    public DescribeCdnRegionAndIspResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnRegionAndIspResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnRegionAndIspResponseBody body);

        @Override
        DescribeCdnRegionAndIspResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnRegionAndIspResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnRegionAndIspResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnRegionAndIspResponse response) {
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
        public Builder body(DescribeCdnRegionAndIspResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnRegionAndIspResponse build() {
            return new DescribeCdnRegionAndIspResponse(this);
        } 

    } 

}
