// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopReferVisitResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopReferVisitResponse</p>
 */
public class DescribeDomainTopReferVisitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainTopReferVisitResponseBody body;

    private DescribeDomainTopReferVisitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainTopReferVisitResponse create() {
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
    public DescribeDomainTopReferVisitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainTopReferVisitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainTopReferVisitResponseBody body);

        @Override
        DescribeDomainTopReferVisitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainTopReferVisitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainTopReferVisitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainTopReferVisitResponse response) {
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
        public Builder body(DescribeDomainTopReferVisitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainTopReferVisitResponse build() {
            return new DescribeDomainTopReferVisitResponse(this);
        } 

    } 

}
