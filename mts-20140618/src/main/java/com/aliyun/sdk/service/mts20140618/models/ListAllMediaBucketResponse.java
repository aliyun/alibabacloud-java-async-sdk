// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllMediaBucketResponse} extends {@link TeaModel}
 *
 * <p>ListAllMediaBucketResponse</p>
 */
public class ListAllMediaBucketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAllMediaBucketResponseBody body;

    private ListAllMediaBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAllMediaBucketResponse create() {
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
    public ListAllMediaBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllMediaBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAllMediaBucketResponseBody body);

        @Override
        ListAllMediaBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllMediaBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAllMediaBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllMediaBucketResponse response) {
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
        public Builder body(ListAllMediaBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllMediaBucketResponse build() {
            return new ListAllMediaBucketResponse(this);
        } 

    } 

}
