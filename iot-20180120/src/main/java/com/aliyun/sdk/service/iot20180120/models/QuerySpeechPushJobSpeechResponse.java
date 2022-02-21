// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechPushJobSpeechResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechPushJobSpeechResponse</p>
 */
public class QuerySpeechPushJobSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechPushJobSpeechResponseBody body;

    private QuerySpeechPushJobSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechPushJobSpeechResponse create() {
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
    public QuerySpeechPushJobSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechPushJobSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechPushJobSpeechResponseBody body);

        @Override
        QuerySpeechPushJobSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechPushJobSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechPushJobSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechPushJobSpeechResponse response) {
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
        public Builder body(QuerySpeechPushJobSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechPushJobSpeechResponse build() {
            return new QuerySpeechPushJobSpeechResponse(this);
        } 

    } 

}
