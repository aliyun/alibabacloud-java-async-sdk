// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateComfyUserDataDirResponse} extends {@link TeaModel}
 *
 * <p>CreateComfyUserDataDirResponse</p>
 */
public class CreateComfyUserDataDirResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateComfyUserDataDirResponseBody body;

    private CreateComfyUserDataDirResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateComfyUserDataDirResponse create() {
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
    public CreateComfyUserDataDirResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateComfyUserDataDirResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateComfyUserDataDirResponseBody body);

        @Override
        CreateComfyUserDataDirResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateComfyUserDataDirResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateComfyUserDataDirResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateComfyUserDataDirResponse response) {
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
        public Builder body(CreateComfyUserDataDirResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateComfyUserDataDirResponse build() {
            return new CreateComfyUserDataDirResponse(this);
        } 

    } 

}
