// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStudioLayoutResponse} extends {@link TeaModel}
 *
 * <p>ModifyStudioLayoutResponse</p>
 */
public class ModifyStudioLayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyStudioLayoutResponseBody body;

    private ModifyStudioLayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyStudioLayoutResponse create() {
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
    public ModifyStudioLayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyStudioLayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyStudioLayoutResponseBody body);

        @Override
        ModifyStudioLayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyStudioLayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyStudioLayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyStudioLayoutResponse response) {
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
        public Builder body(ModifyStudioLayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyStudioLayoutResponse build() {
            return new ModifyStudioLayoutResponse(this);
        } 

    } 

}
