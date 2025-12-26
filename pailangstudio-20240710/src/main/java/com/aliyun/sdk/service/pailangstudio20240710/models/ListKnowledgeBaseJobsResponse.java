// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link ListKnowledgeBaseJobsResponse} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseJobsResponse</p>
 */
public class ListKnowledgeBaseJobsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListKnowledgeBaseJobsResponseBody body;

    private ListKnowledgeBaseJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListKnowledgeBaseJobsResponse create() {
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
    public ListKnowledgeBaseJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListKnowledgeBaseJobsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListKnowledgeBaseJobsResponseBody body);

        @Override
        ListKnowledgeBaseJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListKnowledgeBaseJobsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListKnowledgeBaseJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListKnowledgeBaseJobsResponse response) {
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
        public Builder body(ListKnowledgeBaseJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListKnowledgeBaseJobsResponse build() {
            return new ListKnowledgeBaseJobsResponse(this);
        } 

    } 

}
