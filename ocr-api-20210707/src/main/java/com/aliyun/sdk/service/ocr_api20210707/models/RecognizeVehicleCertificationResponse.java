// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeVehicleCertificationResponse} extends {@link TeaModel}
 *
 * <p>RecognizeVehicleCertificationResponse</p>
 */
public class RecognizeVehicleCertificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeVehicleCertificationResponseBody body;

    private RecognizeVehicleCertificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeVehicleCertificationResponse create() {
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
    public RecognizeVehicleCertificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeVehicleCertificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeVehicleCertificationResponseBody body);

        @Override
        RecognizeVehicleCertificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeVehicleCertificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeVehicleCertificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeVehicleCertificationResponse response) {
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
        public Builder body(RecognizeVehicleCertificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeVehicleCertificationResponse build() {
            return new RecognizeVehicleCertificationResponse(this);
        } 

    } 

}
