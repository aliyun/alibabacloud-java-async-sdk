// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceSpec4ModifyResponse} extends {@link TeaModel}
 *
 * <p>QueryInstanceSpec4ModifyResponse</p>
 */
public class QueryInstanceSpec4ModifyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryInstanceSpec4ModifyResponseBody body;

    private QueryInstanceSpec4ModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryInstanceSpec4ModifyResponse create() {
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
    public QueryInstanceSpec4ModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInstanceSpec4ModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryInstanceSpec4ModifyResponseBody body);

        @Override
        QueryInstanceSpec4ModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInstanceSpec4ModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryInstanceSpec4ModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInstanceSpec4ModifyResponse response) {
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
        public Builder body(QueryInstanceSpec4ModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInstanceSpec4ModifyResponse build() {
            return new QueryInstanceSpec4ModifyResponse(this);
        } 

    } 

}
