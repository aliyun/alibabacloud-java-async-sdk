// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssStorageAndAccByBucketsResponse} extends {@link TeaModel}
 *
 * <p>GetOssStorageAndAccByBucketsResponse</p>
 */
public class GetOssStorageAndAccByBucketsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOssStorageAndAccByBucketsResponseBody body;

    private GetOssStorageAndAccByBucketsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOssStorageAndAccByBucketsResponse create() {
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
    public GetOssStorageAndAccByBucketsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOssStorageAndAccByBucketsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOssStorageAndAccByBucketsResponseBody body);

        @Override
        GetOssStorageAndAccByBucketsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOssStorageAndAccByBucketsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOssStorageAndAccByBucketsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOssStorageAndAccByBucketsResponse response) {
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
        public Builder body(GetOssStorageAndAccByBucketsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOssStorageAndAccByBucketsResponse build() {
            return new GetOssStorageAndAccByBucketsResponse(this);
        } 

    } 

}
