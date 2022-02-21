// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinPublicIpsToEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>JoinPublicIpsToEpnInstanceResponse</p>
 */
public class JoinPublicIpsToEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinPublicIpsToEpnInstanceResponseBody body;

    private JoinPublicIpsToEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinPublicIpsToEpnInstanceResponse create() {
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
    public JoinPublicIpsToEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinPublicIpsToEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinPublicIpsToEpnInstanceResponseBody body);

        @Override
        JoinPublicIpsToEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinPublicIpsToEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinPublicIpsToEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinPublicIpsToEpnInstanceResponse response) {
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
        public Builder body(JoinPublicIpsToEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinPublicIpsToEpnInstanceResponse build() {
            return new JoinPublicIpsToEpnInstanceResponse(this);
        } 

    } 

}
