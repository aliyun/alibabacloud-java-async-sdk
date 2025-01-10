// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link RemoveServiceSharedAccountsResponse} extends {@link TeaModel}
 *
 * <p>RemoveServiceSharedAccountsResponse</p>
 */
public class RemoveServiceSharedAccountsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RemoveServiceSharedAccountsResponseBody body;

    private RemoveServiceSharedAccountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveServiceSharedAccountsResponse create() {
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
    public RemoveServiceSharedAccountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveServiceSharedAccountsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveServiceSharedAccountsResponseBody body);

        @Override
        RemoveServiceSharedAccountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveServiceSharedAccountsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RemoveServiceSharedAccountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveServiceSharedAccountsResponse response) {
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
        public Builder body(RemoveServiceSharedAccountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveServiceSharedAccountsResponse build() {
            return new RemoveServiceSharedAccountsResponse(this);
        } 

    } 

}
