// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTrafficDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainTrafficDataResponse</p>
 */
public class DescribeDomainTrafficDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainTrafficDataResponseBody body;

    private DescribeDomainTrafficDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainTrafficDataResponse create() {
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
    public DescribeDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainTrafficDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainTrafficDataResponseBody body);

        @Override
        DescribeDomainTrafficDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainTrafficDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainTrafficDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainTrafficDataResponse response) {
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
        public Builder body(DescribeDomainTrafficDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainTrafficDataResponse build() {
            return new DescribeDomainTrafficDataResponse(this);
        } 

    } 

}
