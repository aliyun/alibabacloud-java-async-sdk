// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAverageResponseTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainAverageResponseTimeResponse</p>
 */
public class DescribeDomainAverageResponseTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainAverageResponseTimeResponseBody body;

    private DescribeDomainAverageResponseTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainAverageResponseTimeResponse create() {
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
    public DescribeDomainAverageResponseTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainAverageResponseTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainAverageResponseTimeResponseBody body);

        @Override
        DescribeDomainAverageResponseTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainAverageResponseTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainAverageResponseTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainAverageResponseTimeResponse response) {
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
        public Builder body(DescribeDomainAverageResponseTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainAverageResponseTimeResponse build() {
            return new DescribeDomainAverageResponseTimeResponse(this);
        } 

    } 

}
