// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMedicineChMedicalResponse} extends {@link TeaModel}
 *
 * <p>GetMedicineChMedicalResponse</p>
 */
public class GetMedicineChMedicalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMedicineChMedicalResponseBody body;

    private GetMedicineChMedicalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMedicineChMedicalResponse create() {
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
    public GetMedicineChMedicalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMedicineChMedicalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMedicineChMedicalResponseBody body);

        @Override
        GetMedicineChMedicalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMedicineChMedicalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMedicineChMedicalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMedicineChMedicalResponse response) {
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
        public Builder body(GetMedicineChMedicalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMedicineChMedicalResponse build() {
            return new GetMedicineChMedicalResponse(this);
        } 

    } 

}
