// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DeregisterDelegatedAdministratorResponse} extends {@link TeaModel}
 *
 * <p>DeregisterDelegatedAdministratorResponse</p>
 */
public class DeregisterDelegatedAdministratorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeregisterDelegatedAdministratorResponseBody body;

    private DeregisterDelegatedAdministratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeregisterDelegatedAdministratorResponse create() {
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
    public DeregisterDelegatedAdministratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterDelegatedAdministratorResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeregisterDelegatedAdministratorResponseBody body);

        @Override
        DeregisterDelegatedAdministratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterDelegatedAdministratorResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeregisterDelegatedAdministratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterDelegatedAdministratorResponse response) {
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
        public Builder body(DeregisterDelegatedAdministratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterDelegatedAdministratorResponse build() {
            return new DeregisterDelegatedAdministratorResponse(this);
        } 

    } 

}
