// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogSettingsResponse} extends {@link TeaModel}
 *
 * <p>GetCatalogSettingsResponse</p>
 */
public class GetCatalogSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCatalogSettingsResponseBody body;

    private GetCatalogSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCatalogSettingsResponse create() {
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
    public GetCatalogSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCatalogSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCatalogSettingsResponseBody body);

        @Override
        GetCatalogSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCatalogSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCatalogSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCatalogSettingsResponse response) {
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
        public Builder body(GetCatalogSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCatalogSettingsResponse build() {
            return new GetCatalogSettingsResponse(this);
        } 

    } 

}
