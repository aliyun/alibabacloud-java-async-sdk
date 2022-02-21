// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachStandardRoomHttpsCertificateResponse} extends {@link TeaModel}
 *
 * <p>AttachStandardRoomHttpsCertificateResponse</p>
 */
public class AttachStandardRoomHttpsCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachStandardRoomHttpsCertificateResponseBody body;

    private AttachStandardRoomHttpsCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachStandardRoomHttpsCertificateResponse create() {
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
    public AttachStandardRoomHttpsCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachStandardRoomHttpsCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachStandardRoomHttpsCertificateResponseBody body);

        @Override
        AttachStandardRoomHttpsCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachStandardRoomHttpsCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachStandardRoomHttpsCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachStandardRoomHttpsCertificateResponse response) {
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
        public Builder body(AttachStandardRoomHttpsCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachStandardRoomHttpsCertificateResponse build() {
            return new AttachStandardRoomHttpsCertificateResponse(this);
        } 

    } 

}
