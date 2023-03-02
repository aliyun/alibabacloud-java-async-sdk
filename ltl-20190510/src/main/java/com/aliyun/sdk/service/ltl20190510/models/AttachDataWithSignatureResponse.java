// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDataWithSignatureResponse} extends {@link TeaModel}
 *
 * <p>AttachDataWithSignatureResponse</p>
 */
public class AttachDataWithSignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDataWithSignatureResponseBody body;

    private AttachDataWithSignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDataWithSignatureResponse create() {
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
    public AttachDataWithSignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDataWithSignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDataWithSignatureResponseBody body);

        @Override
        AttachDataWithSignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDataWithSignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDataWithSignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDataWithSignatureResponse response) {
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
        public Builder body(AttachDataWithSignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDataWithSignatureResponse build() {
            return new AttachDataWithSignatureResponse(this);
        } 

    } 

}
