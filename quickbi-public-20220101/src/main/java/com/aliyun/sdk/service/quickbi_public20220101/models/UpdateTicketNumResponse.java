// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTicketNumResponse} extends {@link TeaModel}
 *
 * <p>UpdateTicketNumResponse</p>
 */
public class UpdateTicketNumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTicketNumResponseBody body;

    private UpdateTicketNumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTicketNumResponse create() {
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
    public UpdateTicketNumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTicketNumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTicketNumResponseBody body);

        @Override
        UpdateTicketNumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTicketNumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTicketNumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTicketNumResponse response) {
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
        public Builder body(UpdateTicketNumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTicketNumResponse build() {
            return new UpdateTicketNumResponse(this);
        } 

    } 

}
