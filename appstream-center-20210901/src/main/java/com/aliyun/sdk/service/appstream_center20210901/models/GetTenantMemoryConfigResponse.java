// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetTenantMemoryConfigResponse} extends {@link TeaModel}
 *
 * <p>GetTenantMemoryConfigResponse</p>
 */
public class GetTenantMemoryConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTenantMemoryConfigResponseBody body;

    private GetTenantMemoryConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTenantMemoryConfigResponse create() {
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
    public GetTenantMemoryConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTenantMemoryConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTenantMemoryConfigResponseBody body);

        @Override
        GetTenantMemoryConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTenantMemoryConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetTenantMemoryConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTenantMemoryConfigResponse response) {
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
        public Builder body(GetTenantMemoryConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTenantMemoryConfigResponse build() {
            return new GetTenantMemoryConfigResponse(this);
        } 

    } 

}
