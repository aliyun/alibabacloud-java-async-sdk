// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteCameraShootingCommandResponse} extends {@link TeaModel}
 *
 * <p>ExecuteCameraShootingCommandResponse</p>
 */
public class ExecuteCameraShootingCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteCameraShootingCommandResponseBody body;

    private ExecuteCameraShootingCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteCameraShootingCommandResponse create() {
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
    public ExecuteCameraShootingCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteCameraShootingCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteCameraShootingCommandResponseBody body);

        @Override
        ExecuteCameraShootingCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteCameraShootingCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteCameraShootingCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteCameraShootingCommandResponse response) {
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
        public Builder body(ExecuteCameraShootingCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteCameraShootingCommandResponse build() {
            return new ExecuteCameraShootingCommandResponse(this);
        } 

    } 

}
