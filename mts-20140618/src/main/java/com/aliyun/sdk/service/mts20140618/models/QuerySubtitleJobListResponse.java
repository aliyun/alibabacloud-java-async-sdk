// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubtitleJobListResponse} extends {@link TeaModel}
 *
 * <p>QuerySubtitleJobListResponse</p>
 */
public class QuerySubtitleJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySubtitleJobListResponseBody body;

    private QuerySubtitleJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySubtitleJobListResponse create() {
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
    public QuerySubtitleJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySubtitleJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySubtitleJobListResponseBody body);

        @Override
        QuerySubtitleJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySubtitleJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySubtitleJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySubtitleJobListResponse response) {
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
        public Builder body(QuerySubtitleJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySubtitleJobListResponse build() {
            return new QuerySubtitleJobListResponse(this);
        } 

    } 

}
