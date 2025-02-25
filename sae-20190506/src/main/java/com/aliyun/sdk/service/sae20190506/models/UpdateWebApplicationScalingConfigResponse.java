// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateWebApplicationScalingConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateWebApplicationScalingConfigResponse</p>
 */
public class UpdateWebApplicationScalingConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private WebApplicationScalingConfigBody body;

    private UpdateWebApplicationScalingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateWebApplicationScalingConfigResponse create() {
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
    public WebApplicationScalingConfigBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWebApplicationScalingConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(WebApplicationScalingConfigBody body);

        @Override
        UpdateWebApplicationScalingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWebApplicationScalingConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private WebApplicationScalingConfigBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWebApplicationScalingConfigResponse response) {
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
        public Builder body(WebApplicationScalingConfigBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWebApplicationScalingConfigResponse build() {
            return new UpdateWebApplicationScalingConfigResponse(this);
        } 

    } 

}
