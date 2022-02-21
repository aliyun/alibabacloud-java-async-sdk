// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceAllUserIdsByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceAllUserIdsByGroupIdResponse</p>
 */
public class QueryFaceAllUserIdsByGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceAllUserIdsByGroupIdResponseBody body;

    private QueryFaceAllUserIdsByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceAllUserIdsByGroupIdResponse create() {
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
    public QueryFaceAllUserIdsByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceAllUserIdsByGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceAllUserIdsByGroupIdResponseBody body);

        @Override
        QueryFaceAllUserIdsByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceAllUserIdsByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceAllUserIdsByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceAllUserIdsByGroupIdResponse response) {
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
        public Builder body(QueryFaceAllUserIdsByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceAllUserIdsByGroupIdResponse build() {
            return new QueryFaceAllUserIdsByGroupIdResponse(this);
        } 

    } 

}
