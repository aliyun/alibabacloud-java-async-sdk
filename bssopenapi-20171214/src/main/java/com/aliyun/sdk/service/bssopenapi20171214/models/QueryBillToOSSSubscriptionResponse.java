// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillToOSSSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>QueryBillToOSSSubscriptionResponse</p>
 */
public class QueryBillToOSSSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBillToOSSSubscriptionResponseBody body;

    private QueryBillToOSSSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBillToOSSSubscriptionResponse create() {
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
    public QueryBillToOSSSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBillToOSSSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBillToOSSSubscriptionResponseBody body);

        @Override
        QueryBillToOSSSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBillToOSSSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBillToOSSSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBillToOSSSubscriptionResponse response) {
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
        public Builder body(QueryBillToOSSSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBillToOSSSubscriptionResponse build() {
            return new QueryBillToOSSSubscriptionResponse(this);
        } 

    } 

}
