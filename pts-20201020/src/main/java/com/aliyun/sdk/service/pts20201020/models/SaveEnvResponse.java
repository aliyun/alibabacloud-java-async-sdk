// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveEnvResponse} extends {@link TeaModel}
 *
 * <p>SaveEnvResponse</p>
 */
public class SaveEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveEnvResponseBody body;

    private SaveEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveEnvResponse create() {
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
    public SaveEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveEnvResponseBody body);

        @Override
        SaveEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveEnvResponse response) {
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
        public Builder body(SaveEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveEnvResponse build() {
            return new SaveEnvResponse(this);
        } 

    } 

}
