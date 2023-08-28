// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIndexPartitionResponse} extends {@link TeaModel}
 *
 * <p>ModifyIndexPartitionResponse</p>
 */
public class ModifyIndexPartitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIndexPartitionResponseBody body;

    private ModifyIndexPartitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIndexPartitionResponse create() {
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
    public ModifyIndexPartitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIndexPartitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIndexPartitionResponseBody body);

        @Override
        ModifyIndexPartitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIndexPartitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIndexPartitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIndexPartitionResponse response) {
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
        public Builder body(ModifyIndexPartitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIndexPartitionResponse build() {
            return new ModifyIndexPartitionResponse(this);
        } 

    } 

}
