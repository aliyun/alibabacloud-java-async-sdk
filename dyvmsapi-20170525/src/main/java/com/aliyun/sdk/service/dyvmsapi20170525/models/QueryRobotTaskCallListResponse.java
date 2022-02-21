// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskCallListResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskCallListResponse</p>
 */
public class QueryRobotTaskCallListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotTaskCallListResponseBody body;

    private QueryRobotTaskCallListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotTaskCallListResponse create() {
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
    public QueryRobotTaskCallListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotTaskCallListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotTaskCallListResponseBody body);

        @Override
        QueryRobotTaskCallListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotTaskCallListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotTaskCallListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotTaskCallListResponse response) {
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
        public Builder body(QueryRobotTaskCallListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotTaskCallListResponse build() {
            return new QueryRobotTaskCallListResponse(this);
        } 

    } 

}
