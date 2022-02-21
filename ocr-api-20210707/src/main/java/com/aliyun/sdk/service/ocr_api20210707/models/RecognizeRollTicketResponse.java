// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeRollTicketResponse} extends {@link TeaModel}
 *
 * <p>RecognizeRollTicketResponse</p>
 */
public class RecognizeRollTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeRollTicketResponseBody body;

    private RecognizeRollTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeRollTicketResponse create() {
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
    public RecognizeRollTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeRollTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeRollTicketResponseBody body);

        @Override
        RecognizeRollTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeRollTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeRollTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeRollTicketResponse response) {
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
        public Builder body(RecognizeRollTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeRollTicketResponse build() {
            return new RecognizeRollTicketResponse(this);
        } 

    } 

}
