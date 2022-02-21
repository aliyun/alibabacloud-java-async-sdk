// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinFabricChannelResponse} extends {@link TeaModel}
 *
 * <p>JoinFabricChannelResponse</p>
 */
public class JoinFabricChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinFabricChannelResponseBody body;

    private JoinFabricChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinFabricChannelResponse create() {
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
    public JoinFabricChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinFabricChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinFabricChannelResponseBody body);

        @Override
        JoinFabricChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinFabricChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinFabricChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinFabricChannelResponse response) {
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
        public Builder body(JoinFabricChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinFabricChannelResponse build() {
            return new JoinFabricChannelResponse(this);
        } 

    } 

}
