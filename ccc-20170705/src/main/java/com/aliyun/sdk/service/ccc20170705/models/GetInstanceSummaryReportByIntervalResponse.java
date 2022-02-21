// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceSummaryReportByIntervalResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceSummaryReportByIntervalResponse</p>
 */
public class GetInstanceSummaryReportByIntervalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceSummaryReportByIntervalResponseBody body;

    private GetInstanceSummaryReportByIntervalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceSummaryReportByIntervalResponse create() {
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
    public GetInstanceSummaryReportByIntervalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceSummaryReportByIntervalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceSummaryReportByIntervalResponseBody body);

        @Override
        GetInstanceSummaryReportByIntervalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceSummaryReportByIntervalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceSummaryReportByIntervalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceSummaryReportByIntervalResponse response) {
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
        public Builder body(GetInstanceSummaryReportByIntervalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceSummaryReportByIntervalResponse build() {
            return new GetInstanceSummaryReportByIntervalResponse(this);
        } 

    } 

}
