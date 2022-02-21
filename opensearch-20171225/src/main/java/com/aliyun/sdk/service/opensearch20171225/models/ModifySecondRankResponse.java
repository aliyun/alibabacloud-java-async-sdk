// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecondRankResponse} extends {@link TeaModel}
 *
 * <p>ModifySecondRankResponse</p>
 */
public class ModifySecondRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecondRankResponseBody body;

    private ModifySecondRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecondRankResponse create() {
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
    public ModifySecondRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecondRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecondRankResponseBody body);

        @Override
        ModifySecondRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecondRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecondRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecondRankResponse response) {
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
        public Builder body(ModifySecondRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecondRankResponse build() {
            return new ModifySecondRankResponse(this);
        } 

    } 

}
