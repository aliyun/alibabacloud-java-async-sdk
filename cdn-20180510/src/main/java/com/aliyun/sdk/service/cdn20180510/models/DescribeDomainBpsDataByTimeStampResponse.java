// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBpsDataByTimeStampResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataByTimeStampResponse</p>
 */
public class DescribeDomainBpsDataByTimeStampResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainBpsDataByTimeStampResponseBody body;

    private DescribeDomainBpsDataByTimeStampResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainBpsDataByTimeStampResponse create() {
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
    public DescribeDomainBpsDataByTimeStampResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainBpsDataByTimeStampResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainBpsDataByTimeStampResponseBody body);

        @Override
        DescribeDomainBpsDataByTimeStampResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainBpsDataByTimeStampResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainBpsDataByTimeStampResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainBpsDataByTimeStampResponse response) {
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
        public Builder body(DescribeDomainBpsDataByTimeStampResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainBpsDataByTimeStampResponse build() {
            return new DescribeDomainBpsDataByTimeStampResponse(this);
        } 

    } 

}
