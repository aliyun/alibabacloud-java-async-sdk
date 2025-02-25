// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceParameterResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceParameterResponse</p>
 */
public class ModifyInstanceParameterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyInstanceParameterResponseBody body;

    private ModifyInstanceParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyInstanceParameterResponse create() {
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
    public ModifyInstanceParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyInstanceParameterResponseBody body);

        @Override
        ModifyInstanceParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyInstanceParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceParameterResponse response) {
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
        public Builder body(ModifyInstanceParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceParameterResponse build() {
            return new ModifyInstanceParameterResponse(this);
        } 

    } 

}
