// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeVehicleLicenseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeVehicleLicenseResponse</p>
 */
public class RecognizeVehicleLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeVehicleLicenseResponseBody body;

    private RecognizeVehicleLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeVehicleLicenseResponse create() {
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
    public RecognizeVehicleLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeVehicleLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeVehicleLicenseResponseBody body);

        @Override
        RecognizeVehicleLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeVehicleLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeVehicleLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeVehicleLicenseResponse response) {
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
        public Builder body(RecognizeVehicleLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeVehicleLicenseResponse build() {
            return new RecognizeVehicleLicenseResponse(this);
        } 

    } 

}
