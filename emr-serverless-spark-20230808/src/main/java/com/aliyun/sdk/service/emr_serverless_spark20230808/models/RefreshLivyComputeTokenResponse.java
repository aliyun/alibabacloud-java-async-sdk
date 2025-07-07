// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link RefreshLivyComputeTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshLivyComputeTokenResponse</p>
 */
public class RefreshLivyComputeTokenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RefreshLivyComputeTokenResponseBody body;

    private RefreshLivyComputeTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RefreshLivyComputeTokenResponse create() {
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
    public RefreshLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshLivyComputeTokenResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefreshLivyComputeTokenResponseBody body);

        @Override
        RefreshLivyComputeTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshLivyComputeTokenResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RefreshLivyComputeTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshLivyComputeTokenResponse response) {
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
        public Builder body(RefreshLivyComputeTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshLivyComputeTokenResponse build() {
            return new RefreshLivyComputeTokenResponse(this);
        } 

    } 

}
