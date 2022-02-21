// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppResponse} extends {@link TeaModel}
 *
 * <p>ModifyAppResponse</p>
 */
public class ModifyAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAppResponseBody body;

    private ModifyAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAppResponse create() {
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
    public ModifyAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAppResponseBody body);

        @Override
        ModifyAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAppResponse response) {
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
        public Builder body(ModifyAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAppResponse build() {
            return new ModifyAppResponse(this);
        } 

    } 

}
