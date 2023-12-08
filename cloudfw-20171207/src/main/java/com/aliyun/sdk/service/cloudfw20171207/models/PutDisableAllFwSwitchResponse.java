// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDisableAllFwSwitchResponse} extends {@link TeaModel}
 *
 * <p>PutDisableAllFwSwitchResponse</p>
 */
public class PutDisableAllFwSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutDisableAllFwSwitchResponseBody body;

    private PutDisableAllFwSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutDisableAllFwSwitchResponse create() {
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
    public PutDisableAllFwSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutDisableAllFwSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutDisableAllFwSwitchResponseBody body);

        @Override
        PutDisableAllFwSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutDisableAllFwSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutDisableAllFwSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutDisableAllFwSwitchResponse response) {
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
        public Builder body(PutDisableAllFwSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutDisableAllFwSwitchResponse build() {
            return new PutDisableAllFwSwitchResponse(this);
        } 

    } 

}
