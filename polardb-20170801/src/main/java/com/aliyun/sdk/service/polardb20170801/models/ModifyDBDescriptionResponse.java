// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBDescriptionResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBDescriptionResponse</p>
 */
public class ModifyDBDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBDescriptionResponseBody body;

    private ModifyDBDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBDescriptionResponse create() {
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
    public ModifyDBDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBDescriptionResponseBody body);

        @Override
        ModifyDBDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBDescriptionResponse response) {
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
        public Builder body(ModifyDBDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBDescriptionResponse build() {
            return new ModifyDBDescriptionResponse(this);
        } 

    } 

}
