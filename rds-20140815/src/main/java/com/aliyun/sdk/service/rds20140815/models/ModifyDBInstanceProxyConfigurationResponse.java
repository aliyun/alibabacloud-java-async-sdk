// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceProxyConfigurationResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceProxyConfigurationResponse</p>
 */
public class ModifyDBInstanceProxyConfigurationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyDBInstanceProxyConfigurationResponseBody body;

    private ModifyDBInstanceProxyConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyDBInstanceProxyConfigurationResponse create() {
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
    public ModifyDBInstanceProxyConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBInstanceProxyConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyDBInstanceProxyConfigurationResponseBody body);

        @Override
        ModifyDBInstanceProxyConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBInstanceProxyConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyDBInstanceProxyConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBInstanceProxyConfigurationResponse response) {
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
        public Builder body(ModifyDBInstanceProxyConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBInstanceProxyConfigurationResponse build() {
            return new ModifyDBInstanceProxyConfigurationResponse(this);
        } 

    } 

}
