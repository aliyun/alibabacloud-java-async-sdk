// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoricalAgentReportResponse} extends {@link TeaModel}
 *
 * <p>ListHistoricalAgentReportResponse</p>
 */
public class ListHistoricalAgentReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHistoricalAgentReportResponseBody body;

    private ListHistoricalAgentReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHistoricalAgentReportResponse create() {
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
    public ListHistoricalAgentReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHistoricalAgentReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHistoricalAgentReportResponseBody body);

        @Override
        ListHistoricalAgentReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHistoricalAgentReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHistoricalAgentReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHistoricalAgentReportResponse response) {
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
        public Builder body(ListHistoricalAgentReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHistoricalAgentReportResponse build() {
            return new ListHistoricalAgentReportResponse(this);
        } 

    } 

}
