// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link RotateClusterManagedCertResponse} extends {@link TeaModel}
 *
 * <p>RotateClusterManagedCertResponse</p>
 */
public class RotateClusterManagedCertResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RotateClusterManagedCertResponseBody body;

    private RotateClusterManagedCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RotateClusterManagedCertResponse create() {
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
    public RotateClusterManagedCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RotateClusterManagedCertResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RotateClusterManagedCertResponseBody body);

        @Override
        RotateClusterManagedCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RotateClusterManagedCertResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RotateClusterManagedCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RotateClusterManagedCertResponse response) {
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
        public Builder body(RotateClusterManagedCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RotateClusterManagedCertResponse build() {
            return new RotateClusterManagedCertResponse(this);
        } 

    } 

}
