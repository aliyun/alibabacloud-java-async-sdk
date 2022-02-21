// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectTicketResponse} extends {@link TeaModel}
 *
 * <p>GetConnectTicketResponse</p>
 */
public class GetConnectTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConnectTicketResponseBody body;

    private GetConnectTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConnectTicketResponse create() {
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
    public GetConnectTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConnectTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConnectTicketResponseBody body);

        @Override
        GetConnectTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConnectTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConnectTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConnectTicketResponse response) {
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
        public Builder body(GetConnectTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConnectTicketResponse build() {
            return new GetConnectTicketResponse(this);
        } 

    } 

}
