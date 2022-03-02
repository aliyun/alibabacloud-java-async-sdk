// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListObjectsResponse} extends {@link TeaModel}
 *
 * <p>ListObjectsResponse</p>
 */
public class ListObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListObjectsResponseBody body;

    private ListObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListObjectsResponse create() {
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
    public ListObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListObjectsResponseBody body);

        @Override
        ListObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListObjectsResponse response) {
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
        public Builder body(ListObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListObjectsResponse build() {
            return new ListObjectsResponse(this);
        } 

    } 

}
