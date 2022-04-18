// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventTypeStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyEventTypeStatusResponse</p>
 */
public class ModifyEventTypeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyEventTypeStatusResponseBody body;

    private ModifyEventTypeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyEventTypeStatusResponse create() {
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
    public ModifyEventTypeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyEventTypeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyEventTypeStatusResponseBody body);

        @Override
        ModifyEventTypeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyEventTypeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyEventTypeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyEventTypeStatusResponse response) {
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
        public Builder body(ModifyEventTypeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyEventTypeStatusResponse build() {
            return new ModifyEventTypeStatusResponse(this);
        } 

    } 

}
