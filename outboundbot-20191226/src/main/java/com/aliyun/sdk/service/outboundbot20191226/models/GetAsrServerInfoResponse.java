// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsrServerInfoResponse} extends {@link TeaModel}
 *
 * <p>GetAsrServerInfoResponse</p>
 */
public class GetAsrServerInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsrServerInfoResponseBody body;

    private GetAsrServerInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsrServerInfoResponse create() {
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
    public GetAsrServerInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsrServerInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsrServerInfoResponseBody body);

        @Override
        GetAsrServerInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsrServerInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsrServerInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsrServerInfoResponse response) {
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
        public Builder body(GetAsrServerInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsrServerInfoResponse build() {
            return new GetAsrServerInfoResponse(this);
        } 

    } 

}
