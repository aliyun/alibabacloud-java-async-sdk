// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyLogServiceStatusResponse</p>
 */
public class ModifyLogServiceStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyLogServiceStatusResponseBody body;

    private ModifyLogServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyLogServiceStatusResponse create() {
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
    public ModifyLogServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLogServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyLogServiceStatusResponseBody body);

        @Override
        ModifyLogServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLogServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyLogServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLogServiceStatusResponse response) {
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
        public Builder body(ModifyLogServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLogServiceStatusResponse build() {
            return new ModifyLogServiceStatusResponse(this);
        } 

    } 

}
