// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStreamPushJobResponse} extends {@link TeaModel}
 *
 * <p>QueryStreamPushJobResponse</p>
 */
public class QueryStreamPushJobResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryStreamPushJobResponseBody body;

    private QueryStreamPushJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryStreamPushJobResponse create() {
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
    public QueryStreamPushJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStreamPushJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryStreamPushJobResponseBody body);

        @Override
        QueryStreamPushJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStreamPushJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryStreamPushJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStreamPushJobResponse response) {
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
        public Builder body(QueryStreamPushJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStreamPushJobResponse build() {
            return new QueryStreamPushJobResponse(this);
        } 

    } 

}
