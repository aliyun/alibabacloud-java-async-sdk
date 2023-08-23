// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDisableFwSwitchResponse} extends {@link TeaModel}
 *
 * <p>PutDisableFwSwitchResponse</p>
 */
public class PutDisableFwSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutDisableFwSwitchResponseBody body;

    private PutDisableFwSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutDisableFwSwitchResponse create() {
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
    public PutDisableFwSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutDisableFwSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutDisableFwSwitchResponseBody body);

        @Override
        PutDisableFwSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutDisableFwSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutDisableFwSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutDisableFwSwitchResponse response) {
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
        public Builder body(PutDisableFwSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutDisableFwSwitchResponse build() {
            return new PutDisableFwSwitchResponse(this);
        } 

    } 

}
