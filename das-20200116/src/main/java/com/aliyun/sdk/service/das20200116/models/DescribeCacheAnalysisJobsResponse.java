// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisJobsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisJobsResponse</p>
 */
public class DescribeCacheAnalysisJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCacheAnalysisJobsResponseBody body;

    private DescribeCacheAnalysisJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCacheAnalysisJobsResponse create() {
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
    public DescribeCacheAnalysisJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCacheAnalysisJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCacheAnalysisJobsResponseBody body);

        @Override
        DescribeCacheAnalysisJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCacheAnalysisJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCacheAnalysisJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCacheAnalysisJobsResponse response) {
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
        public Builder body(DescribeCacheAnalysisJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCacheAnalysisJobsResponse build() {
            return new DescribeCacheAnalysisJobsResponse(this);
        } 

    } 

}
