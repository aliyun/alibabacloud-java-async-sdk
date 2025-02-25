// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link SetDirectorySsoStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDirectorySsoStatusResponse</p>
 */
public class SetDirectorySsoStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetDirectorySsoStatusResponseBody body;

    private SetDirectorySsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetDirectorySsoStatusResponse create() {
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
    public SetDirectorySsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDirectorySsoStatusResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetDirectorySsoStatusResponseBody body);

        @Override
        SetDirectorySsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDirectorySsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SetDirectorySsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDirectorySsoStatusResponse response) {
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
        public Builder body(SetDirectorySsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDirectorySsoStatusResponse build() {
            return new SetDirectorySsoStatusResponse(this);
        } 

    } 

}
