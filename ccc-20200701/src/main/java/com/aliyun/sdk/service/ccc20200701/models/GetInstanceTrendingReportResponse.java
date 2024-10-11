// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceTrendingReportResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceTrendingReportResponse</p>
 */
public class GetInstanceTrendingReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetInstanceTrendingReportResponseBody body;

    private GetInstanceTrendingReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetInstanceTrendingReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceTrendingReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetInstanceTrendingReportResponseBody body);

        @Override
        GetInstanceTrendingReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceTrendingReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetInstanceTrendingReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceTrendingReportResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
