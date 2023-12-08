// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyControlPolicyPositionResponse} extends {@link TeaModel}
 *
 * <p>ModifyControlPolicyPositionResponse</p>
 */
public class ModifyControlPolicyPositionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyControlPolicyPositionResponseBody body;

    private ModifyControlPolicyPositionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyControlPolicyPositionResponse create() {
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
    public ModifyControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyControlPolicyPositionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyControlPolicyPositionResponseBody body);

        @Override
        ModifyControlPolicyPositionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyControlPolicyPositionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyControlPolicyPositionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyControlPolicyPositionResponse response) {
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
        public Builder body(ModifyControlPolicyPositionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyControlPolicyPositionResponse build() {
            return new ModifyControlPolicyPositionResponse(this);
        } 

    } 

}
