// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentSummaryReportsByIntervalResponse} extends {@link TeaModel}
 *
 * <p>ListAgentSummaryReportsByIntervalResponse</p>
 */
public class ListAgentSummaryReportsByIntervalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentSummaryReportsByIntervalResponseBody body;

    private ListAgentSummaryReportsByIntervalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentSummaryReportsByIntervalResponse create() {
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
    public ListAgentSummaryReportsByIntervalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentSummaryReportsByIntervalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentSummaryReportsByIntervalResponseBody body);

        @Override
        ListAgentSummaryReportsByIntervalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentSummaryReportsByIntervalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentSummaryReportsByIntervalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentSummaryReportsByIntervalResponse response) {
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
        public Builder body(ListAgentSummaryReportsByIntervalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentSummaryReportsByIntervalResponse build() {
            return new ListAgentSummaryReportsByIntervalResponse(this);
        } 

    } 

}
