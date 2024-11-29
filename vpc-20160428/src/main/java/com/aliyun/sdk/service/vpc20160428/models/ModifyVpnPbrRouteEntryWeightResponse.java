// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVpnPbrRouteEntryWeightResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpnPbrRouteEntryWeightResponse</p>
 */
public class ModifyVpnPbrRouteEntryWeightResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyVpnPbrRouteEntryWeightResponseBody body;

    private ModifyVpnPbrRouteEntryWeightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyVpnPbrRouteEntryWeightResponse create() {
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
    public ModifyVpnPbrRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpnPbrRouteEntryWeightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyVpnPbrRouteEntryWeightResponseBody body);

        @Override
        ModifyVpnPbrRouteEntryWeightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpnPbrRouteEntryWeightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyVpnPbrRouteEntryWeightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpnPbrRouteEntryWeightResponse response) {
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
        public Builder body(ModifyVpnPbrRouteEntryWeightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpnPbrRouteEntryWeightResponse build() {
            return new ModifyVpnPbrRouteEntryWeightResponse(this);
        } 

    } 

}
