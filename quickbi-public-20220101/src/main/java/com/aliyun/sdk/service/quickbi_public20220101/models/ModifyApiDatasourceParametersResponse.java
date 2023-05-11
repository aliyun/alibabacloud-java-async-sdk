// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiDatasourceParametersResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiDatasourceParametersResponse</p>
 */
public class ModifyApiDatasourceParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiDatasourceParametersResponseBody body;

    private ModifyApiDatasourceParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiDatasourceParametersResponse create() {
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
    public ModifyApiDatasourceParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiDatasourceParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiDatasourceParametersResponseBody body);

        @Override
        ModifyApiDatasourceParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiDatasourceParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiDatasourceParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiDatasourceParametersResponse response) {
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
        public Builder body(ModifyApiDatasourceParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiDatasourceParametersResponse build() {
            return new ModifyApiDatasourceParametersResponse(this);
        } 

    } 

}
