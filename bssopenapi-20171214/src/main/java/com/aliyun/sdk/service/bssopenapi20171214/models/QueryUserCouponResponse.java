// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserCouponResponse} extends {@link TeaModel}
 *
 * <p>QueryUserCouponResponse</p>
 */
public class QueryUserCouponResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserCouponResponseBody body;

    private QueryUserCouponResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserCouponResponse create() {
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
    public QueryUserCouponResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserCouponResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserCouponResponseBody body);

        @Override
        QueryUserCouponResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserCouponResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserCouponResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserCouponResponse response) {
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
        public Builder body(QueryUserCouponResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserCouponResponse build() {
            return new QueryUserCouponResponse(this);
        } 

    } 

}
