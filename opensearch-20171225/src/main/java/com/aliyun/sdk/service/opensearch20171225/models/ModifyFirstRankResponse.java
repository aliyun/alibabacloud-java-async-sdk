// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFirstRankResponse} extends {@link TeaModel}
 *
 * <p>ModifyFirstRankResponse</p>
 */
public class ModifyFirstRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFirstRankResponseBody body;

    private ModifyFirstRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFirstRankResponse create() {
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
    public ModifyFirstRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFirstRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFirstRankResponseBody body);

        @Override
        ModifyFirstRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFirstRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFirstRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFirstRankResponse response) {
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
        public Builder body(ModifyFirstRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFirstRankResponse build() {
            return new ModifyFirstRankResponse(this);
        } 

    } 

}
