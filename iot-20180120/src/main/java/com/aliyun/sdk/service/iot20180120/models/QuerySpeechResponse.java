// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechResponse</p>
 */
public class QuerySpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechResponseBody body;

    private QuerySpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechResponse create() {
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
    public QuerySpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechResponseBody body);

        @Override
        QuerySpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechResponse response) {
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
        public Builder body(QuerySpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechResponse build() {
            return new QuerySpeechResponse(this);
        } 

    } 

}
