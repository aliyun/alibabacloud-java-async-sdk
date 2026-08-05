// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListRagEvaluatorTasksResponse} extends {@link TeaModel}
 *
 * <p>ListRagEvaluatorTasksResponse</p>
 */
public class ListRagEvaluatorTasksResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListRagEvaluatorTasksResponseBody body;

    private ListRagEvaluatorTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListRagEvaluatorTasksResponse create() {
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
    public ListRagEvaluatorTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRagEvaluatorTasksResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListRagEvaluatorTasksResponseBody body);

        @Override
        ListRagEvaluatorTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRagEvaluatorTasksResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListRagEvaluatorTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRagEvaluatorTasksResponse response) {
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
        public Builder body(ListRagEvaluatorTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRagEvaluatorTasksResponse build() {
            return new ListRagEvaluatorTasksResponse(this);
        } 

    } 

}
