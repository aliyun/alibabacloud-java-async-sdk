// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTicketResponse} extends {@link TeaModel}
 *
 * <p>UpdateTicketResponse</p>
 */
public class UpdateTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTicketResponseBody body;

    private UpdateTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTicketResponse create() {
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
    public UpdateTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTicketResponseBody body);

        @Override
        UpdateTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTicketResponse response) {
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
        public Builder body(UpdateTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTicketResponse build() {
            return new UpdateTicketResponse(this);
        } 

    } 

}
