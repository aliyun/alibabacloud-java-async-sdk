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
 * {@link EnterpriseAccountChangeLoginPasswordResponse} extends {@link TeaModel}
 *
 * <p>EnterpriseAccountChangeLoginPasswordResponse</p>
 */
public class EnterpriseAccountChangeLoginPasswordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnterpriseAccountChangeLoginPasswordResponseBody body;

    private EnterpriseAccountChangeLoginPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnterpriseAccountChangeLoginPasswordResponse create() {
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
    public EnterpriseAccountChangeLoginPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnterpriseAccountChangeLoginPasswordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnterpriseAccountChangeLoginPasswordResponseBody body);

        @Override
        EnterpriseAccountChangeLoginPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnterpriseAccountChangeLoginPasswordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnterpriseAccountChangeLoginPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnterpriseAccountChangeLoginPasswordResponse response) {
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
        public Builder body(EnterpriseAccountChangeLoginPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnterpriseAccountChangeLoginPasswordResponse build() {
            return new EnterpriseAccountChangeLoginPasswordResponse(this);
        } 

    } 

}
