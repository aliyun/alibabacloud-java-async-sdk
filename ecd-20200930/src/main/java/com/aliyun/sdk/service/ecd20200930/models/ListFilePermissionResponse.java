// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilePermissionResponse} extends {@link TeaModel}
 *
 * <p>ListFilePermissionResponse</p>
 */
public class ListFilePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFilePermissionResponseBody body;

    private ListFilePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFilePermissionResponse create() {
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
    public ListFilePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFilePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFilePermissionResponseBody body);

        @Override
        ListFilePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFilePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFilePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFilePermissionResponse response) {
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
        public Builder body(ListFilePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFilePermissionResponse build() {
            return new ListFilePermissionResponse(this);
        } 

    } 

}
