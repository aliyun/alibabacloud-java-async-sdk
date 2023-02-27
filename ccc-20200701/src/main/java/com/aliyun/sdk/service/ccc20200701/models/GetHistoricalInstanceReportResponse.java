// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalInstanceReportResponse} extends {@link TeaModel}
 *
 * <p>GetHistoricalInstanceReportResponse</p>
 */
public class GetHistoricalInstanceReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoricalInstanceReportResponseBody body;

    private GetHistoricalInstanceReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistoricalInstanceReportResponse create() {
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
    public GetHistoricalInstanceReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoricalInstanceReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoricalInstanceReportResponseBody body);

        @Override
        GetHistoricalInstanceReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoricalInstanceReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoricalInstanceReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoricalInstanceReportResponse response) {
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
        public Builder body(GetHistoricalInstanceReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoricalInstanceReportResponse build() {
            return new GetHistoricalInstanceReportResponse(this);
        } 

    } 

}
