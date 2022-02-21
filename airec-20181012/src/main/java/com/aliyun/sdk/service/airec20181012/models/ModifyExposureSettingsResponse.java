// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExposureSettingsResponse} extends {@link TeaModel}
 *
 * <p>ModifyExposureSettingsResponse</p>
 */
public class ModifyExposureSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyExposureSettingsResponseBody body;

    private ModifyExposureSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyExposureSettingsResponse create() {
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
    public ModifyExposureSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyExposureSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyExposureSettingsResponseBody body);

        @Override
        ModifyExposureSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyExposureSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyExposureSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyExposureSettingsResponse response) {
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
        public Builder body(ModifyExposureSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyExposureSettingsResponse build() {
            return new ModifyExposureSettingsResponse(this);
        } 

    } 

}
