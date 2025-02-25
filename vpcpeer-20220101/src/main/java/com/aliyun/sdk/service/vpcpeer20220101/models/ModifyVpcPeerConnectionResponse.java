// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

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
 * {@link ModifyVpcPeerConnectionResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpcPeerConnectionResponse</p>
 */
public class ModifyVpcPeerConnectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyVpcPeerConnectionResponseBody body;

    private ModifyVpcPeerConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyVpcPeerConnectionResponse create() {
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
    public ModifyVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpcPeerConnectionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyVpcPeerConnectionResponseBody body);

        @Override
        ModifyVpcPeerConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpcPeerConnectionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyVpcPeerConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpcPeerConnectionResponse response) {
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
        public Builder body(ModifyVpcPeerConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpcPeerConnectionResponse build() {
            return new ModifyVpcPeerConnectionResponse(this);
        } 

    } 

}
