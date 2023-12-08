// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnableFwSwitchResponse} extends {@link TeaModel}
 *
 * <p>PutEnableFwSwitchResponse</p>
 */
public class PutEnableFwSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutEnableFwSwitchResponseBody body;

    private PutEnableFwSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEnableFwSwitchResponse create() {
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
    public PutEnableFwSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEnableFwSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutEnableFwSwitchResponseBody body);

        @Override
        PutEnableFwSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEnableFwSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutEnableFwSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEnableFwSwitchResponse response) {
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
        public Builder body(PutEnableFwSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEnableFwSwitchResponse build() {
            return new PutEnableFwSwitchResponse(this);
        } 

    } 

}
