// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingUploadCredentialResponse} extends {@link TeaModel}
 *
 * <p>GetWebHostingUploadCredentialResponse</p>
 */
public class GetWebHostingUploadCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWebHostingUploadCredentialResponseBody body;

    private GetWebHostingUploadCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWebHostingUploadCredentialResponse create() {
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
    public GetWebHostingUploadCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebHostingUploadCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWebHostingUploadCredentialResponseBody body);

        @Override
        GetWebHostingUploadCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebHostingUploadCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWebHostingUploadCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebHostingUploadCredentialResponse response) {
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
        public Builder body(GetWebHostingUploadCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebHostingUploadCredentialResponse build() {
            return new GetWebHostingUploadCredentialResponse(this);
        } 

    } 

}
