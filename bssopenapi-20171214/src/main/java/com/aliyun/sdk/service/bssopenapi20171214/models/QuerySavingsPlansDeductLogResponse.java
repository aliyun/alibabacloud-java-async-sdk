// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansDeductLogResponse} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDeductLogResponse</p>
 */
public class QuerySavingsPlansDeductLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySavingsPlansDeductLogResponseBody body;

    private QuerySavingsPlansDeductLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySavingsPlansDeductLogResponse create() {
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
    public QuerySavingsPlansDeductLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySavingsPlansDeductLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySavingsPlansDeductLogResponseBody body);

        @Override
        QuerySavingsPlansDeductLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySavingsPlansDeductLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySavingsPlansDeductLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySavingsPlansDeductLogResponse response) {
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
        public Builder body(QuerySavingsPlansDeductLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySavingsPlansDeductLogResponse build() {
            return new QuerySavingsPlansDeductLogResponse(this);
        } 

    } 

}
