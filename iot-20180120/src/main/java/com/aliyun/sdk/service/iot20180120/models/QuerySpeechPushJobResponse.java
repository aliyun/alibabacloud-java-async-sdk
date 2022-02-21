// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechPushJobResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechPushJobResponse</p>
 */
public class QuerySpeechPushJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechPushJobResponseBody body;

    private QuerySpeechPushJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechPushJobResponse create() {
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
    public QuerySpeechPushJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechPushJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechPushJobResponseBody body);

        @Override
        QuerySpeechPushJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechPushJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechPushJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechPushJobResponse response) {
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
        public Builder body(QuerySpeechPushJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechPushJobResponse build() {
            return new QuerySpeechPushJobResponse(this);
        } 

    } 

}
