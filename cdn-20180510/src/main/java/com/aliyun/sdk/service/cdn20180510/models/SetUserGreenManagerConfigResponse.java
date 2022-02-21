// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserGreenManagerConfigResponse} extends {@link TeaModel}
 *
 * <p>SetUserGreenManagerConfigResponse</p>
 */
public class SetUserGreenManagerConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetUserGreenManagerConfigResponseBody body;

    private SetUserGreenManagerConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetUserGreenManagerConfigResponse create() {
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
    public SetUserGreenManagerConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetUserGreenManagerConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetUserGreenManagerConfigResponseBody body);

        @Override
        SetUserGreenManagerConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetUserGreenManagerConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetUserGreenManagerConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetUserGreenManagerConfigResponse response) {
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
        public Builder body(SetUserGreenManagerConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetUserGreenManagerConfigResponse build() {
            return new SetUserGreenManagerConfigResponse(this);
        } 

    } 

}
