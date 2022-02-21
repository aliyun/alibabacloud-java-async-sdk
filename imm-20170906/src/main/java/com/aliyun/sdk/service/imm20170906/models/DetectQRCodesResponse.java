// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectQRCodesResponse} extends {@link TeaModel}
 *
 * <p>DetectQRCodesResponse</p>
 */
public class DetectQRCodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectQRCodesResponseBody body;

    private DetectQRCodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectQRCodesResponse create() {
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
    public DetectQRCodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectQRCodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectQRCodesResponseBody body);

        @Override
        DetectQRCodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectQRCodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectQRCodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectQRCodesResponse response) {
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
        public Builder body(DetectQRCodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectQRCodesResponse build() {
            return new DetectQRCodesResponse(this);
        } 

    } 

}
