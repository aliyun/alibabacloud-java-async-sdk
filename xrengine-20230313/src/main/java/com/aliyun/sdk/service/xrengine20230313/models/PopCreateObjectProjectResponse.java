// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateObjectProjectResponse} extends {@link TeaModel}
 *
 * <p>PopCreateObjectProjectResponse</p>
 */
public class PopCreateObjectProjectResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PopCreateObjectProjectResponseBody body;

    private PopCreateObjectProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopCreateObjectProjectResponse create() {
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
    public PopCreateObjectProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopCreateObjectProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopCreateObjectProjectResponseBody body);

        @Override
        PopCreateObjectProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopCreateObjectProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopCreateObjectProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopCreateObjectProjectResponse response) {
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
        public Builder body(PopCreateObjectProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopCreateObjectProjectResponse build() {
            return new PopCreateObjectProjectResponse(this);
        } 

    } 

}
