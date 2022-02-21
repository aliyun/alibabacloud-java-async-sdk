// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySnatEntryResponse} extends {@link TeaModel}
 *
 * <p>ModifySnatEntryResponse</p>
 */
public class ModifySnatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySnatEntryResponseBody body;

    private ModifySnatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySnatEntryResponse create() {
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
    public ModifySnatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySnatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySnatEntryResponseBody body);

        @Override
        ModifySnatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySnatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySnatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySnatEntryResponse response) {
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
        public Builder body(ModifySnatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySnatEntryResponse build() {
            return new ModifySnatEntryResponse(this);
        } 

    } 

}
