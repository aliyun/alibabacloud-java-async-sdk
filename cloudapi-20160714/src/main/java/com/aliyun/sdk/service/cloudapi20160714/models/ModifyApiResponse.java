// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiResponse</p>
 */
public class ModifyApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiResponseBody body;

    private ModifyApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiResponse create() {
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
    public ModifyApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiResponseBody body);

        @Override
        ModifyApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiResponse response) {
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
        public Builder body(ModifyApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiResponse build() {
            return new ModifyApiResponse(this);
        } 

    } 

}
