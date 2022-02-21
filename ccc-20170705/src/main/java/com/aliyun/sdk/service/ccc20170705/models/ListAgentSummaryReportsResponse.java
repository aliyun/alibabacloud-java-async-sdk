// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentSummaryReportsResponse} extends {@link TeaModel}
 *
 * <p>ListAgentSummaryReportsResponse</p>
 */
public class ListAgentSummaryReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentSummaryReportsResponseBody body;

    private ListAgentSummaryReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentSummaryReportsResponse create() {
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
    public ListAgentSummaryReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentSummaryReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentSummaryReportsResponseBody body);

        @Override
        ListAgentSummaryReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentSummaryReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentSummaryReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentSummaryReportsResponse response) {
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
        public Builder body(ListAgentSummaryReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentSummaryReportsResponse build() {
            return new ListAgentSummaryReportsResponse(this);
        } 

    } 

}
