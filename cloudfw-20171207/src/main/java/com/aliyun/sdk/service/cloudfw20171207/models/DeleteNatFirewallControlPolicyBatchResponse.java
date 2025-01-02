// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteNatFirewallControlPolicyBatchResponse} extends {@link TeaModel}
 *
 * <p>DeleteNatFirewallControlPolicyBatchResponse</p>
 */
public class DeleteNatFirewallControlPolicyBatchResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteNatFirewallControlPolicyBatchResponseBody body;

    private DeleteNatFirewallControlPolicyBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteNatFirewallControlPolicyBatchResponse create() {
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
    public DeleteNatFirewallControlPolicyBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNatFirewallControlPolicyBatchResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteNatFirewallControlPolicyBatchResponseBody body);

        @Override
        DeleteNatFirewallControlPolicyBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNatFirewallControlPolicyBatchResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteNatFirewallControlPolicyBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNatFirewallControlPolicyBatchResponse response) {
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
        public Builder body(DeleteNatFirewallControlPolicyBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNatFirewallControlPolicyBatchResponse build() {
            return new DeleteNatFirewallControlPolicyBatchResponse(this);
        } 

    } 

}
