// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGateVerifyBillingPublicResponse} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyBillingPublicResponse</p>
 */
public class QueryGateVerifyBillingPublicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryGateVerifyBillingPublicResponseBody body;

    private QueryGateVerifyBillingPublicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryGateVerifyBillingPublicResponse create() {
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
    public QueryGateVerifyBillingPublicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryGateVerifyBillingPublicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryGateVerifyBillingPublicResponseBody body);

        @Override
        QueryGateVerifyBillingPublicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryGateVerifyBillingPublicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryGateVerifyBillingPublicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryGateVerifyBillingPublicResponse response) {
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
        public Builder body(QueryGateVerifyBillingPublicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryGateVerifyBillingPublicResponse build() {
            return new QueryGateVerifyBillingPublicResponse(this);
        } 

    } 

}
