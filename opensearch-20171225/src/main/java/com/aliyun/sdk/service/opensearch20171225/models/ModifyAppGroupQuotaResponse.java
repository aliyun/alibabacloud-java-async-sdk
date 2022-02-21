// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppGroupQuotaResponse} extends {@link TeaModel}
 *
 * <p>ModifyAppGroupQuotaResponse</p>
 */
public class ModifyAppGroupQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAppGroupQuotaResponseBody body;

    private ModifyAppGroupQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAppGroupQuotaResponse create() {
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
    public ModifyAppGroupQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAppGroupQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAppGroupQuotaResponseBody body);

        @Override
        ModifyAppGroupQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAppGroupQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAppGroupQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAppGroupQuotaResponse response) {
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
        public Builder body(ModifyAppGroupQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAppGroupQuotaResponse build() {
            return new ModifyAppGroupQuotaResponse(this);
        } 

    } 

}
