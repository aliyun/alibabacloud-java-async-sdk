// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link UpdateOpenSourcePermissionResponse} extends {@link TeaModel}
 *
 * <p>UpdateOpenSourcePermissionResponse</p>
 */
public class UpdateOpenSourcePermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateOpenSourcePermissionResponseBody body;

    private UpdateOpenSourcePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateOpenSourcePermissionResponse create() {
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
    public UpdateOpenSourcePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOpenSourcePermissionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateOpenSourcePermissionResponseBody body);

        @Override
        UpdateOpenSourcePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOpenSourcePermissionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateOpenSourcePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOpenSourcePermissionResponse response) {
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
        public Builder body(UpdateOpenSourcePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOpenSourcePermissionResponse build() {
            return new UpdateOpenSourcePermissionResponse(this);
        } 

    } 

}
