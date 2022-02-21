// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeVehicleRegistrationResponse} extends {@link TeaModel}
 *
 * <p>RecognizeVehicleRegistrationResponse</p>
 */
public class RecognizeVehicleRegistrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeVehicleRegistrationResponseBody body;

    private RecognizeVehicleRegistrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeVehicleRegistrationResponse create() {
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
    public RecognizeVehicleRegistrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeVehicleRegistrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeVehicleRegistrationResponseBody body);

        @Override
        RecognizeVehicleRegistrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeVehicleRegistrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeVehicleRegistrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeVehicleRegistrationResponse response) {
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
        public Builder body(RecognizeVehicleRegistrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeVehicleRegistrationResponse build() {
            return new RecognizeVehicleRegistrationResponse(this);
        } 

    } 

}
