// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProtectionRuleCacheStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyProtectionRuleCacheStatusResponse</p>
 */
public class ModifyProtectionRuleCacheStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyProtectionRuleCacheStatusResponseBody body;

    private ModifyProtectionRuleCacheStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyProtectionRuleCacheStatusResponse create() {
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
    public ModifyProtectionRuleCacheStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyProtectionRuleCacheStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyProtectionRuleCacheStatusResponseBody body);

        @Override
        ModifyProtectionRuleCacheStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyProtectionRuleCacheStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyProtectionRuleCacheStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyProtectionRuleCacheStatusResponse response) {
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
        public Builder body(ModifyProtectionRuleCacheStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyProtectionRuleCacheStatusResponse build() {
            return new ModifyProtectionRuleCacheStatusResponse(this);
        } 

    } 

}
