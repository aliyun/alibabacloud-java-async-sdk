// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketInfoResponse} extends {@link TeaModel}
 *
 * <p>GetBucketInfoResponse</p>
 */
public class GetBucketInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketInfoResponseBody body;

    private GetBucketInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketInfoResponse create() {
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
    public GetBucketInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketInfoResponseBody body);

        @Override
        GetBucketInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketInfoResponse response) {
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
        public Builder body(GetBucketInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketInfoResponse build() {
            return new GetBucketInfoResponse(this);
        } 

    } 

}
