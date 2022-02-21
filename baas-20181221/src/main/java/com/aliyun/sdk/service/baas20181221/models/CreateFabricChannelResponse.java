// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChannelResponse} extends {@link TeaModel}
 *
 * <p>CreateFabricChannelResponse</p>
 */
public class CreateFabricChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFabricChannelResponseBody body;

    private CreateFabricChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFabricChannelResponse create() {
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
    public CreateFabricChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFabricChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFabricChannelResponseBody body);

        @Override
        CreateFabricChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFabricChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFabricChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFabricChannelResponse response) {
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
        public Builder body(CreateFabricChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFabricChannelResponse build() {
            return new CreateFabricChannelResponse(this);
        } 

    } 

}
