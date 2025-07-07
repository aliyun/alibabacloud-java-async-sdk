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
 * {@link EnterpriseUninvitedAdminInviteJoinEnterpriseResponse} extends {@link TeaModel}
 *
 * <p>EnterpriseUninvitedAdminInviteJoinEnterpriseResponse</p>
 */
public class EnterpriseUninvitedAdminInviteJoinEnterpriseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body;

    private EnterpriseUninvitedAdminInviteJoinEnterpriseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseResponse create() {
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
    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnterpriseUninvitedAdminInviteJoinEnterpriseResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body);

        @Override
        EnterpriseUninvitedAdminInviteJoinEnterpriseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnterpriseUninvitedAdminInviteJoinEnterpriseResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnterpriseUninvitedAdminInviteJoinEnterpriseResponse response) {
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
        public Builder body(EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse build() {
            return new EnterpriseUninvitedAdminInviteJoinEnterpriseResponse(this);
        } 

    } 

}
