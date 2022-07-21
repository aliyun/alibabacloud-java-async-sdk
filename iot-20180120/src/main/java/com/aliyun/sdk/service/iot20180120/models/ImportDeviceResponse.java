// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDeviceResponse} extends {@link TeaModel}
 *
 * <p>ImportDeviceResponse</p>
 */
public class ImportDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportDeviceResponseBody body;

    private ImportDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportDeviceResponse create() {
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
    public ImportDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportDeviceResponseBody body);

        @Override
        ImportDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportDeviceResponse response) {
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
        public Builder body(ImportDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportDeviceResponse build() {
            return new ImportDeviceResponse(this);
        } 

    } 

}
