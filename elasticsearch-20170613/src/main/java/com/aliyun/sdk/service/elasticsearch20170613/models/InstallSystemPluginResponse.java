// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallSystemPluginResponse} extends {@link TeaModel}
 *
 * <p>InstallSystemPluginResponse</p>
 */
public class InstallSystemPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private InstallSystemPluginResponseBody body;

    private InstallSystemPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static InstallSystemPluginResponse create() {
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
    public InstallSystemPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallSystemPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(InstallSystemPluginResponseBody body);

        @Override
        InstallSystemPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallSystemPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private InstallSystemPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallSystemPluginResponse response) {
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
        public Builder body(InstallSystemPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallSystemPluginResponse build() {
            return new InstallSystemPluginResponse(this);
        } 

    } 

}
