// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreateIdentityProviderSyncJobResponse} extends {@link TeaModel}
 *
 * <p>CreateIdentityProviderSyncJobResponse</p>
 */
public class CreateIdentityProviderSyncJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateIdentityProviderSyncJobResponseBody body;

    private CreateIdentityProviderSyncJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateIdentityProviderSyncJobResponse create() {
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
    public CreateIdentityProviderSyncJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIdentityProviderSyncJobResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateIdentityProviderSyncJobResponseBody body);

        @Override
        CreateIdentityProviderSyncJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIdentityProviderSyncJobResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateIdentityProviderSyncJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIdentityProviderSyncJobResponse response) {
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
        public Builder body(CreateIdentityProviderSyncJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIdentityProviderSyncJobResponse build() {
            return new CreateIdentityProviderSyncJobResponse(this);
        } 

    } 

}
