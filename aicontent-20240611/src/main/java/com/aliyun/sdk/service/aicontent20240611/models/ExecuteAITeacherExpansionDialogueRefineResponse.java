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
 * {@link ExecuteAITeacherExpansionDialogueRefineResponse} extends {@link TeaModel}
 *
 * <p>ExecuteAITeacherExpansionDialogueRefineResponse</p>
 */
public class ExecuteAITeacherExpansionDialogueRefineResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExecuteAITeacherExpansionDialogueRefineResponseBody body;

    private ExecuteAITeacherExpansionDialogueRefineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExecuteAITeacherExpansionDialogueRefineResponse create() {
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
    public ExecuteAITeacherExpansionDialogueRefineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteAITeacherExpansionDialogueRefineResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExecuteAITeacherExpansionDialogueRefineResponseBody body);

        @Override
        ExecuteAITeacherExpansionDialogueRefineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteAITeacherExpansionDialogueRefineResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ExecuteAITeacherExpansionDialogueRefineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteAITeacherExpansionDialogueRefineResponse response) {
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
        public Builder body(ExecuteAITeacherExpansionDialogueRefineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteAITeacherExpansionDialogueRefineResponse build() {
            return new ExecuteAITeacherExpansionDialogueRefineResponse(this);
        } 

    } 

}
