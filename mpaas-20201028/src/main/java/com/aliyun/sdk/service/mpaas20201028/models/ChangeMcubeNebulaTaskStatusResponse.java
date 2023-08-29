// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubeNebulaTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>ChangeMcubeNebulaTaskStatusResponse</p>
 */
public class ChangeMcubeNebulaTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeMcubeNebulaTaskStatusResponseBody body;

    private ChangeMcubeNebulaTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeMcubeNebulaTaskStatusResponse create() {
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
    public ChangeMcubeNebulaTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeMcubeNebulaTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeMcubeNebulaTaskStatusResponseBody body);

        @Override
        ChangeMcubeNebulaTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeMcubeNebulaTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeMcubeNebulaTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeMcubeNebulaTaskStatusResponse response) {
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
        public Builder body(ChangeMcubeNebulaTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeMcubeNebulaTaskStatusResponse build() {
            return new ChangeMcubeNebulaTaskStatusResponse(this);
        } 

    } 

}
