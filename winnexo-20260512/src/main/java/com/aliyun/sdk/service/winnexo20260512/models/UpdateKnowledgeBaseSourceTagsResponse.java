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
 * {@link UpdateKnowledgeBaseSourceTagsResponse} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeBaseSourceTagsResponse</p>
 */
public class UpdateKnowledgeBaseSourceTagsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateKnowledgeBaseSourceTagsResponseBody body;

    private UpdateKnowledgeBaseSourceTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateKnowledgeBaseSourceTagsResponse create() {
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
    public UpdateKnowledgeBaseSourceTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateKnowledgeBaseSourceTagsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateKnowledgeBaseSourceTagsResponseBody body);

        @Override
        UpdateKnowledgeBaseSourceTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateKnowledgeBaseSourceTagsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateKnowledgeBaseSourceTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateKnowledgeBaseSourceTagsResponse response) {
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
        public Builder body(UpdateKnowledgeBaseSourceTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseSourceTagsResponse build() {
            return new UpdateKnowledgeBaseSourceTagsResponse(this);
        } 

    } 

}
