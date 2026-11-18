// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link BatchGetVideoCharacterReplaceJobsResponse} extends {@link TeaModel}
 *
 * <p>BatchGetVideoCharacterReplaceJobsResponse</p>
 */
public class BatchGetVideoCharacterReplaceJobsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchGetVideoCharacterReplaceJobsResponseBody body;

    private BatchGetVideoCharacterReplaceJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchGetVideoCharacterReplaceJobsResponse create() {
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
    public BatchGetVideoCharacterReplaceJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetVideoCharacterReplaceJobsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchGetVideoCharacterReplaceJobsResponseBody body);

        @Override
        BatchGetVideoCharacterReplaceJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetVideoCharacterReplaceJobsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private BatchGetVideoCharacterReplaceJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetVideoCharacterReplaceJobsResponse response) {
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
        public Builder body(BatchGetVideoCharacterReplaceJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetVideoCharacterReplaceJobsResponse build() {
            return new BatchGetVideoCharacterReplaceJobsResponse(this);
        } 

    } 

}
