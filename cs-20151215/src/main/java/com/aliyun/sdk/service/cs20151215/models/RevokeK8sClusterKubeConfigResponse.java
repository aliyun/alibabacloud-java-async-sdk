// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link RevokeK8sClusterKubeConfigResponse} extends {@link TeaModel}
 *
 * <p>RevokeK8sClusterKubeConfigResponse</p>
 */
public class RevokeK8sClusterKubeConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RevokeK8sClusterKubeConfigResponseBody body;

    private RevokeK8sClusterKubeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeK8sClusterKubeConfigResponse create() {
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
    public RevokeK8sClusterKubeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeK8sClusterKubeConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeK8sClusterKubeConfigResponseBody body);

        @Override
        RevokeK8sClusterKubeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeK8sClusterKubeConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RevokeK8sClusterKubeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeK8sClusterKubeConfigResponse response) {
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
        public Builder body(RevokeK8sClusterKubeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeK8sClusterKubeConfigResponse build() {
            return new RevokeK8sClusterKubeConfigResponse(this);
        } 

    } 

}
