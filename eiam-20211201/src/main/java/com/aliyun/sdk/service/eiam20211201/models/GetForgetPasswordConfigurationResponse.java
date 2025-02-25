// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetForgetPasswordConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetForgetPasswordConfigurationResponse</p>
 */
public class GetForgetPasswordConfigurationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetForgetPasswordConfigurationResponseBody body;

    private GetForgetPasswordConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetForgetPasswordConfigurationResponse create() {
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
    public GetForgetPasswordConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetForgetPasswordConfigurationResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetForgetPasswordConfigurationResponseBody body);

        @Override
        GetForgetPasswordConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetForgetPasswordConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetForgetPasswordConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetForgetPasswordConfigurationResponse response) {
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
        public Builder body(GetForgetPasswordConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetForgetPasswordConfigurationResponse build() {
            return new GetForgetPasswordConfigurationResponse(this);
        } 

    } 

}
