// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCategoriesResponse} extends {@link TeaModel}
 *
 * <p>ListCategoriesResponse</p>
 */
public class ListCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCategoriesResponseBody body;

    private ListCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCategoriesResponse create() {
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
    public ListCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCategoriesResponseBody body);

        @Override
        ListCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCategoriesResponse response) {
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
        public Builder body(ListCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCategoriesResponse build() {
            return new ListCategoriesResponse(this);
        } 

    } 

}
