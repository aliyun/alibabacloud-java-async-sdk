// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TerminateSqlStatementResponse} extends {@link TeaModel}
 *
 * <p>TerminateSqlStatementResponse</p>
 */
public class TerminateSqlStatementResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TerminateSqlStatementResponseBody body;

    private TerminateSqlStatementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TerminateSqlStatementResponse create() {
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
    public TerminateSqlStatementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateSqlStatementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TerminateSqlStatementResponseBody body);

        @Override
        TerminateSqlStatementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateSqlStatementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TerminateSqlStatementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateSqlStatementResponse response) {
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
        public Builder body(TerminateSqlStatementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateSqlStatementResponse build() {
            return new TerminateSqlStatementResponse(this);
        } 

    } 

}
