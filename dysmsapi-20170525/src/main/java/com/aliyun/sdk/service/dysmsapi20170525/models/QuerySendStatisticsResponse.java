// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendStatisticsResponse} extends {@link TeaModel}
 *
 * <p>QuerySendStatisticsResponse</p>
 */
public class QuerySendStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySendStatisticsResponseBody body;

    private QuerySendStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySendStatisticsResponse create() {
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
    public QuerySendStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySendStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySendStatisticsResponseBody body);

        @Override
        QuerySendStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySendStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySendStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySendStatisticsResponse response) {
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
        public Builder body(QuerySendStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySendStatisticsResponse build() {
            return new QuerySendStatisticsResponse(this);
        } 

    } 

}
