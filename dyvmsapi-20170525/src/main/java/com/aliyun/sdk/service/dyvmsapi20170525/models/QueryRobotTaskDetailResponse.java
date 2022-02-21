// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskDetailResponse</p>
 */
public class QueryRobotTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotTaskDetailResponseBody body;

    private QueryRobotTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotTaskDetailResponse create() {
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
    public QueryRobotTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotTaskDetailResponseBody body);

        @Override
        QueryRobotTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotTaskDetailResponse response) {
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
        public Builder body(QueryRobotTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotTaskDetailResponse build() {
            return new QueryRobotTaskDetailResponse(this);
        } 

    } 

}
