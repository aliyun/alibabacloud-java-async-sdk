// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link TransferIntentionOwnerResponse} extends {@link TeaModel}
 *
 * <p>TransferIntentionOwnerResponse</p>
 */
public class TransferIntentionOwnerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TransferIntentionOwnerResponseBody body;

    private TransferIntentionOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TransferIntentionOwnerResponse create() {
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
    public TransferIntentionOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferIntentionOwnerResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(TransferIntentionOwnerResponseBody body);

        @Override
        TransferIntentionOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferIntentionOwnerResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private TransferIntentionOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferIntentionOwnerResponse response) {
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
        public Builder body(TransferIntentionOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferIntentionOwnerResponse build() {
            return new TransferIntentionOwnerResponse(this);
        } 

    } 

}
