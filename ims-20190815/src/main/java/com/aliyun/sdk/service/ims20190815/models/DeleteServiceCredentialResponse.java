// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeleteServiceCredentialResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceCredentialResponse</p>
 */
public class DeleteServiceCredentialResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteServiceCredentialResponseBody body;

    private DeleteServiceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteServiceCredentialResponse create() {
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
    public DeleteServiceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceCredentialResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteServiceCredentialResponseBody body);

        @Override
        DeleteServiceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteServiceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceCredentialResponse response) {
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
        public Builder body(DeleteServiceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceCredentialResponse build() {
            return new DeleteServiceCredentialResponse(this);
        } 

    } 

}
