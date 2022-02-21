// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCategoryResponse} extends {@link TeaModel}
 *
 * <p>AddCategoryResponse</p>
 */
public class AddCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCategoryResponseBody body;

    private AddCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCategoryResponse create() {
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
    public AddCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCategoryResponseBody body);

        @Override
        AddCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCategoryResponse response) {
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
        public Builder body(AddCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCategoryResponse build() {
            return new AddCategoryResponse(this);
        } 

    } 

}
