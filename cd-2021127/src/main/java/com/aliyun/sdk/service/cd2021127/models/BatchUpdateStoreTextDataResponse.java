// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchUpdateStoreTextDataResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateStoreTextDataResponse</p>
 */
public class BatchUpdateStoreTextDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchUpdateStoreTextDataResponseBody body;

    private BatchUpdateStoreTextDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchUpdateStoreTextDataResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public BatchUpdateStoreTextDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdateStoreTextDataResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchUpdateStoreTextDataResponseBody body);

        @Override
        BatchUpdateStoreTextDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateStoreTextDataResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BatchUpdateStoreTextDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateStoreTextDataResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(BatchUpdateStoreTextDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdateStoreTextDataResponse build() {
            return new BatchUpdateStoreTextDataResponse(this);
        } 

    } 

}
