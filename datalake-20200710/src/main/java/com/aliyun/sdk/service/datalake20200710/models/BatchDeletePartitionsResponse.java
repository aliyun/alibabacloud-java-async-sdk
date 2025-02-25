// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeletePartitionsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeletePartitionsResponse</p>
 */
public class BatchDeletePartitionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchDeletePartitionsResponseBody body;

    private BatchDeletePartitionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchDeletePartitionsResponse create() {
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
    public BatchDeletePartitionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeletePartitionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchDeletePartitionsResponseBody body);

        @Override
        BatchDeletePartitionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeletePartitionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchDeletePartitionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeletePartitionsResponse response) {
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
        public Builder body(BatchDeletePartitionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeletePartitionsResponse build() {
            return new BatchDeletePartitionsResponse(this);
        } 

    } 

}
