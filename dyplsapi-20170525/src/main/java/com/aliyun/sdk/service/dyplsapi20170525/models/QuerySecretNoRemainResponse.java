// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoRemainResponse} extends {@link TeaModel}
 *
 * <p>QuerySecretNoRemainResponse</p>
 */
public class QuerySecretNoRemainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySecretNoRemainResponseBody body;

    private QuerySecretNoRemainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySecretNoRemainResponse create() {
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
    public QuerySecretNoRemainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySecretNoRemainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySecretNoRemainResponseBody body);

        @Override
        QuerySecretNoRemainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySecretNoRemainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySecretNoRemainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySecretNoRemainResponse response) {
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
        public Builder body(QuerySecretNoRemainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySecretNoRemainResponse build() {
            return new QuerySecretNoRemainResponse(this);
        } 

    } 

}
