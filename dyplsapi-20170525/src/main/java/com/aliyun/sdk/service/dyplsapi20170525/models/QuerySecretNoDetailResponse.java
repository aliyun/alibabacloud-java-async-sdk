// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoDetailResponse} extends {@link TeaModel}
 *
 * <p>QuerySecretNoDetailResponse</p>
 */
public class QuerySecretNoDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySecretNoDetailResponseBody body;

    private QuerySecretNoDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySecretNoDetailResponse create() {
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
    public QuerySecretNoDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySecretNoDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySecretNoDetailResponseBody body);

        @Override
        QuerySecretNoDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySecretNoDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySecretNoDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySecretNoDetailResponse response) {
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
        public Builder body(QuerySecretNoDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySecretNoDetailResponse build() {
            return new QuerySecretNoDetailResponse(this);
        } 

    } 

}
