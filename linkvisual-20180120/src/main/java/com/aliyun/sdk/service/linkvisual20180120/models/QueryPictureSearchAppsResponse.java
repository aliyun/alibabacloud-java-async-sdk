// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchAppsResponse} extends {@link TeaModel}
 *
 * <p>QueryPictureSearchAppsResponse</p>
 */
public class QueryPictureSearchAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPictureSearchAppsResponseBody body;

    private QueryPictureSearchAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPictureSearchAppsResponse create() {
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
    public QueryPictureSearchAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPictureSearchAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPictureSearchAppsResponseBody body);

        @Override
        QueryPictureSearchAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPictureSearchAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPictureSearchAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPictureSearchAppsResponse response) {
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
        public Builder body(QueryPictureSearchAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPictureSearchAppsResponse build() {
            return new QueryPictureSearchAppsResponse(this);
        } 

    } 

}
