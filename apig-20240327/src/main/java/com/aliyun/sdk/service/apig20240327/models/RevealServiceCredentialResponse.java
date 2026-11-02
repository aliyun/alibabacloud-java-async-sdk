// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link RevealServiceCredentialResponse} extends {@link TeaModel}
 *
 * <p>RevealServiceCredentialResponse</p>
 */
public class RevealServiceCredentialResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevealServiceCredentialResponseBody body;

    private RevealServiceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevealServiceCredentialResponse create() {
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
    public RevealServiceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevealServiceCredentialResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevealServiceCredentialResponseBody body);

        @Override
        RevealServiceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevealServiceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RevealServiceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevealServiceCredentialResponse response) {
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
        public Builder body(RevealServiceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevealServiceCredentialResponse build() {
            return new RevealServiceCredentialResponse(this);
        } 

    } 

}
