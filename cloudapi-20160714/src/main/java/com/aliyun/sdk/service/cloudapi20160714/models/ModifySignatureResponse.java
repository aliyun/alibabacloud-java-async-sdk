// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySignatureResponse} extends {@link TeaModel}
 *
 * <p>ModifySignatureResponse</p>
 */
public class ModifySignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySignatureResponseBody body;

    private ModifySignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySignatureResponse create() {
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
    public ModifySignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySignatureResponseBody body);

        @Override
        ModifySignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySignatureResponse response) {
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
        public Builder body(ModifySignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySignatureResponse build() {
            return new ModifySignatureResponse(this);
        } 

    } 

}
