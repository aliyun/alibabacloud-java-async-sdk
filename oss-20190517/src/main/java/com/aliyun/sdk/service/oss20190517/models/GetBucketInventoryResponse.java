// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketInventoryResponse} extends {@link TeaModel}
 *
 * <p>GetBucketInventoryResponse</p>
 */
public class GetBucketInventoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBucketInventoryResponseBody body;

    private GetBucketInventoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBucketInventoryResponse create() {
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
    public GetBucketInventoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBucketInventoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBucketInventoryResponseBody body);

        @Override
        GetBucketInventoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBucketInventoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBucketInventoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBucketInventoryResponse response) {
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
        public Builder body(GetBucketInventoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBucketInventoryResponse build() {
            return new GetBucketInventoryResponse(this);
        } 

    } 

}
