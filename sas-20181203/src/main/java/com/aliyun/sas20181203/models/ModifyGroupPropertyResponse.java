// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupPropertyResponse} extends {@link TeaModel}
 *
 * <p>ModifyGroupPropertyResponse</p>
 */
public class ModifyGroupPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGroupPropertyResponseBody body;

    private ModifyGroupPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGroupPropertyResponse create() {
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
    public ModifyGroupPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGroupPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGroupPropertyResponseBody body);

        @Override
        ModifyGroupPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGroupPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGroupPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGroupPropertyResponse response) {
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
        public Builder body(ModifyGroupPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGroupPropertyResponse build() {
            return new ModifyGroupPropertyResponse(this);
        } 

    } 

}
