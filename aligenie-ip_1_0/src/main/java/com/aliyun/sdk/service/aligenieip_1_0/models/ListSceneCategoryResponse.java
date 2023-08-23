// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSceneCategoryResponse} extends {@link TeaModel}
 *
 * <p>ListSceneCategoryResponse</p>
 */
public class ListSceneCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSceneCategoryResponseBody body;

    private ListSceneCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSceneCategoryResponse create() {
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
    public ListSceneCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSceneCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSceneCategoryResponseBody body);

        @Override
        ListSceneCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSceneCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSceneCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSceneCategoryResponse response) {
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
        public Builder body(ListSceneCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSceneCategoryResponse build() {
            return new ListSceneCategoryResponse(this);
        } 

    } 

}
