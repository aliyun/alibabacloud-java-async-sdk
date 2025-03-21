// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GrantSwitchAgreementResponse} extends {@link TeaModel}
 *
 * <p>GrantSwitchAgreementResponse</p>
 */
public class GrantSwitchAgreementResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GrantSwitchAgreementResponseBody body;

    private GrantSwitchAgreementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GrantSwitchAgreementResponse create() {
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
    public GrantSwitchAgreementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantSwitchAgreementResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GrantSwitchAgreementResponseBody body);

        @Override
        GrantSwitchAgreementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantSwitchAgreementResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GrantSwitchAgreementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantSwitchAgreementResponse response) {
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
        public Builder body(GrantSwitchAgreementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantSwitchAgreementResponse build() {
            return new GrantSwitchAgreementResponse(this);
        } 

    } 

}
