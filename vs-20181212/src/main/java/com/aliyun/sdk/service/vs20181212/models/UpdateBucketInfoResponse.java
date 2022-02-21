// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBucketInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateBucketInfoResponse</p>
 */
public class UpdateBucketInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBucketInfoResponseBody body;

    private UpdateBucketInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBucketInfoResponse create() {
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
    public UpdateBucketInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBucketInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBucketInfoResponseBody body);

        @Override
        UpdateBucketInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBucketInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBucketInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBucketInfoResponse response) {
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
        public Builder body(UpdateBucketInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBucketInfoResponse build() {
            return new UpdateBucketInfoResponse(this);
        } 

    } 

}
