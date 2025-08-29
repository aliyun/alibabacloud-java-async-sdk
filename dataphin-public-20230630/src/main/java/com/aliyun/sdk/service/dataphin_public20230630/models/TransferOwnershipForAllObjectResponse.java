// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link TransferOwnershipForAllObjectResponse} extends {@link TeaModel}
 *
 * <p>TransferOwnershipForAllObjectResponse</p>
 */
public class TransferOwnershipForAllObjectResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TransferOwnershipForAllObjectResponseBody body;

    private TransferOwnershipForAllObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TransferOwnershipForAllObjectResponse create() {
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
    public TransferOwnershipForAllObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferOwnershipForAllObjectResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(TransferOwnershipForAllObjectResponseBody body);

        @Override
        TransferOwnershipForAllObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferOwnershipForAllObjectResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private TransferOwnershipForAllObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferOwnershipForAllObjectResponse response) {
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
        public Builder body(TransferOwnershipForAllObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferOwnershipForAllObjectResponse build() {
            return new TransferOwnershipForAllObjectResponse(this);
        } 

    } 

}
