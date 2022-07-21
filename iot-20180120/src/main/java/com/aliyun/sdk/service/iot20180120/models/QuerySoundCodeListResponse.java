// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySoundCodeListResponse} extends {@link TeaModel}
 *
 * <p>QuerySoundCodeListResponse</p>
 */
public class QuerySoundCodeListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySoundCodeListResponseBody body;

    private QuerySoundCodeListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySoundCodeListResponse create() {
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
    public QuerySoundCodeListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySoundCodeListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySoundCodeListResponseBody body);

        @Override
        QuerySoundCodeListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySoundCodeListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySoundCodeListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySoundCodeListResponse response) {
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
        public Builder body(QuerySoundCodeListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySoundCodeListResponse build() {
            return new QuerySoundCodeListResponse(this);
        } 

    } 

}
