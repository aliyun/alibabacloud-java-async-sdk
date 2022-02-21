// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsInstanceDescriptionResponse} extends {@link TeaModel}
 *
 * <p>ModifyDrdsInstanceDescriptionResponse</p>
 */
public class ModifyDrdsInstanceDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDrdsInstanceDescriptionResponseBody body;

    private ModifyDrdsInstanceDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDrdsInstanceDescriptionResponse create() {
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
    public ModifyDrdsInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDrdsInstanceDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDrdsInstanceDescriptionResponseBody body);

        @Override
        ModifyDrdsInstanceDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDrdsInstanceDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDrdsInstanceDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDrdsInstanceDescriptionResponse response) {
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
        public Builder body(ModifyDrdsInstanceDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDrdsInstanceDescriptionResponse build() {
            return new ModifyDrdsInstanceDescriptionResponse(this);
        } 

    } 

}
