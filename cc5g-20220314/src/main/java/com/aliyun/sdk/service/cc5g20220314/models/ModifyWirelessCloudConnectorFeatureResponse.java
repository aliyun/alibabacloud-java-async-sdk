// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWirelessCloudConnectorFeatureResponse} extends {@link TeaModel}
 *
 * <p>ModifyWirelessCloudConnectorFeatureResponse</p>
 */
public class ModifyWirelessCloudConnectorFeatureResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyWirelessCloudConnectorFeatureResponseBody body;

    private ModifyWirelessCloudConnectorFeatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyWirelessCloudConnectorFeatureResponse create() {
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
    public ModifyWirelessCloudConnectorFeatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWirelessCloudConnectorFeatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyWirelessCloudConnectorFeatureResponseBody body);

        @Override
        ModifyWirelessCloudConnectorFeatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWirelessCloudConnectorFeatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyWirelessCloudConnectorFeatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWirelessCloudConnectorFeatureResponse response) {
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
        public Builder body(ModifyWirelessCloudConnectorFeatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWirelessCloudConnectorFeatureResponse build() {
            return new ModifyWirelessCloudConnectorFeatureResponse(this);
        } 

    } 

}
