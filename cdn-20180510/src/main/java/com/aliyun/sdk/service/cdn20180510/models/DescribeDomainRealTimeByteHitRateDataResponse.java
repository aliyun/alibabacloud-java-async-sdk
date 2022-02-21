// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeByteHitRateDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeByteHitRateDataResponse</p>
 */
public class DescribeDomainRealTimeByteHitRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainRealTimeByteHitRateDataResponseBody body;

    private DescribeDomainRealTimeByteHitRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainRealTimeByteHitRateDataResponse create() {
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
    public DescribeDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainRealTimeByteHitRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainRealTimeByteHitRateDataResponseBody body);

        @Override
        DescribeDomainRealTimeByteHitRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainRealTimeByteHitRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainRealTimeByteHitRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainRealTimeByteHitRateDataResponse response) {
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
        public Builder body(DescribeDomainRealTimeByteHitRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainRealTimeByteHitRateDataResponse build() {
            return new DescribeDomainRealTimeByteHitRateDataResponse(this);
        } 

    } 

}
