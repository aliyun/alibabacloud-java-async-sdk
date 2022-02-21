// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppEnvResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppEnvResponse</p>
 */
public class UpdateAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppEnvResponseBody body;

    private UpdateAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppEnvResponse create() {
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
    public UpdateAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppEnvResponseBody body);

        @Override
        UpdateAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppEnvResponse response) {
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
        public Builder body(UpdateAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppEnvResponse build() {
            return new UpdateAppEnvResponse(this);
        } 

    } 

}
