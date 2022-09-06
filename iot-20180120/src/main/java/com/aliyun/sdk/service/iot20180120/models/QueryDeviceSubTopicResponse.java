// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceSubTopicResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceSubTopicResponse</p>
 */
public class QueryDeviceSubTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceSubTopicResponseBody body;

    private QueryDeviceSubTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceSubTopicResponse create() {
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
    public QueryDeviceSubTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceSubTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceSubTopicResponseBody body);

        @Override
        QueryDeviceSubTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceSubTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceSubTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceSubTopicResponse response) {
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
        public Builder body(QueryDeviceSubTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceSubTopicResponse build() {
            return new QueryDeviceSubTopicResponse(this);
        } 

    } 

}
