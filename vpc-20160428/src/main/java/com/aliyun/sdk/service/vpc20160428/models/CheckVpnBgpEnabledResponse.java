// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVpnBgpEnabledResponse} extends {@link TeaModel}
 *
 * <p>CheckVpnBgpEnabledResponse</p>
 */
public class CheckVpnBgpEnabledResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckVpnBgpEnabledResponseBody body;

    private CheckVpnBgpEnabledResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckVpnBgpEnabledResponse create() {
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
    public CheckVpnBgpEnabledResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckVpnBgpEnabledResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckVpnBgpEnabledResponseBody body);

        @Override
        CheckVpnBgpEnabledResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckVpnBgpEnabledResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckVpnBgpEnabledResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckVpnBgpEnabledResponse response) {
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
        public Builder body(CheckVpnBgpEnabledResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckVpnBgpEnabledResponse build() {
            return new CheckVpnBgpEnabledResponse(this);
        } 

    } 

}
