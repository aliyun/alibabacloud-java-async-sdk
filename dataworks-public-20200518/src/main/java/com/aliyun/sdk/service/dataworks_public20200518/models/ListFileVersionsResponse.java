// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListFileVersionsResponse</p>
 */
public class ListFileVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFileVersionsResponseBody body;

    private ListFileVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFileVersionsResponse create() {
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
    public ListFileVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFileVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFileVersionsResponseBody body);

        @Override
        ListFileVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFileVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFileVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFileVersionsResponse response) {
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
        public Builder body(ListFileVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFileVersionsResponse build() {
            return new ListFileVersionsResponse(this);
        } 

    } 

}
