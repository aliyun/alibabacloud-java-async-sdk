// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link CreateGraphicAuthSchemeConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateGraphicAuthSchemeConfigResponse</p>
 */
public class CreateGraphicAuthSchemeConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateGraphicAuthSchemeConfigResponseBody body;

    private CreateGraphicAuthSchemeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateGraphicAuthSchemeConfigResponse create() {
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
    public CreateGraphicAuthSchemeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGraphicAuthSchemeConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateGraphicAuthSchemeConfigResponseBody body);

        @Override
        CreateGraphicAuthSchemeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGraphicAuthSchemeConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateGraphicAuthSchemeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGraphicAuthSchemeConfigResponse response) {
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
        public Builder body(CreateGraphicAuthSchemeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGraphicAuthSchemeConfigResponse build() {
            return new CreateGraphicAuthSchemeConfigResponse(this);
        } 

    } 

}
