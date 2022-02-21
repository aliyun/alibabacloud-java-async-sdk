// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyCenAttributeResponse</p>
 */
public class ModifyCenAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCenAttributeResponseBody body;

    private ModifyCenAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCenAttributeResponse create() {
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
    public ModifyCenAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCenAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCenAttributeResponseBody body);

        @Override
        ModifyCenAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCenAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCenAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCenAttributeResponse response) {
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
        public Builder body(ModifyCenAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCenAttributeResponse build() {
            return new ModifyCenAttributeResponse(this);
        } 

    } 

}
