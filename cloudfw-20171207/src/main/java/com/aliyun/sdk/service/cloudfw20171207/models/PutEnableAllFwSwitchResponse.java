// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnableAllFwSwitchResponse} extends {@link TeaModel}
 *
 * <p>PutEnableAllFwSwitchResponse</p>
 */
public class PutEnableAllFwSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutEnableAllFwSwitchResponseBody body;

    private PutEnableAllFwSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEnableAllFwSwitchResponse create() {
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
    public PutEnableAllFwSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEnableAllFwSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutEnableAllFwSwitchResponseBody body);

        @Override
        PutEnableAllFwSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEnableAllFwSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutEnableAllFwSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEnableAllFwSwitchResponse response) {
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
        public Builder body(PutEnableAllFwSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEnableAllFwSwitchResponse build() {
            return new PutEnableAllFwSwitchResponse(this);
        } 

    } 

}
