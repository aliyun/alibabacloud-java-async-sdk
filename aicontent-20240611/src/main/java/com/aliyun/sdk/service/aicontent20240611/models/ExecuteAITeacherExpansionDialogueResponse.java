// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherExpansionDialogueResponse} extends {@link TeaModel}
 *
 * <p>ExecuteAITeacherExpansionDialogueResponse</p>
 */
public class ExecuteAITeacherExpansionDialogueResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExecuteAITeacherExpansionDialogueResponseBody body;

    private ExecuteAITeacherExpansionDialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExecuteAITeacherExpansionDialogueResponse create() {
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
    public ExecuteAITeacherExpansionDialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteAITeacherExpansionDialogueResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExecuteAITeacherExpansionDialogueResponseBody body);

        @Override
        ExecuteAITeacherExpansionDialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteAITeacherExpansionDialogueResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ExecuteAITeacherExpansionDialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteAITeacherExpansionDialogueResponse response) {
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
        public Builder body(ExecuteAITeacherExpansionDialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteAITeacherExpansionDialogueResponse build() {
            return new ExecuteAITeacherExpansionDialogueResponse(this);
        } 

    } 

}
