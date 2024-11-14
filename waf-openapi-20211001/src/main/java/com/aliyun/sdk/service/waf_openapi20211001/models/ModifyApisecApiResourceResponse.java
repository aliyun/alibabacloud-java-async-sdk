// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyApisecApiResourceResponse} extends {@link TeaModel}
 *
 * <p>ModifyApisecApiResourceResponse</p>
 */
public class ModifyApisecApiResourceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyApisecApiResourceResponseBody body;

    private ModifyApisecApiResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyApisecApiResourceResponse create() {
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
    public ModifyApisecApiResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApisecApiResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyApisecApiResourceResponseBody body);

        @Override
        ModifyApisecApiResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApisecApiResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyApisecApiResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApisecApiResourceResponse response) {
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
        public Builder body(ModifyApisecApiResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApisecApiResourceResponse build() {
            return new ModifyApisecApiResourceResponse(this);
        } 

    } 

}
