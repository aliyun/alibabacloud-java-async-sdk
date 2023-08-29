// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadUserAppToMsaResponse} extends {@link TeaModel}
 *
 * <p>UploadUserAppToMsaResponse</p>
 */
public class UploadUserAppToMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadUserAppToMsaResponseBody body;

    private UploadUserAppToMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadUserAppToMsaResponse create() {
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
    public UploadUserAppToMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadUserAppToMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadUserAppToMsaResponseBody body);

        @Override
        UploadUserAppToMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadUserAppToMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadUserAppToMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadUserAppToMsaResponse response) {
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
        public Builder body(UploadUserAppToMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadUserAppToMsaResponse build() {
            return new UploadUserAppToMsaResponse(this);
        } 

    } 

}
