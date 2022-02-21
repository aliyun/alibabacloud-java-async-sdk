// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllCategoryResponse} extends {@link TeaModel}
 *
 * <p>ListAllCategoryResponse</p>
 */
public class ListAllCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAllCategoryResponseBody body;

    private ListAllCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAllCategoryResponse create() {
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
    public ListAllCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAllCategoryResponseBody body);

        @Override
        ListAllCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAllCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllCategoryResponse response) {
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
        public Builder body(ListAllCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllCategoryResponse build() {
            return new ListAllCategoryResponse(this);
        } 

    } 

}
