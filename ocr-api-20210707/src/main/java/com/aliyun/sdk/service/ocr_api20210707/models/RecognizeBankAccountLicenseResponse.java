// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeBankAccountLicenseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeBankAccountLicenseResponse</p>
 */
public class RecognizeBankAccountLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeBankAccountLicenseResponseBody body;

    private RecognizeBankAccountLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeBankAccountLicenseResponse create() {
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
    public RecognizeBankAccountLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeBankAccountLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeBankAccountLicenseResponseBody body);

        @Override
        RecognizeBankAccountLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeBankAccountLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeBankAccountLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeBankAccountLicenseResponse response) {
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
        public Builder body(RecognizeBankAccountLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeBankAccountLicenseResponse build() {
            return new RecognizeBankAccountLicenseResponse(this);
        } 

    } 

}
