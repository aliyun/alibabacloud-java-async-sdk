// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskListResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskListResponse</p>
 */
public class QueryRobotTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotTaskListResponseBody body;

    private QueryRobotTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotTaskListResponse create() {
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
    public QueryRobotTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotTaskListResponseBody body);

        @Override
        QueryRobotTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotTaskListResponse response) {
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
        public Builder body(QueryRobotTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotTaskListResponse build() {
            return new QueryRobotTaskListResponse(this);
        } 

    } 

}
