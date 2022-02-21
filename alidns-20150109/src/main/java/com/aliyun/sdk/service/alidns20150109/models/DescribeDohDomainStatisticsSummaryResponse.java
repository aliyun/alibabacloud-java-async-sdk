// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohDomainStatisticsSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribeDohDomainStatisticsSummaryResponse</p>
 */
public class DescribeDohDomainStatisticsSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDohDomainStatisticsSummaryResponseBody body;

    private DescribeDohDomainStatisticsSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDohDomainStatisticsSummaryResponse create() {
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
    public DescribeDohDomainStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDohDomainStatisticsSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDohDomainStatisticsSummaryResponseBody body);

        @Override
        DescribeDohDomainStatisticsSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDohDomainStatisticsSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDohDomainStatisticsSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDohDomainStatisticsSummaryResponse response) {
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
        public Builder body(DescribeDohDomainStatisticsSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDohDomainStatisticsSummaryResponse build() {
            return new DescribeDohDomainStatisticsSummaryResponse(this);
        } 

    } 

}
