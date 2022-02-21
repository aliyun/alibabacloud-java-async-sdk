// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceCustomUserIdByUserIdResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceCustomUserIdByUserIdResponse</p>
 */
public class QueryFaceCustomUserIdByUserIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceCustomUserIdByUserIdResponseBody body;

    private QueryFaceCustomUserIdByUserIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceCustomUserIdByUserIdResponse create() {
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
    public QueryFaceCustomUserIdByUserIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceCustomUserIdByUserIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceCustomUserIdByUserIdResponseBody body);

        @Override
        QueryFaceCustomUserIdByUserIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceCustomUserIdByUserIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceCustomUserIdByUserIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceCustomUserIdByUserIdResponse response) {
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
        public Builder body(QueryFaceCustomUserIdByUserIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceCustomUserIdByUserIdResponse build() {
            return new QueryFaceCustomUserIdByUserIdResponse(this);
        } 

    } 

}
