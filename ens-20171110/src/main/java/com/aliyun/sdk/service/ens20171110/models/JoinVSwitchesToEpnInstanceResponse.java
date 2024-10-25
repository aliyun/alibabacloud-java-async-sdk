// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link JoinVSwitchesToEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>JoinVSwitchesToEpnInstanceResponse</p>
 */
public class JoinVSwitchesToEpnInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private JoinVSwitchesToEpnInstanceResponseBody body;

    private JoinVSwitchesToEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public JoinVSwitchesToEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinVSwitchesToEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(JoinVSwitchesToEpnInstanceResponseBody body);

        @Override
        JoinVSwitchesToEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinVSwitchesToEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private JoinVSwitchesToEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinVSwitchesToEpnInstanceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
