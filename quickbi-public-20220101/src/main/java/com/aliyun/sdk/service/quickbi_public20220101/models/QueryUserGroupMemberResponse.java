// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>QueryUserGroupMemberResponse</p>
 */
public class QueryUserGroupMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserGroupMemberResponseBody body;

    private QueryUserGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserGroupMemberResponse create() {
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
    public QueryUserGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserGroupMemberResponseBody body);

        @Override
        QueryUserGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserGroupMemberResponse response) {
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
        public Builder body(QueryUserGroupMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserGroupMemberResponse build() {
            return new QueryUserGroupMemberResponse(this);
        } 

    } 

}
