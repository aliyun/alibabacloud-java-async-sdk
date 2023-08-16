// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainTransferStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainTransferStatusResponse</p>
 */
public class QueryDomainTransferStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainTransferStatusResponseBody body;

    private QueryDomainTransferStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainTransferStatusResponse create() {
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
    public QueryDomainTransferStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainTransferStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainTransferStatusResponseBody body);

        @Override
        QueryDomainTransferStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainTransferStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainTransferStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainTransferStatusResponse response) {
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
        public Builder body(QueryDomainTransferStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainTransferStatusResponse build() {
            return new QueryDomainTransferStatusResponse(this);
        } 

    } 

}
