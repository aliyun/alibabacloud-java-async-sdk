// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterChannelResponse} extends {@link TeaModel}
 *
 * <p>SetCasterChannelResponse</p>
 */
public class SetCasterChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCasterChannelResponseBody body;

    private SetCasterChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCasterChannelResponse create() {
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
    public SetCasterChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCasterChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCasterChannelResponseBody body);

        @Override
        SetCasterChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCasterChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCasterChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCasterChannelResponse response) {
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
        public Builder body(SetCasterChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCasterChannelResponse build() {
            return new SetCasterChannelResponse(this);
        } 

    } 

}
