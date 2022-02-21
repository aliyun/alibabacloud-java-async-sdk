// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountRelationResponse} extends {@link TeaModel}
 *
 * <p>ModifyAccountRelationResponse</p>
 */
public class ModifyAccountRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAccountRelationResponseBody body;

    private ModifyAccountRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAccountRelationResponse create() {
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
    public ModifyAccountRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAccountRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAccountRelationResponseBody body);

        @Override
        ModifyAccountRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAccountRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAccountRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAccountRelationResponse response) {
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
        public Builder body(ModifyAccountRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAccountRelationResponse build() {
            return new ModifyAccountRelationResponse(this);
        } 

    } 

}
