// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackendModelResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackendModelResponse</p>
 */
public class ModifyBackendModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackendModelResponseBody body;

    private ModifyBackendModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackendModelResponse create() {
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
    public ModifyBackendModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackendModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackendModelResponseBody body);

        @Override
        ModifyBackendModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackendModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackendModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackendModelResponse response) {
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
        public Builder body(ModifyBackendModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackendModelResponse build() {
            return new ModifyBackendModelResponse(this);
        } 

    } 

}
