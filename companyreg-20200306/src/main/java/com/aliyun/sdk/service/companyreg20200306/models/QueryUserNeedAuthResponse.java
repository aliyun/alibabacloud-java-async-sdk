// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserNeedAuthResponse} extends {@link TeaModel}
 *
 * <p>QueryUserNeedAuthResponse</p>
 */
public class QueryUserNeedAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserNeedAuthResponseBody body;

    private QueryUserNeedAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserNeedAuthResponse create() {
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
    public QueryUserNeedAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserNeedAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserNeedAuthResponseBody body);

        @Override
        QueryUserNeedAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserNeedAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserNeedAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserNeedAuthResponse response) {
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
        public Builder body(QueryUserNeedAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserNeedAuthResponse build() {
            return new QueryUserNeedAuthResponse(this);
        } 

    } 

}
