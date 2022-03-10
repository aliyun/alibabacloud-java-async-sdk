// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTicketInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryTicketInfoResponse</p>
 */
public class QueryTicketInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTicketInfoResponseBody body;

    private QueryTicketInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTicketInfoResponse create() {
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
    public QueryTicketInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTicketInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTicketInfoResponseBody body);

        @Override
        QueryTicketInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTicketInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTicketInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTicketInfoResponse response) {
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
        public Builder body(QueryTicketInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTicketInfoResponse build() {
            return new QueryTicketInfoResponse(this);
        } 

    } 

}
