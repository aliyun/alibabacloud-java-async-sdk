// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimedResetOperateStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryTimedResetOperateStatusResponse</p>
 */
public class QueryTimedResetOperateStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTimedResetOperateStatusResponseBody body;

    private QueryTimedResetOperateStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTimedResetOperateStatusResponse create() {
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
    public QueryTimedResetOperateStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTimedResetOperateStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTimedResetOperateStatusResponseBody body);

        @Override
        QueryTimedResetOperateStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTimedResetOperateStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTimedResetOperateStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTimedResetOperateStatusResponse response) {
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
        public Builder body(QueryTimedResetOperateStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTimedResetOperateStatusResponse build() {
            return new QueryTimedResetOperateStatusResponse(this);
        } 

    } 

}
