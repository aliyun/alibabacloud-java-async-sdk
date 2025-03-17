// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link BatchDeleteSynonymsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteSynonymsResponse</p>
 */
public class BatchDeleteSynonymsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchDeleteSynonymsResponseBody body;

    private BatchDeleteSynonymsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchDeleteSynonymsResponse create() {
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
    public BatchDeleteSynonymsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteSynonymsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchDeleteSynonymsResponseBody body);

        @Override
        BatchDeleteSynonymsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteSynonymsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BatchDeleteSynonymsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteSynonymsResponse response) {
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
        public Builder body(BatchDeleteSynonymsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteSynonymsResponse build() {
            return new BatchDeleteSynonymsResponse(this);
        } 

    } 

}
