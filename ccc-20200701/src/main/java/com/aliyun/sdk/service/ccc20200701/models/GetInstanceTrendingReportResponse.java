// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceTrendingReportResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceTrendingReportResponse</p>
 */
public class GetInstanceTrendingReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceTrendingReportResponseBody body;

    private GetInstanceTrendingReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceTrendingReportResponse create() {
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
    public GetInstanceTrendingReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceTrendingReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceTrendingReportResponseBody body);

        @Override
        GetInstanceTrendingReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceTrendingReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceTrendingReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceTrendingReportResponse response) {
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
        public Builder body(GetInstanceTrendingReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceTrendingReportResponse build() {
            return new GetInstanceTrendingReportResponse(this);
        } 

    } 

}
