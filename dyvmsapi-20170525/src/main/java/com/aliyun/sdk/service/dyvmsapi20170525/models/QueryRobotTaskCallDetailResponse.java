// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskCallDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskCallDetailResponse</p>
 */
public class QueryRobotTaskCallDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotTaskCallDetailResponseBody body;

    private QueryRobotTaskCallDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotTaskCallDetailResponse create() {
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
    public QueryRobotTaskCallDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotTaskCallDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotTaskCallDetailResponseBody body);

        @Override
        QueryRobotTaskCallDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotTaskCallDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotTaskCallDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotTaskCallDetailResponse response) {
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
        public Builder body(QueryRobotTaskCallDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotTaskCallDetailResponse build() {
            return new QueryRobotTaskCallDetailResponse(this);
        } 

    } 

}
