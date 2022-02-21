// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGWSConnectTicketResponse} extends {@link TeaModel}
 *
 * <p>GetGWSConnectTicketResponse</p>
 */
public class GetGWSConnectTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGWSConnectTicketResponseBody body;

    private GetGWSConnectTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGWSConnectTicketResponse create() {
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
    public GetGWSConnectTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGWSConnectTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGWSConnectTicketResponseBody body);

        @Override
        GetGWSConnectTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGWSConnectTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGWSConnectTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGWSConnectTicketResponse response) {
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
        public Builder body(GetGWSConnectTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGWSConnectTicketResponse build() {
            return new GetGWSConnectTicketResponse(this);
        } 

    } 

}
