// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalCallerReportResponse} extends {@link TeaModel}
 *
 * <p>GetHistoricalCallerReportResponse</p>
 */
public class GetHistoricalCallerReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoricalCallerReportResponseBody body;

    private GetHistoricalCallerReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistoricalCallerReportResponse create() {
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
    public GetHistoricalCallerReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoricalCallerReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoricalCallerReportResponseBody body);

        @Override
        GetHistoricalCallerReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoricalCallerReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoricalCallerReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoricalCallerReportResponse response) {
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
        public Builder body(GetHistoricalCallerReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoricalCallerReportResponse build() {
            return new GetHistoricalCallerReportResponse(this);
        } 

    } 

}
