// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyModelResponse} extends {@link TeaModel}
 *
 * <p>ModifyModelResponse</p>
 */
public class ModifyModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyModelResponseBody body;

    private ModifyModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyModelResponse create() {
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
    public ModifyModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyModelResponseBody body);

        @Override
        ModifyModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyModelResponse response) {
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
        public Builder body(ModifyModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyModelResponse build() {
            return new ModifyModelResponse(this);
        } 

    } 

}
