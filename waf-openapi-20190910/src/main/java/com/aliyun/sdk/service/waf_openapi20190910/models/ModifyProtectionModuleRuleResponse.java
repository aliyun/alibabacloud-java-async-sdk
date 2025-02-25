// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProtectionModuleRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyProtectionModuleRuleResponse</p>
 */
public class ModifyProtectionModuleRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyProtectionModuleRuleResponseBody body;

    private ModifyProtectionModuleRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyProtectionModuleRuleResponse create() {
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
    public ModifyProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyProtectionModuleRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyProtectionModuleRuleResponseBody body);

        @Override
        ModifyProtectionModuleRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyProtectionModuleRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyProtectionModuleRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyProtectionModuleRuleResponse response) {
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
        public Builder body(ModifyProtectionModuleRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyProtectionModuleRuleResponse build() {
            return new ModifyProtectionModuleRuleResponse(this);
        } 

    } 

}
