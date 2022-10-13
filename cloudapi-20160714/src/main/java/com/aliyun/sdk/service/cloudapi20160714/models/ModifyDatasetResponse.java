// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatasetResponse} extends {@link TeaModel}
 *
 * <p>ModifyDatasetResponse</p>
 */
public class ModifyDatasetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDatasetResponseBody body;

    private ModifyDatasetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDatasetResponse create() {
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
    public ModifyDatasetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDatasetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDatasetResponseBody body);

        @Override
        ModifyDatasetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDatasetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDatasetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDatasetResponse response) {
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
        public Builder body(ModifyDatasetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDatasetResponse build() {
            return new ModifyDatasetResponse(this);
        } 

    } 

}
