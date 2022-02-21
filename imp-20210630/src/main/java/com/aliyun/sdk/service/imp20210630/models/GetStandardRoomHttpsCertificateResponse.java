// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStandardRoomHttpsCertificateResponse} extends {@link TeaModel}
 *
 * <p>GetStandardRoomHttpsCertificateResponse</p>
 */
public class GetStandardRoomHttpsCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStandardRoomHttpsCertificateResponseBody body;

    private GetStandardRoomHttpsCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStandardRoomHttpsCertificateResponse create() {
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
    public GetStandardRoomHttpsCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStandardRoomHttpsCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStandardRoomHttpsCertificateResponseBody body);

        @Override
        GetStandardRoomHttpsCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStandardRoomHttpsCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStandardRoomHttpsCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStandardRoomHttpsCertificateResponse response) {
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
        public Builder body(GetStandardRoomHttpsCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStandardRoomHttpsCertificateResponse build() {
            return new GetStandardRoomHttpsCertificateResponse(this);
        } 

    } 

}
