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
 * {@link ListAnalysisTagDetailByTaskIdResponse} extends {@link TeaModel}
 *
 * <p>ListAnalysisTagDetailByTaskIdResponse</p>
 */
public class ListAnalysisTagDetailByTaskIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAnalysisTagDetailByTaskIdResponseBody body;

    private ListAnalysisTagDetailByTaskIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAnalysisTagDetailByTaskIdResponse create() {
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
    public ListAnalysisTagDetailByTaskIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAnalysisTagDetailByTaskIdResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAnalysisTagDetailByTaskIdResponseBody body);

        @Override
        ListAnalysisTagDetailByTaskIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAnalysisTagDetailByTaskIdResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListAnalysisTagDetailByTaskIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAnalysisTagDetailByTaskIdResponse response) {
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
        public Builder body(ListAnalysisTagDetailByTaskIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAnalysisTagDetailByTaskIdResponse build() {
            return new ListAnalysisTagDetailByTaskIdResponse(this);
        } 

    } 

}
