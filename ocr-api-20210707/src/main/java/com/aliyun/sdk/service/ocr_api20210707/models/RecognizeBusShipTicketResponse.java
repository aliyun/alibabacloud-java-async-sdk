// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeBusShipTicketResponse} extends {@link TeaModel}
 *
 * <p>RecognizeBusShipTicketResponse</p>
 */
public class RecognizeBusShipTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeBusShipTicketResponseBody body;

    private RecognizeBusShipTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeBusShipTicketResponse create() {
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
    public RecognizeBusShipTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeBusShipTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeBusShipTicketResponseBody body);

        @Override
        RecognizeBusShipTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeBusShipTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeBusShipTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeBusShipTicketResponse response) {
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
        public Builder body(RecognizeBusShipTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeBusShipTicketResponse build() {
            return new RecognizeBusShipTicketResponse(this);
        } 

    } 

}
