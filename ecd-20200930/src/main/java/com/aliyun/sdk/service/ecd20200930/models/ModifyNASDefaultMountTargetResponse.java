// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNASDefaultMountTargetResponse} extends {@link TeaModel}
 *
 * <p>ModifyNASDefaultMountTargetResponse</p>
 */
public class ModifyNASDefaultMountTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNASDefaultMountTargetResponseBody body;

    private ModifyNASDefaultMountTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNASDefaultMountTargetResponse create() {
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
    public ModifyNASDefaultMountTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNASDefaultMountTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNASDefaultMountTargetResponseBody body);

        @Override
        ModifyNASDefaultMountTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNASDefaultMountTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNASDefaultMountTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNASDefaultMountTargetResponse response) {
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
        public Builder body(ModifyNASDefaultMountTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNASDefaultMountTargetResponse build() {
            return new ModifyNASDefaultMountTargetResponse(this);
        } 

    } 

}
