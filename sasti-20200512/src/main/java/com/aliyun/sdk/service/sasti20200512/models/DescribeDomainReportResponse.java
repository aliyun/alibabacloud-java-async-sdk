// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainReportResponse</p>
 */
public class DescribeDomainReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainReportResponseBody body;

    private DescribeDomainReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainReportResponse create() {
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
    public DescribeDomainReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainReportResponseBody body);

        @Override
        DescribeDomainReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainReportResponse response) {
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
        public Builder body(DescribeDomainReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainReportResponse build() {
            return new DescribeDomainReportResponse(this);
        } 

    } 

}
