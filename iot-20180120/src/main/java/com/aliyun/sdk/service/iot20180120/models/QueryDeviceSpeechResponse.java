// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceSpeechResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceSpeechResponse</p>
 */
public class QueryDeviceSpeechResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceSpeechResponseBody body;

    private QueryDeviceSpeechResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceSpeechResponse create() {
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
    public QueryDeviceSpeechResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceSpeechResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceSpeechResponseBody body);

        @Override
        QueryDeviceSpeechResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceSpeechResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceSpeechResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceSpeechResponse response) {
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
        public Builder body(QueryDeviceSpeechResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceSpeechResponse build() {
            return new QueryDeviceSpeechResponse(this);
        } 

    } 

}
