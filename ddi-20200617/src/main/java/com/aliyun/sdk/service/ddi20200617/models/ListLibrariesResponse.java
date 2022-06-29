// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibrariesResponse} extends {@link TeaModel}
 *
 * <p>ListLibrariesResponse</p>
 */
public class ListLibrariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLibrariesResponseBody body;

    private ListLibrariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLibrariesResponse create() {
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
    public ListLibrariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLibrariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLibrariesResponseBody body);

        @Override
        ListLibrariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLibrariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLibrariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLibrariesResponse response) {
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
        public Builder body(ListLibrariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLibrariesResponse build() {
            return new ListLibrariesResponse(this);
        } 

    } 

}
