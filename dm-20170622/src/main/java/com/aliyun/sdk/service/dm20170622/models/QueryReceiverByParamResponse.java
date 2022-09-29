// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReceiverByParamResponse} extends {@link TeaModel}
 *
 * <p>QueryReceiverByParamResponse</p>
 */
public class QueryReceiverByParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryReceiverByParamResponseBody body;

    private QueryReceiverByParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryReceiverByParamResponse create() {
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
    public QueryReceiverByParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryReceiverByParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryReceiverByParamResponseBody body);

        @Override
        QueryReceiverByParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryReceiverByParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryReceiverByParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryReceiverByParamResponse response) {
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
        public Builder body(QueryReceiverByParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryReceiverByParamResponse build() {
            return new QueryReceiverByParamResponse(this);
        } 

    } 

}
