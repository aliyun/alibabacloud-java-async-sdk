// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCatalogSettingsResponse} extends {@link TeaModel}
 *
 * <p>UpdateCatalogSettingsResponse</p>
 */
public class UpdateCatalogSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCatalogSettingsResponseBody body;

    private UpdateCatalogSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCatalogSettingsResponse create() {
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
    public UpdateCatalogSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCatalogSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCatalogSettingsResponseBody body);

        @Override
        UpdateCatalogSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCatalogSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCatalogSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCatalogSettingsResponse response) {
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
        public Builder body(UpdateCatalogSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCatalogSettingsResponse build() {
            return new UpdateCatalogSettingsResponse(this);
        } 

    } 

}
