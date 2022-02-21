// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotInfoListResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotInfoListResponse</p>
 */
public class QueryRobotInfoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotInfoListResponseBody body;

    private QueryRobotInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotInfoListResponse create() {
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
    public QueryRobotInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotInfoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotInfoListResponseBody body);

        @Override
        QueryRobotInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotInfoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotInfoListResponse response) {
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
        public Builder body(QueryRobotInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotInfoListResponse build() {
            return new QueryRobotInfoListResponse(this);
        } 

    } 

}
