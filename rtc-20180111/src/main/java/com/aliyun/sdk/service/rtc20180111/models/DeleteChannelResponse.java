// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteChannelResponse} extends {@link TeaModel}
 *
 * <p>DeleteChannelResponse</p>
 */
public class DeleteChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteChannelResponseBody body;

    private DeleteChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteChannelResponse create() {
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
    public DeleteChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteChannelResponseBody body);

        @Override
        DeleteChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteChannelResponse response) {
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
        public Builder body(DeleteChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteChannelResponse build() {
            return new DeleteChannelResponse(this);
        } 

    } 

}
