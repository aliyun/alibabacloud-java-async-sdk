// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIPv6TranslatorEntryResponse} extends {@link TeaModel}
 *
 * <p>ModifyIPv6TranslatorEntryResponse</p>
 */
public class ModifyIPv6TranslatorEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIPv6TranslatorEntryResponseBody body;

    private ModifyIPv6TranslatorEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIPv6TranslatorEntryResponse create() {
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
    public ModifyIPv6TranslatorEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIPv6TranslatorEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIPv6TranslatorEntryResponseBody body);

        @Override
        ModifyIPv6TranslatorEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIPv6TranslatorEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIPv6TranslatorEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIPv6TranslatorEntryResponse response) {
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
        public Builder body(ModifyIPv6TranslatorEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIPv6TranslatorEntryResponse build() {
            return new ModifyIPv6TranslatorEntryResponse(this);
        } 

    } 

}
