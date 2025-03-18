// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link DeleteDatasetDocumentResponse} extends {@link TeaModel}
 *
 * <p>DeleteDatasetDocumentResponse</p>
 */
public class DeleteDatasetDocumentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteDatasetDocumentResponseBody body;

    private DeleteDatasetDocumentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteDatasetDocumentResponse create() {
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
    public DeleteDatasetDocumentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDatasetDocumentResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteDatasetDocumentResponseBody body);

        @Override
        DeleteDatasetDocumentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDatasetDocumentResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteDatasetDocumentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDatasetDocumentResponse response) {
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
        public Builder body(DeleteDatasetDocumentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDatasetDocumentResponse build() {
            return new DeleteDatasetDocumentResponse(this);
        } 

    } 

}
