// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileTokenForUploadToMsaResponse} extends {@link TeaModel}
 *
 * <p>GetFileTokenForUploadToMsaResponse</p>
 */
public class GetFileTokenForUploadToMsaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileTokenForUploadToMsaResponseBody body;

    private GetFileTokenForUploadToMsaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileTokenForUploadToMsaResponse create() {
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
    public GetFileTokenForUploadToMsaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileTokenForUploadToMsaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileTokenForUploadToMsaResponseBody body);

        @Override
        GetFileTokenForUploadToMsaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileTokenForUploadToMsaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileTokenForUploadToMsaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileTokenForUploadToMsaResponse response) {
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
        public Builder body(GetFileTokenForUploadToMsaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileTokenForUploadToMsaResponse build() {
            return new GetFileTokenForUploadToMsaResponse(this);
        } 

    } 

}
