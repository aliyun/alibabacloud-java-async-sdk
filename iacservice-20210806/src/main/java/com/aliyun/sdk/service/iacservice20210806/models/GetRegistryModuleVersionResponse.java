// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetRegistryModuleVersionResponse} extends {@link TeaModel}
 *
 * <p>GetRegistryModuleVersionResponse</p>
 */
public class GetRegistryModuleVersionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetRegistryModuleVersionResponseBody body;

    private GetRegistryModuleVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRegistryModuleVersionResponse create() {
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
    public GetRegistryModuleVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegistryModuleVersionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRegistryModuleVersionResponseBody body);

        @Override
        GetRegistryModuleVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegistryModuleVersionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetRegistryModuleVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegistryModuleVersionResponse response) {
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
        public Builder body(GetRegistryModuleVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegistryModuleVersionResponse build() {
            return new GetRegistryModuleVersionResponse(this);
        } 

    } 

}
