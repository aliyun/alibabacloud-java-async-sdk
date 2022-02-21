// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVoiceIntercomResponse} extends {@link TeaModel}
 *
 * <p>QueryVoiceIntercomResponse</p>
 */
public class QueryVoiceIntercomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVoiceIntercomResponseBody body;

    private QueryVoiceIntercomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVoiceIntercomResponse create() {
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
    public QueryVoiceIntercomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVoiceIntercomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVoiceIntercomResponseBody body);

        @Override
        QueryVoiceIntercomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVoiceIntercomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVoiceIntercomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVoiceIntercomResponse response) {
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
        public Builder body(QueryVoiceIntercomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVoiceIntercomResponse build() {
            return new QueryVoiceIntercomResponse(this);
        } 

    } 

}
