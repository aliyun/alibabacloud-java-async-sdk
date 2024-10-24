// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfigLayer4RuleBakModeResponse} extends {@link TeaModel}
 *
 * <p>ConfigLayer4RuleBakModeResponse</p>
 */
public class ConfigLayer4RuleBakModeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ConfigLayer4RuleBakModeResponseBody body;

    private ConfigLayer4RuleBakModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ConfigLayer4RuleBakModeResponse create() {
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
    public ConfigLayer4RuleBakModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigLayer4RuleBakModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ConfigLayer4RuleBakModeResponseBody body);

        @Override
        ConfigLayer4RuleBakModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigLayer4RuleBakModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ConfigLayer4RuleBakModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigLayer4RuleBakModeResponse response) {
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
        public Builder body(ConfigLayer4RuleBakModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigLayer4RuleBakModeResponse build() {
            return new ConfigLayer4RuleBakModeResponse(this);
        } 

    } 

}
