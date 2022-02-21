// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportNacosConfigResponse} extends {@link TeaModel}
 *
 * <p>ImportNacosConfigResponse</p>
 */
public class ImportNacosConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportNacosConfigResponseBody body;

    private ImportNacosConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportNacosConfigResponse create() {
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
    public ImportNacosConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportNacosConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportNacosConfigResponseBody body);

        @Override
        ImportNacosConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportNacosConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportNacosConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportNacosConfigResponse response) {
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
        public Builder body(ImportNacosConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportNacosConfigResponse build() {
            return new ImportNacosConfigResponse(this);
        } 

    } 

}
