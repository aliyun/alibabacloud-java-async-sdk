// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMedicalDeviceManageLicenseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeMedicalDeviceManageLicenseResponse</p>
 */
public class RecognizeMedicalDeviceManageLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeMedicalDeviceManageLicenseResponseBody body;

    private RecognizeMedicalDeviceManageLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeMedicalDeviceManageLicenseResponse create() {
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
    public RecognizeMedicalDeviceManageLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeMedicalDeviceManageLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeMedicalDeviceManageLicenseResponseBody body);

        @Override
        RecognizeMedicalDeviceManageLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeMedicalDeviceManageLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeMedicalDeviceManageLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeMedicalDeviceManageLicenseResponse response) {
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
        public Builder body(RecognizeMedicalDeviceManageLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMedicalDeviceManageLicenseResponse build() {
            return new RecognizeMedicalDeviceManageLicenseResponse(this);
        } 

    } 

}
