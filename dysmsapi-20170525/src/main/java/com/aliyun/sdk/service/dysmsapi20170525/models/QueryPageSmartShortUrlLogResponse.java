// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageSmartShortUrlLogResponse} extends {@link TeaModel}
 *
 * <p>QueryPageSmartShortUrlLogResponse</p>
 */
public class QueryPageSmartShortUrlLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPageSmartShortUrlLogResponseBody body;

    private QueryPageSmartShortUrlLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPageSmartShortUrlLogResponse create() {
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
    public QueryPageSmartShortUrlLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPageSmartShortUrlLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPageSmartShortUrlLogResponseBody body);

        @Override
        QueryPageSmartShortUrlLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPageSmartShortUrlLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPageSmartShortUrlLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPageSmartShortUrlLogResponse response) {
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
        public Builder body(QueryPageSmartShortUrlLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPageSmartShortUrlLogResponse build() {
            return new QueryPageSmartShortUrlLogResponse(this);
        } 

    } 

}
