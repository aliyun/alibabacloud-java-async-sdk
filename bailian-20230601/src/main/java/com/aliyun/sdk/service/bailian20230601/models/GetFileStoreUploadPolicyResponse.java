// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileStoreUploadPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetFileStoreUploadPolicyResponse</p>
 */
public class GetFileStoreUploadPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileStoreUploadPolicyResponseBody body;

    private GetFileStoreUploadPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileStoreUploadPolicyResponse create() {
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
    public GetFileStoreUploadPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileStoreUploadPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileStoreUploadPolicyResponseBody body);

        @Override
        GetFileStoreUploadPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileStoreUploadPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileStoreUploadPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileStoreUploadPolicyResponse response) {
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
        public Builder body(GetFileStoreUploadPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileStoreUploadPolicyResponse build() {
            return new GetFileStoreUploadPolicyResponse(this);
        } 

    } 

}
