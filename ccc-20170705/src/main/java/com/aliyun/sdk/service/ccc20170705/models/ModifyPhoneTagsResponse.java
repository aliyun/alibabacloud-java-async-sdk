// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPhoneTagsResponse} extends {@link TeaModel}
 *
 * <p>ModifyPhoneTagsResponse</p>
 */
public class ModifyPhoneTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPhoneTagsResponseBody body;

    private ModifyPhoneTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPhoneTagsResponse create() {
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
    public ModifyPhoneTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPhoneTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPhoneTagsResponseBody body);

        @Override
        ModifyPhoneTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPhoneTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPhoneTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPhoneTagsResponse response) {
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
        public Builder body(ModifyPhoneTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPhoneTagsResponse build() {
            return new ModifyPhoneTagsResponse(this);
        } 

    } 

}
