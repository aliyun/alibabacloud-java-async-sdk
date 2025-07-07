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
 * {@link EnterpriseAccountUpdateIpMaskResponse} extends {@link TeaModel}
 *
 * <p>EnterpriseAccountUpdateIpMaskResponse</p>
 */
public class EnterpriseAccountUpdateIpMaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnterpriseAccountUpdateIpMaskResponseBody body;

    private EnterpriseAccountUpdateIpMaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnterpriseAccountUpdateIpMaskResponse create() {
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
    public EnterpriseAccountUpdateIpMaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnterpriseAccountUpdateIpMaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnterpriseAccountUpdateIpMaskResponseBody body);

        @Override
        EnterpriseAccountUpdateIpMaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnterpriseAccountUpdateIpMaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnterpriseAccountUpdateIpMaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnterpriseAccountUpdateIpMaskResponse response) {
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
        public Builder body(EnterpriseAccountUpdateIpMaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnterpriseAccountUpdateIpMaskResponse build() {
            return new EnterpriseAccountUpdateIpMaskResponse(this);
        } 

    } 

}
