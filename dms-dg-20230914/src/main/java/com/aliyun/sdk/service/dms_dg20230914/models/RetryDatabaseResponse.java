// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryDatabaseResponse} extends {@link TeaModel}
 *
 * <p>RetryDatabaseResponse</p>
 */
public class RetryDatabaseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RetryDatabaseResponseBody body;

    private RetryDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RetryDatabaseResponse create() {
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
    public RetryDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RetryDatabaseResponseBody body);

        @Override
        RetryDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RetryDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryDatabaseResponse response) {
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
        public Builder body(RetryDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryDatabaseResponse build() {
            return new RetryDatabaseResponse(this);
        } 

    } 

}
