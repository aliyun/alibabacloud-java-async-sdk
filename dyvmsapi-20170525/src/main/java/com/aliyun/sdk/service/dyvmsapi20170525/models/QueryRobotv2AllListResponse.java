// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotv2AllListResponse} extends {@link TeaModel}
 *
 * <p>QueryRobotv2AllListResponse</p>
 */
public class QueryRobotv2AllListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRobotv2AllListResponseBody body;

    private QueryRobotv2AllListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRobotv2AllListResponse create() {
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
    public QueryRobotv2AllListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRobotv2AllListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRobotv2AllListResponseBody body);

        @Override
        QueryRobotv2AllListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRobotv2AllListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRobotv2AllListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRobotv2AllListResponse response) {
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
        public Builder body(QueryRobotv2AllListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRobotv2AllListResponse build() {
            return new QueryRobotv2AllListResponse(this);
        } 

    } 

}
