// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketEncryptionResponse} extends {@link TeaModel}
 *
 * <p>GetBucketEncryptionResponse</p>
 */
public class GetBucketEncryptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketEncryptionResponseBody body;

    private GetBucketEncryptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketEncryptionResponse create() {
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
    public GetBucketEncryptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketEncryptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketEncryptionResponseBody body);

        @Override
        GetBucketEncryptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketEncryptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketEncryptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketEncryptionResponse response) {
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
        public Builder body(GetBucketEncryptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketEncryptionResponse build() {
            return new GetBucketEncryptionResponse(this);
        } 

    } 

}
