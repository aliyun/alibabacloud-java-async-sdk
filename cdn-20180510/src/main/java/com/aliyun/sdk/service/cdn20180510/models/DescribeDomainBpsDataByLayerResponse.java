// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBpsDataByLayerResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataByLayerResponse</p>
 */
public class DescribeDomainBpsDataByLayerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainBpsDataByLayerResponseBody body;

    private DescribeDomainBpsDataByLayerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainBpsDataByLayerResponse create() {
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
    public DescribeDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainBpsDataByLayerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainBpsDataByLayerResponseBody body);

        @Override
        DescribeDomainBpsDataByLayerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainBpsDataByLayerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainBpsDataByLayerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainBpsDataByLayerResponse response) {
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
        public Builder body(DescribeDomainBpsDataByLayerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainBpsDataByLayerResponse build() {
            return new DescribeDomainBpsDataByLayerResponse(this);
        } 

    } 

}
