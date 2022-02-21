// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyConsumerChannelResponse} extends {@link TeaModel}
 *
 * <p>ModifyConsumerChannelResponse</p>
 */
public class ModifyConsumerChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyConsumerChannelResponseBody body;

    private ModifyConsumerChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyConsumerChannelResponse create() {
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
    public ModifyConsumerChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyConsumerChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyConsumerChannelResponseBody body);

        @Override
        ModifyConsumerChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyConsumerChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyConsumerChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyConsumerChannelResponse response) {
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
        public Builder body(ModifyConsumerChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyConsumerChannelResponse build() {
            return new ModifyConsumerChannelResponse(this);
        } 

    } 

}
