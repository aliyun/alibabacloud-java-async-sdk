// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySoarStrategySubscribeResponse} extends {@link TeaModel}
 *
 * <p>ModifySoarStrategySubscribeResponse</p>
 */
public class ModifySoarStrategySubscribeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifySoarStrategySubscribeResponseBody body;

    private ModifySoarStrategySubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifySoarStrategySubscribeResponse create() {
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
    public ModifySoarStrategySubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySoarStrategySubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifySoarStrategySubscribeResponseBody body);

        @Override
        ModifySoarStrategySubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySoarStrategySubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifySoarStrategySubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySoarStrategySubscribeResponse response) {
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
        public Builder body(ModifySoarStrategySubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySoarStrategySubscribeResponse build() {
            return new ModifySoarStrategySubscribeResponse(this);
        } 

    } 

}
