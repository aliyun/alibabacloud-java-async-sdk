// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CategoryTreeResponse} extends {@link TeaModel}
 *
 * <p>CategoryTreeResponse</p>
 */
public class CategoryTreeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CategoryTreeResponseBody body;

    private CategoryTreeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CategoryTreeResponse create() {
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
    public CategoryTreeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CategoryTreeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CategoryTreeResponseBody body);

        @Override
        CategoryTreeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CategoryTreeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CategoryTreeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CategoryTreeResponse response) {
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
        public Builder body(CategoryTreeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CategoryTreeResponse build() {
            return new CategoryTreeResponse(this);
        } 

    } 

}
