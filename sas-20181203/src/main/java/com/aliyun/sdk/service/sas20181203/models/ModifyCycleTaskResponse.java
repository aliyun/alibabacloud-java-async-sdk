// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCycleTaskResponse} extends {@link TeaModel}
 *
 * <p>ModifyCycleTaskResponse</p>
 */
public class ModifyCycleTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCycleTaskResponseBody body;

    private ModifyCycleTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCycleTaskResponse create() {
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
    public ModifyCycleTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCycleTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCycleTaskResponseBody body);

        @Override
        ModifyCycleTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCycleTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCycleTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCycleTaskResponse response) {
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
        public Builder body(ModifyCycleTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCycleTaskResponse build() {
            return new ModifyCycleTaskResponse(this);
        } 

    } 

}
