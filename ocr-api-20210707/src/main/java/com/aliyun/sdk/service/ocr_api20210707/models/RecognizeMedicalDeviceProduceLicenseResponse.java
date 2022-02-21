// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMedicalDeviceProduceLicenseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeMedicalDeviceProduceLicenseResponse</p>
 */
public class RecognizeMedicalDeviceProduceLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeMedicalDeviceProduceLicenseResponseBody body;

    private RecognizeMedicalDeviceProduceLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeMedicalDeviceProduceLicenseResponse create() {
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
    public RecognizeMedicalDeviceProduceLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeMedicalDeviceProduceLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeMedicalDeviceProduceLicenseResponseBody body);

        @Override
        RecognizeMedicalDeviceProduceLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeMedicalDeviceProduceLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeMedicalDeviceProduceLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeMedicalDeviceProduceLicenseResponse response) {
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
        public Builder body(RecognizeMedicalDeviceProduceLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMedicalDeviceProduceLicenseResponse build() {
            return new RecognizeMedicalDeviceProduceLicenseResponse(this);
        } 

    } 

}
