// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>QueryUserGroupMemberResponse</p>
 */
public class QueryUserGroupMemberResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryUserGroupMemberResponseBody body;

    private QueryUserGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public QueryUserGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryUserGroupMemberResponseBody body);

        @Override
        QueryUserGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryUserGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserGroupMemberResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
