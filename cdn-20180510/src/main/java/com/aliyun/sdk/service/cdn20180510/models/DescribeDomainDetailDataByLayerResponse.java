// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailDataByLayerResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailDataByLayerResponse</p>
 */
public class DescribeDomainDetailDataByLayerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainDetailDataByLayerResponseBody body;

    private DescribeDomainDetailDataByLayerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainDetailDataByLayerResponse create() {
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
    public DescribeDomainDetailDataByLayerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainDetailDataByLayerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainDetailDataByLayerResponseBody body);

        @Override
        DescribeDomainDetailDataByLayerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainDetailDataByLayerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainDetailDataByLayerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainDetailDataByLayerResponse response) {
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
        public Builder body(DescribeDomainDetailDataByLayerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainDetailDataByLayerResponse build() {
            return new DescribeDomainDetailDataByLayerResponse(this);
        } 

    } 

}
