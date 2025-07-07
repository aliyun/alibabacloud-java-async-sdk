// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleQueryBizRoleByPageResponse} extends {@link TeaModel}
 *
 * <p>EnterpriseRoleQueryBizRoleByPageResponse</p>
 */
public class EnterpriseRoleQueryBizRoleByPageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnterpriseRoleQueryBizRoleByPageResponseBody body;

    private EnterpriseRoleQueryBizRoleByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnterpriseRoleQueryBizRoleByPageResponse create() {
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
    public EnterpriseRoleQueryBizRoleByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnterpriseRoleQueryBizRoleByPageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnterpriseRoleQueryBizRoleByPageResponseBody body);

        @Override
        EnterpriseRoleQueryBizRoleByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnterpriseRoleQueryBizRoleByPageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnterpriseRoleQueryBizRoleByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnterpriseRoleQueryBizRoleByPageResponse response) {
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
        public Builder body(EnterpriseRoleQueryBizRoleByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnterpriseRoleQueryBizRoleByPageResponse build() {
            return new EnterpriseRoleQueryBizRoleByPageResponse(this);
        } 

    } 

}
