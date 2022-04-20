// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiServerEipResourceResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiServerEipResourceResponse</p>
 */
public class ModifyApiServerEipResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiServerEipResourceResponseBody body;

    private ModifyApiServerEipResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiServerEipResourceResponse create() {
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
    public ModifyApiServerEipResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiServerEipResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiServerEipResourceResponseBody body);

        @Override
        ModifyApiServerEipResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiServerEipResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiServerEipResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiServerEipResourceResponse response) {
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
        public Builder body(ModifyApiServerEipResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiServerEipResourceResponse build() {
            return new ModifyApiServerEipResourceResponse(this);
        } 

    } 

}
