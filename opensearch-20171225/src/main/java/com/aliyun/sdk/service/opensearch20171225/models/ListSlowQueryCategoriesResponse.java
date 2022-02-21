// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryCategoriesResponse} extends {@link TeaModel}
 *
 * <p>ListSlowQueryCategoriesResponse</p>
 */
public class ListSlowQueryCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSlowQueryCategoriesResponseBody body;

    private ListSlowQueryCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSlowQueryCategoriesResponse create() {
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
    public ListSlowQueryCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSlowQueryCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSlowQueryCategoriesResponseBody body);

        @Override
        ListSlowQueryCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSlowQueryCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSlowQueryCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSlowQueryCategoriesResponse response) {
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
        public Builder body(ListSlowQueryCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSlowQueryCategoriesResponse build() {
            return new ListSlowQueryCategoriesResponse(this);
        } 

    } 

}
