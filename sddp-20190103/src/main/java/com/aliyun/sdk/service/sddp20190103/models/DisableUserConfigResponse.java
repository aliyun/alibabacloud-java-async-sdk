// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableUserConfigResponse} extends {@link TeaModel}
 *
 * <p>DisableUserConfigResponse</p>
 */
public class DisableUserConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableUserConfigResponseBody body;

    private DisableUserConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableUserConfigResponse create() {
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
    public DisableUserConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableUserConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableUserConfigResponseBody body);

        @Override
        DisableUserConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableUserConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableUserConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableUserConfigResponse response) {
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
        public Builder body(DisableUserConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableUserConfigResponse build() {
            return new DisableUserConfigResponse(this);
        } 

    } 

}
