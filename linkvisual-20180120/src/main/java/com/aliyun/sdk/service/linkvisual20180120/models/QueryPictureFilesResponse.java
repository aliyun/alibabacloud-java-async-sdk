// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureFilesResponse} extends {@link TeaModel}
 *
 * <p>QueryPictureFilesResponse</p>
 */
public class QueryPictureFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPictureFilesResponseBody body;

    private QueryPictureFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPictureFilesResponse create() {
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
    public QueryPictureFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPictureFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPictureFilesResponseBody body);

        @Override
        QueryPictureFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPictureFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPictureFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPictureFilesResponse response) {
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
        public Builder body(QueryPictureFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPictureFilesResponse build() {
            return new QueryPictureFilesResponse(this);
        } 

    } 

}
