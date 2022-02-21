// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAuditSecurityIpResponse} extends {@link TeaModel}
 *
 * <p>SetAuditSecurityIpResponse</p>
 */
public class SetAuditSecurityIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetAuditSecurityIpResponseBody body;

    private SetAuditSecurityIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetAuditSecurityIpResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public SetAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetAuditSecurityIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetAuditSecurityIpResponseBody body);

        @Override
        SetAuditSecurityIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetAuditSecurityIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetAuditSecurityIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetAuditSecurityIpResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SetAuditSecurityIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetAuditSecurityIpResponse build() {
            return new SetAuditSecurityIpResponse(this);
        } 

    } 

}
