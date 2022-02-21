// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeFoodProduceLicenseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeFoodProduceLicenseResponse</p>
 */
public class RecognizeFoodProduceLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeFoodProduceLicenseResponseBody body;

    private RecognizeFoodProduceLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeFoodProduceLicenseResponse create() {
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
    public RecognizeFoodProduceLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeFoodProduceLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeFoodProduceLicenseResponseBody body);

        @Override
        RecognizeFoodProduceLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeFoodProduceLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeFoodProduceLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeFoodProduceLicenseResponse response) {
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
        public Builder body(RecognizeFoodProduceLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeFoodProduceLicenseResponse build() {
            return new RecognizeFoodProduceLicenseResponse(this);
        } 

    } 

}
