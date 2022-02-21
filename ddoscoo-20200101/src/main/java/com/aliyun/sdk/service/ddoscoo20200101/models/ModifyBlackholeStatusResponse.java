// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBlackholeStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyBlackholeStatusResponse</p>
 */
public class ModifyBlackholeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBlackholeStatusResponseBody body;

    private ModifyBlackholeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBlackholeStatusResponse create() {
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
    public ModifyBlackholeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBlackholeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBlackholeStatusResponseBody body);

        @Override
        ModifyBlackholeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBlackholeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBlackholeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBlackholeStatusResponse response) {
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
        public Builder body(ModifyBlackholeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBlackholeStatusResponse build() {
            return new ModifyBlackholeStatusResponse(this);
        } 

    } 

}
