// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableThingResponse} extends {@link TeaModel}
 *
 * <p>DisableThingResponse</p>
 */
public class DisableThingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableThingResponseBody body;

    private DisableThingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableThingResponse create() {
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
    public DisableThingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableThingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableThingResponseBody body);

        @Override
        DisableThingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableThingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableThingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableThingResponse response) {
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
        public Builder body(DisableThingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableThingResponse build() {
            return new DisableThingResponse(this);
        } 

    } 

}
