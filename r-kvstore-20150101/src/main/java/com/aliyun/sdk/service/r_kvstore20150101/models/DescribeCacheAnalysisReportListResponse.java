// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisReportListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisReportListResponse</p>
 */
public class DescribeCacheAnalysisReportListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCacheAnalysisReportListResponseBody body;

    private DescribeCacheAnalysisReportListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCacheAnalysisReportListResponse create() {
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
    public DescribeCacheAnalysisReportListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCacheAnalysisReportListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCacheAnalysisReportListResponseBody body);

        @Override
        DescribeCacheAnalysisReportListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCacheAnalysisReportListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCacheAnalysisReportListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCacheAnalysisReportListResponse response) {
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
        public Builder body(DescribeCacheAnalysisReportListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCacheAnalysisReportListResponse build() {
            return new DescribeCacheAnalysisReportListResponse(this);
        } 

    } 

}
