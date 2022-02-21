// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDomainRealTimeByteHitRateDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeScdnDomainRealTimeByteHitRateDataResponse</p>
 */
public class DescribeScdnDomainRealTimeByteHitRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScdnDomainRealTimeByteHitRateDataResponseBody body;

    private DescribeScdnDomainRealTimeByteHitRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScdnDomainRealTimeByteHitRateDataResponse create() {
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
    public DescribeScdnDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScdnDomainRealTimeByteHitRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScdnDomainRealTimeByteHitRateDataResponseBody body);

        @Override
        DescribeScdnDomainRealTimeByteHitRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScdnDomainRealTimeByteHitRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScdnDomainRealTimeByteHitRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScdnDomainRealTimeByteHitRateDataResponse response) {
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
        public Builder body(DescribeScdnDomainRealTimeByteHitRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScdnDomainRealTimeByteHitRateDataResponse build() {
            return new DescribeScdnDomainRealTimeByteHitRateDataResponse(this);
        } 

    } 

}
