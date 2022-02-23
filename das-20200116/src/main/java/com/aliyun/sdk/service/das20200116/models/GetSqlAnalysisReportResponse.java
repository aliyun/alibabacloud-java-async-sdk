// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlAnalysisReportResponse} extends {@link TeaModel}
 *
 * <p>GetSqlAnalysisReportResponse</p>
 */
public class GetSqlAnalysisReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSqlAnalysisReportResponseBody body;

    private GetSqlAnalysisReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSqlAnalysisReportResponse create() {
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
    public GetSqlAnalysisReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSqlAnalysisReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSqlAnalysisReportResponseBody body);

        @Override
        GetSqlAnalysisReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSqlAnalysisReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSqlAnalysisReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSqlAnalysisReportResponse response) {
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
        public Builder body(GetSqlAnalysisReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSqlAnalysisReportResponse build() {
            return new GetSqlAnalysisReportResponse(this);
        } 

    } 

}
