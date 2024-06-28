// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResellerUserAlarmThresholdResponse} extends {@link TeaModel}
 *
 * <p>QueryResellerUserAlarmThresholdResponse</p>
 */
public class QueryResellerUserAlarmThresholdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryResellerUserAlarmThresholdResponseBody body;

    private QueryResellerUserAlarmThresholdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryResellerUserAlarmThresholdResponse create() {
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
    public QueryResellerUserAlarmThresholdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResellerUserAlarmThresholdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryResellerUserAlarmThresholdResponseBody body);

        @Override
        QueryResellerUserAlarmThresholdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResellerUserAlarmThresholdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryResellerUserAlarmThresholdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResellerUserAlarmThresholdResponse response) {
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
        public Builder body(QueryResellerUserAlarmThresholdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResellerUserAlarmThresholdResponse build() {
            return new QueryResellerUserAlarmThresholdResponse(this);
        } 

    } 

}
