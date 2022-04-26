// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeHotelConsumeResponse} extends {@link TeaModel}
 *
 * <p>RecognizeHotelConsumeResponse</p>
 */
public class RecognizeHotelConsumeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeHotelConsumeResponseBody body;

    private RecognizeHotelConsumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeHotelConsumeResponse create() {
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
    public RecognizeHotelConsumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeHotelConsumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeHotelConsumeResponseBody body);

        @Override
        RecognizeHotelConsumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeHotelConsumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeHotelConsumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeHotelConsumeResponse response) {
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
        public Builder body(RecognizeHotelConsumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeHotelConsumeResponse build() {
            return new RecognizeHotelConsumeResponse(this);
        } 

    } 

}
