// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppPluginConfigForAdminResponse} extends {@link TeaModel}
 *
 * <p>GetAppPluginConfigForAdminResponse</p>
 */
public class GetAppPluginConfigForAdminResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAppPluginConfigForAdminResponseBody body;

    private GetAppPluginConfigForAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAppPluginConfigForAdminResponse create() {
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
    public GetAppPluginConfigForAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppPluginConfigForAdminResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAppPluginConfigForAdminResponseBody body);

        @Override
        GetAppPluginConfigForAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppPluginConfigForAdminResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetAppPluginConfigForAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppPluginConfigForAdminResponse response) {
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
        public Builder body(GetAppPluginConfigForAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppPluginConfigForAdminResponse build() {
            return new GetAppPluginConfigForAdminResponse(this);
        } 

    } 

}
