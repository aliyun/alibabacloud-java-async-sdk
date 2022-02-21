// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAnycastEipAddressSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyAnycastEipAddressSpecResponse</p>
 */
public class ModifyAnycastEipAddressSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAnycastEipAddressSpecResponseBody body;

    private ModifyAnycastEipAddressSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAnycastEipAddressSpecResponse create() {
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
    public ModifyAnycastEipAddressSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAnycastEipAddressSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAnycastEipAddressSpecResponseBody body);

        @Override
        ModifyAnycastEipAddressSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAnycastEipAddressSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAnycastEipAddressSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAnycastEipAddressSpecResponse response) {
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
        public Builder body(ModifyAnycastEipAddressSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAnycastEipAddressSpecResponse build() {
            return new ModifyAnycastEipAddressSpecResponse(this);
        } 

    } 

}
