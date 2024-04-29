// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHttp2EnableResponse} extends {@link TeaModel}
 *
 * <p>ModifyHttp2EnableResponse</p>
 */
public class ModifyHttp2EnableResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyHttp2EnableResponseBody body;

    private ModifyHttp2EnableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyHttp2EnableResponse create() {
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
    public ModifyHttp2EnableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHttp2EnableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyHttp2EnableResponseBody body);

        @Override
        ModifyHttp2EnableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHttp2EnableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyHttp2EnableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHttp2EnableResponse response) {
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
        public Builder body(ModifyHttp2EnableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHttp2EnableResponse build() {
            return new ModifyHttp2EnableResponse(this);
        } 

    } 

}
