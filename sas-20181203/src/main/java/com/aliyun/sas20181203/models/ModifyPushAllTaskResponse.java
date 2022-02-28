// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPushAllTaskResponse} extends {@link TeaModel}
 *
 * <p>ModifyPushAllTaskResponse</p>
 */
public class ModifyPushAllTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPushAllTaskResponseBody body;

    private ModifyPushAllTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPushAllTaskResponse create() {
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
    public ModifyPushAllTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPushAllTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPushAllTaskResponseBody body);

        @Override
        ModifyPushAllTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPushAllTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPushAllTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPushAllTaskResponse response) {
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
        public Builder body(ModifyPushAllTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPushAllTaskResponse build() {
            return new ModifyPushAllTaskResponse(this);
        } 

    } 

}
