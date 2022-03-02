// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketTransferAccelerationResponse} extends {@link TeaModel}
 *
 * <p>GetBucketTransferAccelerationResponse</p>
 */
public class GetBucketTransferAccelerationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketTransferAccelerationResponseBody body;

    private GetBucketTransferAccelerationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketTransferAccelerationResponse create() {
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
    public GetBucketTransferAccelerationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketTransferAccelerationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketTransferAccelerationResponseBody body);

        @Override
        GetBucketTransferAccelerationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketTransferAccelerationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketTransferAccelerationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketTransferAccelerationResponse response) {
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
        public Builder body(GetBucketTransferAccelerationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketTransferAccelerationResponse build() {
            return new GetBucketTransferAccelerationResponse(this);
        } 

    } 

}
