// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceQueueResponse} extends {@link TeaModel}
 *
 * <p>ModifyResourceQueueResponse</p>
 */
public class ModifyResourceQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyResourceQueueResponseBody body;

    private ModifyResourceQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyResourceQueueResponse create() {
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
    public ModifyResourceQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyResourceQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyResourceQueueResponseBody body);

        @Override
        ModifyResourceQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyResourceQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyResourceQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyResourceQueueResponse response) {
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
        public Builder body(ModifyResourceQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyResourceQueueResponse build() {
            return new ModifyResourceQueueResponse(this);
        } 

    } 

}
