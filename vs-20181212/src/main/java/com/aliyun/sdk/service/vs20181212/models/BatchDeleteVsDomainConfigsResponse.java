// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteVsDomainConfigsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteVsDomainConfigsResponse</p>
 */
public class BatchDeleteVsDomainConfigsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchDeleteVsDomainConfigsResponseBody body;

    private BatchDeleteVsDomainConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchDeleteVsDomainConfigsResponse create() {
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
    public BatchDeleteVsDomainConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteVsDomainConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchDeleteVsDomainConfigsResponseBody body);

        @Override
        BatchDeleteVsDomainConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteVsDomainConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchDeleteVsDomainConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteVsDomainConfigsResponse response) {
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
        public Builder body(BatchDeleteVsDomainConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteVsDomainConfigsResponse build() {
            return new BatchDeleteVsDomainConfigsResponse(this);
        } 

    } 

}
