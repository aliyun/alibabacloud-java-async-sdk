// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSrcTopUrlVisitResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainSrcTopUrlVisitResponse</p>
 */
public class DescribeDomainSrcTopUrlVisitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainSrcTopUrlVisitResponseBody body;

    private DescribeDomainSrcTopUrlVisitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainSrcTopUrlVisitResponse create() {
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
    public DescribeDomainSrcTopUrlVisitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainSrcTopUrlVisitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainSrcTopUrlVisitResponseBody body);

        @Override
        DescribeDomainSrcTopUrlVisitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainSrcTopUrlVisitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainSrcTopUrlVisitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainSrcTopUrlVisitResponse response) {
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
        public Builder body(DescribeDomainSrcTopUrlVisitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainSrcTopUrlVisitResponse build() {
            return new DescribeDomainSrcTopUrlVisitResponse(this);
        } 

    } 

}
