// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoRaNodesTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateLoRaNodesTaskResponse</p>
 */
public class CreateLoRaNodesTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLoRaNodesTaskResponseBody body;

    private CreateLoRaNodesTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLoRaNodesTaskResponse create() {
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
    public CreateLoRaNodesTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLoRaNodesTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLoRaNodesTaskResponseBody body);

        @Override
        CreateLoRaNodesTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLoRaNodesTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLoRaNodesTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLoRaNodesTaskResponse response) {
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
        public Builder body(CreateLoRaNodesTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLoRaNodesTaskResponse build() {
            return new CreateLoRaNodesTaskResponse(this);
        } 

    } 

}
