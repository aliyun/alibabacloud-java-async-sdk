// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerChannelResponse} extends {@link TeaModel}
 *
 * <p>CreateConsumerChannelResponse</p>
 */
public class CreateConsumerChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConsumerChannelResponseBody body;

    private CreateConsumerChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConsumerChannelResponse create() {
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
    public CreateConsumerChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConsumerChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConsumerChannelResponseBody body);

        @Override
        CreateConsumerChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConsumerChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConsumerChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConsumerChannelResponse response) {
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
        public Builder body(CreateConsumerChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConsumerChannelResponse build() {
            return new CreateConsumerChannelResponse(this);
        } 

    } 

}
