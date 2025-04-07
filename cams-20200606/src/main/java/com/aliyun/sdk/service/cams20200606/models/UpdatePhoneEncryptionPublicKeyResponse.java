// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link UpdatePhoneEncryptionPublicKeyResponse} extends {@link TeaModel}
 *
 * <p>UpdatePhoneEncryptionPublicKeyResponse</p>
 */
public class UpdatePhoneEncryptionPublicKeyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdatePhoneEncryptionPublicKeyResponseBody body;

    private UpdatePhoneEncryptionPublicKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePhoneEncryptionPublicKeyResponse create() {
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
    public UpdatePhoneEncryptionPublicKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePhoneEncryptionPublicKeyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePhoneEncryptionPublicKeyResponseBody body);

        @Override
        UpdatePhoneEncryptionPublicKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePhoneEncryptionPublicKeyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdatePhoneEncryptionPublicKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePhoneEncryptionPublicKeyResponse response) {
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
        public Builder body(UpdatePhoneEncryptionPublicKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePhoneEncryptionPublicKeyResponse build() {
            return new UpdatePhoneEncryptionPublicKeyResponse(this);
        } 

    } 

}
