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
 * {@link SubmitTopicSelectionPerspectiveAnalysisTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitTopicSelectionPerspectiveAnalysisTaskResponse</p>
 */
public class SubmitTopicSelectionPerspectiveAnalysisTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body;

    private SubmitTopicSelectionPerspectiveAnalysisTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitTopicSelectionPerspectiveAnalysisTaskResponse create() {
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
    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitTopicSelectionPerspectiveAnalysisTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body);

        @Override
        SubmitTopicSelectionPerspectiveAnalysisTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitTopicSelectionPerspectiveAnalysisTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitTopicSelectionPerspectiveAnalysisTaskResponse response) {
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
        public Builder body(SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitTopicSelectionPerspectiveAnalysisTaskResponse build() {
            return new SubmitTopicSelectionPerspectiveAnalysisTaskResponse(this);
        } 

    } 

}
