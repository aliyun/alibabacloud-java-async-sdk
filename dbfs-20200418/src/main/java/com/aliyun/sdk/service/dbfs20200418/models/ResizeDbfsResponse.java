// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDbfsResponse} extends {@link TeaModel}
 *
 * <p>ResizeDbfsResponse</p>
 */
public class ResizeDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeDbfsResponseBody body;

    private ResizeDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeDbfsResponse create() {
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
     * @return body
     */
    public ResizeDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeDbfsResponseBody body);

        @Override
        ResizeDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeDbfsResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(ResizeDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeDbfsResponse build() {
            return new ResizeDbfsResponse(this);
        } 

    } 

}
