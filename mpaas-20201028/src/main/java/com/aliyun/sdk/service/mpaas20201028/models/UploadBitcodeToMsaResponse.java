// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadBitcodeToMsaResponse} extends {@link TeaModel}
 *
 * <p>UploadBitcodeToMsaResponse</p>
 */
public class UploadBitcodeToMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadBitcodeToMsaResponseBody body;

    private UploadBitcodeToMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadBitcodeToMsaResponse create() {
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
    public UploadBitcodeToMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadBitcodeToMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadBitcodeToMsaResponseBody body);

        @Override
        UploadBitcodeToMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadBitcodeToMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadBitcodeToMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadBitcodeToMsaResponse response) {
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
        public Builder body(UploadBitcodeToMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadBitcodeToMsaResponse build() {
            return new UploadBitcodeToMsaResponse(this);
        } 

    } 

}
