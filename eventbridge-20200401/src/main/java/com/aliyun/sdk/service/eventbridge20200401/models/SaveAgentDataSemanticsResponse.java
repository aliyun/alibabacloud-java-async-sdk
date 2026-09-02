// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SaveAgentDataSemanticsResponse} extends {@link TeaModel}
 *
 * <p>SaveAgentDataSemanticsResponse</p>
 */
public class SaveAgentDataSemanticsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveAgentDataSemanticsResponseBody body;

    private SaveAgentDataSemanticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveAgentDataSemanticsResponse create() {
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
    public SaveAgentDataSemanticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveAgentDataSemanticsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveAgentDataSemanticsResponseBody body);

        @Override
        SaveAgentDataSemanticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveAgentDataSemanticsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SaveAgentDataSemanticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveAgentDataSemanticsResponse response) {
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
        public Builder body(SaveAgentDataSemanticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveAgentDataSemanticsResponse build() {
            return new SaveAgentDataSemanticsResponse(this);
        } 

    } 

}
