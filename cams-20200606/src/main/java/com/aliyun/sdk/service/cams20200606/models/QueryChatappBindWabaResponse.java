// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappBindWabaResponse} extends {@link TeaModel}
 *
 * <p>QueryChatappBindWabaResponse</p>
 */
public class QueryChatappBindWabaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryChatappBindWabaResponseBody body;

    private QueryChatappBindWabaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryChatappBindWabaResponse create() {
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
    public QueryChatappBindWabaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryChatappBindWabaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryChatappBindWabaResponseBody body);

        @Override
        QueryChatappBindWabaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryChatappBindWabaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryChatappBindWabaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryChatappBindWabaResponse response) {
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
        public Builder body(QueryChatappBindWabaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryChatappBindWabaResponse build() {
            return new QueryChatappBindWabaResponse(this);
        } 

    } 

}
