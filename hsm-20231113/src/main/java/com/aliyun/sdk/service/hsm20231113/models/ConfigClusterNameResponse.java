// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigClusterNameResponse} extends {@link TeaModel}
 *
 * <p>ConfigClusterNameResponse</p>
 */
public class ConfigClusterNameResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ConfigClusterNameResponseBody body;

    private ConfigClusterNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ConfigClusterNameResponse create() {
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
    public ConfigClusterNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigClusterNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ConfigClusterNameResponseBody body);

        @Override
        ConfigClusterNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigClusterNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ConfigClusterNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigClusterNameResponse response) {
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
        public Builder body(ConfigClusterNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigClusterNameResponse build() {
            return new ConfigClusterNameResponse(this);
        } 

    } 

}
