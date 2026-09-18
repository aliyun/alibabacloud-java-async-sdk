// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateKnowledgeBasePublicUrlResponse} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBasePublicUrlResponse</p>
 */
public class CreateKnowledgeBasePublicUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateKnowledgeBasePublicUrlResponseBody body;

    private CreateKnowledgeBasePublicUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateKnowledgeBasePublicUrlResponse create() {
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
    public CreateKnowledgeBasePublicUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKnowledgeBasePublicUrlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateKnowledgeBasePublicUrlResponseBody body);

        @Override
        CreateKnowledgeBasePublicUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKnowledgeBasePublicUrlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateKnowledgeBasePublicUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKnowledgeBasePublicUrlResponse response) {
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
        public Builder body(CreateKnowledgeBasePublicUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKnowledgeBasePublicUrlResponse build() {
            return new CreateKnowledgeBasePublicUrlResponse(this);
        } 

    } 

}
