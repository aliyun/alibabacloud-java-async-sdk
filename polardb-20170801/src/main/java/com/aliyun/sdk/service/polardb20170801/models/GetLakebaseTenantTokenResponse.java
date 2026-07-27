// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetLakebaseTenantTokenResponse} extends {@link TeaModel}
 *
 * <p>GetLakebaseTenantTokenResponse</p>
 */
public class GetLakebaseTenantTokenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetLakebaseTenantTokenResponseBody body;

    private GetLakebaseTenantTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetLakebaseTenantTokenResponse create() {
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
    public GetLakebaseTenantTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLakebaseTenantTokenResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetLakebaseTenantTokenResponseBody body);

        @Override
        GetLakebaseTenantTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLakebaseTenantTokenResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetLakebaseTenantTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLakebaseTenantTokenResponse response) {
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
        public Builder body(GetLakebaseTenantTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLakebaseTenantTokenResponse build() {
            return new GetLakebaseTenantTokenResponse(this);
        } 

    } 

}
