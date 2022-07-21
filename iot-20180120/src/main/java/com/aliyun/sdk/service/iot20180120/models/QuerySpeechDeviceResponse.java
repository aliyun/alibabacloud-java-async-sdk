// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechDeviceResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechDeviceResponse</p>
 */
public class QuerySpeechDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechDeviceResponseBody body;

    private QuerySpeechDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechDeviceResponse create() {
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
    public QuerySpeechDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechDeviceResponseBody body);

        @Override
        QuerySpeechDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechDeviceResponse response) {
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
        public Builder body(QuerySpeechDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechDeviceResponse build() {
            return new QuerySpeechDeviceResponse(this);
        } 

    } 

}
