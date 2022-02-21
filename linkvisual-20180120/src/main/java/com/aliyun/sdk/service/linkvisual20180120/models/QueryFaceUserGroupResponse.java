// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserGroupResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceUserGroupResponse</p>
 */
public class QueryFaceUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceUserGroupResponseBody body;

    private QueryFaceUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceUserGroupResponse create() {
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
    public QueryFaceUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceUserGroupResponseBody body);

        @Override
        QueryFaceUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceUserGroupResponse response) {
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
        public Builder body(QueryFaceUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceUserGroupResponse build() {
            return new QueryFaceUserGroupResponse(this);
        } 

    } 

}
