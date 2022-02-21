// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopClientIpVisitResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopClientIpVisitResponse</p>
 */
public class DescribeDomainTopClientIpVisitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainTopClientIpVisitResponseBody body;

    private DescribeDomainTopClientIpVisitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainTopClientIpVisitResponse create() {
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
    public DescribeDomainTopClientIpVisitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainTopClientIpVisitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainTopClientIpVisitResponseBody body);

        @Override
        DescribeDomainTopClientIpVisitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainTopClientIpVisitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainTopClientIpVisitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainTopClientIpVisitResponse response) {
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
        public Builder body(DescribeDomainTopClientIpVisitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainTopClientIpVisitResponse build() {
            return new DescribeDomainTopClientIpVisitResponse(this);
        } 

    } 

}
