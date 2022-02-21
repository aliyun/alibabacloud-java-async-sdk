// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinVSwitchesToEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>JoinVSwitchesToEpnInstanceResponse</p>
 */
public class JoinVSwitchesToEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinVSwitchesToEpnInstanceResponseBody body;

    private JoinVSwitchesToEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinVSwitchesToEpnInstanceResponse create() {
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
    public JoinVSwitchesToEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinVSwitchesToEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinVSwitchesToEpnInstanceResponseBody body);

        @Override
        JoinVSwitchesToEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinVSwitchesToEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinVSwitchesToEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinVSwitchesToEpnInstanceResponse response) {
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
        public Builder body(JoinVSwitchesToEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinVSwitchesToEpnInstanceResponse build() {
            return new JoinVSwitchesToEpnInstanceResponse(this);
        } 

    } 

}
