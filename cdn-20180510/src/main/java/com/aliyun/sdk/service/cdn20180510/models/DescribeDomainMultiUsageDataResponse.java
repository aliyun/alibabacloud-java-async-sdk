// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainMultiUsageDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainMultiUsageDataResponse</p>
 */
public class DescribeDomainMultiUsageDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainMultiUsageDataResponseBody body;

    private DescribeDomainMultiUsageDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainMultiUsageDataResponse create() {
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
    public DescribeDomainMultiUsageDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainMultiUsageDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainMultiUsageDataResponseBody body);

        @Override
        DescribeDomainMultiUsageDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainMultiUsageDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainMultiUsageDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainMultiUsageDataResponse response) {
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
        public Builder body(DescribeDomainMultiUsageDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainMultiUsageDataResponse build() {
            return new DescribeDomainMultiUsageDataResponse(this);
        } 

    } 

}
