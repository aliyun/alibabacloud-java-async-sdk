// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebHostingConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebHostingConfigResponse</p>
 */
public class ModifyWebHostingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebHostingConfigResponseBody body;

    private ModifyWebHostingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebHostingConfigResponse create() {
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
    public ModifyWebHostingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebHostingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebHostingConfigResponseBody body);

        @Override
        ModifyWebHostingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebHostingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebHostingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebHostingConfigResponse response) {
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
        public Builder body(ModifyWebHostingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebHostingConfigResponse build() {
            return new ModifyWebHostingConfigResponse(this);
        } 

    } 

}
