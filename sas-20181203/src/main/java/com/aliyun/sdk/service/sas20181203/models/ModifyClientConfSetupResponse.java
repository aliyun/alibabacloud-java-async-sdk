// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClientConfSetupResponse} extends {@link TeaModel}
 *
 * <p>ModifyClientConfSetupResponse</p>
 */
public class ModifyClientConfSetupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyClientConfSetupResponseBody body;

    private ModifyClientConfSetupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyClientConfSetupResponse create() {
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
    public ModifyClientConfSetupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClientConfSetupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyClientConfSetupResponseBody body);

        @Override
        ModifyClientConfSetupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClientConfSetupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyClientConfSetupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClientConfSetupResponse response) {
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
        public Builder body(ModifyClientConfSetupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClientConfSetupResponse build() {
            return new ModifyClientConfSetupResponse(this);
        } 

    } 

}
