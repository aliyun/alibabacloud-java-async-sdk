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
 * {@link CreateVpcFirewallConfigureResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallConfigureResponse</p>
 */
public class CreateVpcFirewallConfigureResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateVpcFirewallConfigureResponseBody body;

    private CreateVpcFirewallConfigureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateVpcFirewallConfigureResponse create() {
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
    public CreateVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcFirewallConfigureResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateVpcFirewallConfigureResponseBody body);

        @Override
        CreateVpcFirewallConfigureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcFirewallConfigureResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateVpcFirewallConfigureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcFirewallConfigureResponse response) {
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
        public Builder body(CreateVpcFirewallConfigureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcFirewallConfigureResponse build() {
            return new CreateVpcFirewallConfigureResponse(this);
        } 

    } 

}
