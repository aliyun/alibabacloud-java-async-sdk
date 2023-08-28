// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceSpecsResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceSpecsResponse</p>
 */
public class ListInstanceSpecsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceSpecsResponseBody body;

    private ListInstanceSpecsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceSpecsResponse create() {
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
    public ListInstanceSpecsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceSpecsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceSpecsResponseBody body);

        @Override
        ListInstanceSpecsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceSpecsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceSpecsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceSpecsResponse response) {
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
        public Builder body(ListInstanceSpecsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceSpecsResponse build() {
            return new ListInstanceSpecsResponse(this);
        } 

    } 

}
