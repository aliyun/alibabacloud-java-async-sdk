// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTicketResponse} extends {@link TeaModel}
 *
 * <p>CreateTicketResponse</p>
 */
public class CreateTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTicketResponseBody body;

    private CreateTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTicketResponse create() {
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
    public CreateTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTicketResponseBody body);

        @Override
        CreateTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTicketResponse response) {
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
        public Builder body(CreateTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTicketResponse build() {
            return new CreateTicketResponse(this);
        } 

    } 

}
