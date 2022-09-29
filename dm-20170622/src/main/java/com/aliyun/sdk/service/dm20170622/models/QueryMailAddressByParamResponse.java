// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMailAddressByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryMailAddressByParamResponse</p>
 */
public class QueryMailAddressByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMailAddressByParamResponseBody body;

    private QueryMailAddressByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMailAddressByParamResponse create() {
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
    public QueryMailAddressByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMailAddressByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMailAddressByParamResponseBody body);

        @Override
        QueryMailAddressByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMailAddressByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMailAddressByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMailAddressByParamResponse response) {
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
        public Builder body(QueryMailAddressByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMailAddressByParamResponse build() {
            return new QueryMailAddressByParamResponse(this);
        } 

    } 

}
