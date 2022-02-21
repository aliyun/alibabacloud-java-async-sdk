// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDNSSLBStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDNSSLBStatusResponse</p>
 */
public class SetDNSSLBStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDNSSLBStatusResponseBody body;

    private SetDNSSLBStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDNSSLBStatusResponse create() {
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
    public SetDNSSLBStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDNSSLBStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDNSSLBStatusResponseBody body);

        @Override
        SetDNSSLBStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDNSSLBStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDNSSLBStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDNSSLBStatusResponse response) {
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
        public Builder body(SetDNSSLBStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDNSSLBStatusResponse build() {
            return new SetDNSSLBStatusResponse(this);
        } 

    } 

}
