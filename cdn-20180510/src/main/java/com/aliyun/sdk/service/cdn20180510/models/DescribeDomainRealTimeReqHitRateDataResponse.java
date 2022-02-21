// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeReqHitRateDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeReqHitRateDataResponse</p>
 */
public class DescribeDomainRealTimeReqHitRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainRealTimeReqHitRateDataResponseBody body;

    private DescribeDomainRealTimeReqHitRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainRealTimeReqHitRateDataResponse create() {
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
    public DescribeDomainRealTimeReqHitRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainRealTimeReqHitRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainRealTimeReqHitRateDataResponseBody body);

        @Override
        DescribeDomainRealTimeReqHitRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainRealTimeReqHitRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainRealTimeReqHitRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainRealTimeReqHitRateDataResponse response) {
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
        public Builder body(DescribeDomainRealTimeReqHitRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainRealTimeReqHitRateDataResponse build() {
            return new DescribeDomainRealTimeReqHitRateDataResponse(this);
        } 

    } 

}
