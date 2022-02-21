// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountAuthorityResponse} extends {@link TeaModel}
 *
 * <p>ModifyAccountAuthorityResponse</p>
 */
public class ModifyAccountAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAccountAuthorityResponseBody body;

    private ModifyAccountAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAccountAuthorityResponse create() {
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
    public ModifyAccountAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAccountAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAccountAuthorityResponseBody body);

        @Override
        ModifyAccountAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAccountAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAccountAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAccountAuthorityResponse response) {
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
        public Builder body(ModifyAccountAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAccountAuthorityResponse build() {
            return new ModifyAccountAuthorityResponse(this);
        } 

    } 

}
