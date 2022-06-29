// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibraryStatusResponse} extends {@link TeaModel}
 *
 * <p>ListLibraryStatusResponse</p>
 */
public class ListLibraryStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLibraryStatusResponseBody body;

    private ListLibraryStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLibraryStatusResponse create() {
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
    public ListLibraryStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLibraryStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLibraryStatusResponseBody body);

        @Override
        ListLibraryStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLibraryStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLibraryStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLibraryStatusResponse response) {
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
        public Builder body(ListLibraryStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLibraryStatusResponse build() {
            return new ListLibraryStatusResponse(this);
        } 

    } 

}
