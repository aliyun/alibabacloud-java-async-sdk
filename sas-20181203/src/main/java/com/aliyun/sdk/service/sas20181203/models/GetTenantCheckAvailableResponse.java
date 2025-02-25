// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetTenantCheckAvailableResponse} extends {@link TeaModel}
 *
 * <p>GetTenantCheckAvailableResponse</p>
 */
public class GetTenantCheckAvailableResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTenantCheckAvailableResponseBody body;

    private GetTenantCheckAvailableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTenantCheckAvailableResponse create() {
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
    public GetTenantCheckAvailableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTenantCheckAvailableResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTenantCheckAvailableResponseBody body);

        @Override
        GetTenantCheckAvailableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTenantCheckAvailableResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetTenantCheckAvailableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTenantCheckAvailableResponse response) {
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
        public Builder body(GetTenantCheckAvailableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTenantCheckAvailableResponse build() {
            return new GetTenantCheckAvailableResponse(this);
        } 

    } 

}
