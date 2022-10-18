// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTicketResponse} extends {@link TeaModel}
 *
 * <p>GetTicketResponse</p>
 */
public class GetTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTicketResponseBody body;

    private GetTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTicketResponse create() {
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
    public GetTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTicketResponseBody body);

        @Override
        GetTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTicketResponse response) {
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
        public Builder body(GetTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTicketResponse build() {
            return new GetTicketResponse(this);
        } 

    } 

}
