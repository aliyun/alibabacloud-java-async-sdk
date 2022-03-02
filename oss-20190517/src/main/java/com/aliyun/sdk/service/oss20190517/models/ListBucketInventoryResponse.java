// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListBucketInventoryResponse} extends {@link TeaModel}
 *
 * <p>ListBucketInventoryResponse</p>
 */
public class ListBucketInventoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBucketInventoryResponseBody body;

    private ListBucketInventoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBucketInventoryResponse create() {
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
    public ListBucketInventoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBucketInventoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBucketInventoryResponseBody body);

        @Override
        ListBucketInventoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBucketInventoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBucketInventoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBucketInventoryResponse response) {
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
        public Builder body(ListBucketInventoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBucketInventoryResponse build() {
            return new ListBucketInventoryResponse(this);
        } 

    } 

}
