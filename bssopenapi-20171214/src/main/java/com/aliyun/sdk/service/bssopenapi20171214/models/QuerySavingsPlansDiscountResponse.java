// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansDiscountResponse} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansDiscountResponse</p>
 */
public class QuerySavingsPlansDiscountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySavingsPlansDiscountResponseBody body;

    private QuerySavingsPlansDiscountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySavingsPlansDiscountResponse create() {
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
    public QuerySavingsPlansDiscountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySavingsPlansDiscountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySavingsPlansDiscountResponseBody body);

        @Override
        QuerySavingsPlansDiscountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySavingsPlansDiscountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySavingsPlansDiscountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySavingsPlansDiscountResponse response) {
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
        public Builder body(QuerySavingsPlansDiscountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySavingsPlansDiscountResponse build() {
            return new QuerySavingsPlansDiscountResponse(this);
        } 

    } 

}
