// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKnowledgeBaseFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseFilesResponse</p>
 */
public class DescribeKnowledgeBaseFilesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeKnowledgeBaseFilesResponseBody body;

    private DescribeKnowledgeBaseFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeKnowledgeBaseFilesResponse create() {
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
    public DescribeKnowledgeBaseFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKnowledgeBaseFilesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeKnowledgeBaseFilesResponseBody body);

        @Override
        DescribeKnowledgeBaseFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKnowledgeBaseFilesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeKnowledgeBaseFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKnowledgeBaseFilesResponse response) {
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
        public Builder body(DescribeKnowledgeBaseFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKnowledgeBaseFilesResponse build() {
            return new DescribeKnowledgeBaseFilesResponse(this);
        } 

    } 

}
