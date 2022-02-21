// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceSummaryReportResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceSummaryReportResponse</p>
 */
public class GetInstanceSummaryReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceSummaryReportResponseBody body;

    private GetInstanceSummaryReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceSummaryReportResponse create() {
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
    public GetInstanceSummaryReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceSummaryReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceSummaryReportResponseBody body);

        @Override
        GetInstanceSummaryReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceSummaryReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceSummaryReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceSummaryReportResponse response) {
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
        public Builder body(GetInstanceSummaryReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceSummaryReportResponse build() {
            return new GetInstanceSummaryReportResponse(this);
        } 

    } 

}
