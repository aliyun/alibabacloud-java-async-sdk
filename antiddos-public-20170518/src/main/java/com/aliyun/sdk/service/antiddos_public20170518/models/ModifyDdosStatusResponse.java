// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDdosStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyDdosStatusResponse</p>
 */
public class ModifyDdosStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDdosStatusResponseBody body;

    private ModifyDdosStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDdosStatusResponse create() {
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
    public ModifyDdosStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDdosStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDdosStatusResponseBody body);

        @Override
        ModifyDdosStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDdosStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDdosStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDdosStatusResponse response) {
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
        public Builder body(ModifyDdosStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDdosStatusResponse build() {
            return new ModifyDdosStatusResponse(this);
        } 

    } 

}
