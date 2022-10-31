// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainBpsDataByLayerResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainBpsDataByLayerResponse</p>
 */
public class DescribeLiveDomainBpsDataByLayerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveDomainBpsDataByLayerResponseBody body;

    private DescribeLiveDomainBpsDataByLayerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveDomainBpsDataByLayerResponse create() {
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
    public DescribeLiveDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveDomainBpsDataByLayerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveDomainBpsDataByLayerResponseBody body);

        @Override
        DescribeLiveDomainBpsDataByLayerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveDomainBpsDataByLayerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveDomainBpsDataByLayerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveDomainBpsDataByLayerResponse response) {
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
        public Builder body(DescribeLiveDomainBpsDataByLayerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveDomainBpsDataByLayerResponse build() {
            return new DescribeLiveDomainBpsDataByLayerResponse(this);
        } 

    } 

}
