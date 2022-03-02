// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListObjectVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListObjectVersionsResponse</p>
 */
public class ListObjectVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListObjectVersionsResponseBody body;

    private ListObjectVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListObjectVersionsResponse create() {
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
    public ListObjectVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListObjectVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListObjectVersionsResponseBody body);

        @Override
        ListObjectVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListObjectVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListObjectVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListObjectVersionsResponse response) {
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
        public Builder body(ListObjectVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListObjectVersionsResponse build() {
            return new ListObjectVersionsResponse(this);
        } 

    } 

}
