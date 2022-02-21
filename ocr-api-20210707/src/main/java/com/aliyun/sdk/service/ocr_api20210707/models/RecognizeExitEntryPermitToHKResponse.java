// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExitEntryPermitToHKResponse} extends {@link TeaModel}
 *
 * <p>RecognizeExitEntryPermitToHKResponse</p>
 */
public class RecognizeExitEntryPermitToHKResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeExitEntryPermitToHKResponseBody body;

    private RecognizeExitEntryPermitToHKResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeExitEntryPermitToHKResponse create() {
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
    public RecognizeExitEntryPermitToHKResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeExitEntryPermitToHKResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeExitEntryPermitToHKResponseBody body);

        @Override
        RecognizeExitEntryPermitToHKResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeExitEntryPermitToHKResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeExitEntryPermitToHKResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeExitEntryPermitToHKResponse response) {
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
        public Builder body(RecognizeExitEntryPermitToHKResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeExitEntryPermitToHKResponse build() {
            return new RecognizeExitEntryPermitToHKResponse(this);
        } 

    } 

}
