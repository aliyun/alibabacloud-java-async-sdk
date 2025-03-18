// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link RemoveApiProductsAuthoritiesResponse} extends {@link TeaModel}
 *
 * <p>RemoveApiProductsAuthoritiesResponse</p>
 */
public class RemoveApiProductsAuthoritiesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RemoveApiProductsAuthoritiesResponseBody body;

    private RemoveApiProductsAuthoritiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveApiProductsAuthoritiesResponse create() {
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
    public RemoveApiProductsAuthoritiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveApiProductsAuthoritiesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveApiProductsAuthoritiesResponseBody body);

        @Override
        RemoveApiProductsAuthoritiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveApiProductsAuthoritiesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RemoveApiProductsAuthoritiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveApiProductsAuthoritiesResponse response) {
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
        public Builder body(RemoveApiProductsAuthoritiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveApiProductsAuthoritiesResponse build() {
            return new RemoveApiProductsAuthoritiesResponse(this);
        } 

    } 

}
