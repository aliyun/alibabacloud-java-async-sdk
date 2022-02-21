// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceResponse} extends {@link TeaModel}
 *
 * <p>DisableInstanceResponse</p>
 */
public class DisableInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableInstanceResponseBody body;

    private DisableInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableInstanceResponse create() {
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
    public DisableInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableInstanceResponseBody body);

        @Override
        DisableInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableInstanceResponse response) {
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
        public Builder body(DisableInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableInstanceResponse build() {
            return new DisableInstanceResponse(this);
        } 

    } 

}
