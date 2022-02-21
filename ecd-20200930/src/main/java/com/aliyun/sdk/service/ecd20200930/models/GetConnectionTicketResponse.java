// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionTicketResponse} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponse</p>
 */
public class GetConnectionTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConnectionTicketResponseBody body;

    private GetConnectionTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConnectionTicketResponse create() {
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
    public GetConnectionTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConnectionTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConnectionTicketResponseBody body);

        @Override
        GetConnectionTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConnectionTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConnectionTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConnectionTicketResponse response) {
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
        public Builder body(GetConnectionTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConnectionTicketResponse build() {
            return new GetConnectionTicketResponse(this);
        } 

    } 

}
