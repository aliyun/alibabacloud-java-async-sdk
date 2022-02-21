// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySkillGroupsResponse} extends {@link TeaModel}
 *
 * <p>QuerySkillGroupsResponse</p>
 */
public class QuerySkillGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySkillGroupsResponseBody body;

    private QuerySkillGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySkillGroupsResponse create() {
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
    public QuerySkillGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySkillGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySkillGroupsResponseBody body);

        @Override
        QuerySkillGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySkillGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySkillGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySkillGroupsResponse response) {
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
        public Builder body(QuerySkillGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySkillGroupsResponse build() {
            return new QuerySkillGroupsResponse(this);
        } 

    } 

}
