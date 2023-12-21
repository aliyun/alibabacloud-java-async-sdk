// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBuildPakRenderProjectResponse} extends {@link TeaModel}
 *
 * <p>PopBuildPakRenderProjectResponse</p>
 */
public class PopBuildPakRenderProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PopBuildPakRenderProjectResponseBody body;

    private PopBuildPakRenderProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopBuildPakRenderProjectResponse create() {
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
    public PopBuildPakRenderProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopBuildPakRenderProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopBuildPakRenderProjectResponseBody body);

        @Override
        PopBuildPakRenderProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopBuildPakRenderProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopBuildPakRenderProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopBuildPakRenderProjectResponse response) {
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
        public Builder body(PopBuildPakRenderProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopBuildPakRenderProjectResponse build() {
            return new PopBuildPakRenderProjectResponse(this);
        } 

    } 

}
