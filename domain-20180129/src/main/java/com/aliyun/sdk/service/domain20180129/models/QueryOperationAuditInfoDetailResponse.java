// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOperationAuditInfoDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryOperationAuditInfoDetailResponse</p>
 */
public class QueryOperationAuditInfoDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOperationAuditInfoDetailResponseBody body;

    private QueryOperationAuditInfoDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOperationAuditInfoDetailResponse create() {
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
    public QueryOperationAuditInfoDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOperationAuditInfoDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOperationAuditInfoDetailResponseBody body);

        @Override
        QueryOperationAuditInfoDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOperationAuditInfoDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOperationAuditInfoDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOperationAuditInfoDetailResponse response) {
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
        public Builder body(QueryOperationAuditInfoDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOperationAuditInfoDetailResponse build() {
            return new QueryOperationAuditInfoDetailResponse(this);
        } 

    } 

}
