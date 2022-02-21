// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopUrlVisitResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopUrlVisitResponse</p>
 */
public class DescribeDomainTopUrlVisitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainTopUrlVisitResponseBody body;

    private DescribeDomainTopUrlVisitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainTopUrlVisitResponse create() {
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
    public DescribeDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainTopUrlVisitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainTopUrlVisitResponseBody body);

        @Override
        DescribeDomainTopUrlVisitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainTopUrlVisitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainTopUrlVisitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainTopUrlVisitResponse response) {
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
        public Builder body(DescribeDomainTopUrlVisitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainTopUrlVisitResponse build() {
            return new DescribeDomainTopUrlVisitResponse(this);
        } 

    } 

}
