// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtEagleEyeResponse} extends {@link TeaModel}
 *
 * <p>FtEagleEyeResponse</p>
 */
public class FtEagleEyeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtEagleEyeResponseBody body;

    private FtEagleEyeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtEagleEyeResponse create() {
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
    public FtEagleEyeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtEagleEyeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtEagleEyeResponseBody body);

        @Override
        FtEagleEyeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtEagleEyeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtEagleEyeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtEagleEyeResponse response) {
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
        public Builder body(FtEagleEyeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtEagleEyeResponse build() {
            return new FtEagleEyeResponse(this);
        } 

    } 

}
