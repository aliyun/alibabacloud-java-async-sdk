// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisReportResponse</p>
 */
public class DescribeCacheAnalysisReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCacheAnalysisReportResponseBody body;

    private DescribeCacheAnalysisReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCacheAnalysisReportResponse create() {
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
    public DescribeCacheAnalysisReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCacheAnalysisReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCacheAnalysisReportResponseBody body);

        @Override
        DescribeCacheAnalysisReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCacheAnalysisReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCacheAnalysisReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCacheAnalysisReportResponse response) {
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
        public Builder body(DescribeCacheAnalysisReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCacheAnalysisReportResponse build() {
            return new DescribeCacheAnalysisReportResponse(this);
        } 

    } 

}
