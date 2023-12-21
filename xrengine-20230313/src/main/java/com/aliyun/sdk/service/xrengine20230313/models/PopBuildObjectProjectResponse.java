// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBuildObjectProjectResponse} extends {@link TeaModel}
 *
 * <p>PopBuildObjectProjectResponse</p>
 */
public class PopBuildObjectProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PopBuildObjectProjectResponseBody body;

    private PopBuildObjectProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopBuildObjectProjectResponse create() {
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
    public PopBuildObjectProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopBuildObjectProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopBuildObjectProjectResponseBody body);

        @Override
        PopBuildObjectProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopBuildObjectProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopBuildObjectProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopBuildObjectProjectResponse response) {
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
        public Builder body(PopBuildObjectProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopBuildObjectProjectResponse build() {
            return new PopBuildObjectProjectResponse(this);
        } 

    } 

}
