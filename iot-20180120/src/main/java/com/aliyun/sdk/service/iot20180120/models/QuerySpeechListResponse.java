// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechListResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechListResponse</p>
 */
public class QuerySpeechListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechListResponseBody body;

    private QuerySpeechListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechListResponse create() {
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
    public QuerySpeechListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechListResponseBody body);

        @Override
        QuerySpeechListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechListResponse response) {
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
        public Builder body(QuerySpeechListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechListResponse build() {
            return new QuerySpeechListResponse(this);
        } 

    } 

}
