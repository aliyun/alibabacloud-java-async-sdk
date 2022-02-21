// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeSrcBpsDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeSrcBpsDataResponse</p>
 */
public class DescribeDomainRealTimeSrcBpsDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainRealTimeSrcBpsDataResponseBody body;

    private DescribeDomainRealTimeSrcBpsDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainRealTimeSrcBpsDataResponse create() {
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
    public DescribeDomainRealTimeSrcBpsDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainRealTimeSrcBpsDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainRealTimeSrcBpsDataResponseBody body);

        @Override
        DescribeDomainRealTimeSrcBpsDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainRealTimeSrcBpsDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainRealTimeSrcBpsDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainRealTimeSrcBpsDataResponse response) {
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
        public Builder body(DescribeDomainRealTimeSrcBpsDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainRealTimeSrcBpsDataResponse build() {
            return new DescribeDomainRealTimeSrcBpsDataResponse(this);
        } 

    } 

}
