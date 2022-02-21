// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParentPlatformResponse} extends {@link TeaModel}
 *
 * <p>ModifyParentPlatformResponse</p>
 */
public class ModifyParentPlatformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyParentPlatformResponseBody body;

    private ModifyParentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyParentPlatformResponse create() {
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
    public ModifyParentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyParentPlatformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyParentPlatformResponseBody body);

        @Override
        ModifyParentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyParentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyParentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyParentPlatformResponse response) {
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
        public Builder body(ModifyParentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyParentPlatformResponse build() {
            return new ModifyParentPlatformResponse(this);
        } 

    } 

}
