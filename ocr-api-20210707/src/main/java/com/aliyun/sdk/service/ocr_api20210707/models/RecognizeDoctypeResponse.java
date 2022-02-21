// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDoctypeResponse} extends {@link TeaModel}
 *
 * <p>RecognizeDoctypeResponse</p>
 */
public class RecognizeDoctypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeDoctypeResponseBody body;

    private RecognizeDoctypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeDoctypeResponse create() {
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
    public RecognizeDoctypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeDoctypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeDoctypeResponseBody body);

        @Override
        RecognizeDoctypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeDoctypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeDoctypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeDoctypeResponse response) {
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
        public Builder body(RecognizeDoctypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeDoctypeResponse build() {
            return new RecognizeDoctypeResponse(this);
        } 

    } 

}
