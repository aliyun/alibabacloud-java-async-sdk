// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SetupRecycleBinStatusResponse} extends {@link TeaModel}
 *
 * <p>SetupRecycleBinStatusResponse</p>
 */
public class SetupRecycleBinStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetupRecycleBinStatusResponseBody body;

    private SetupRecycleBinStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetupRecycleBinStatusResponse create() {
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
    public SetupRecycleBinStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetupRecycleBinStatusResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetupRecycleBinStatusResponseBody body);

        @Override
        SetupRecycleBinStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetupRecycleBinStatusResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SetupRecycleBinStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetupRecycleBinStatusResponse response) {
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
        public Builder body(SetupRecycleBinStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetupRecycleBinStatusResponse build() {
            return new SetupRecycleBinStatusResponse(this);
        } 

    } 

}
