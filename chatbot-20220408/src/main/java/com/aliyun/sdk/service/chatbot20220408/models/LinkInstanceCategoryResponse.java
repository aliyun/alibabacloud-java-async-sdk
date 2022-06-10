// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LinkInstanceCategoryResponse} extends {@link TeaModel}
 *
 * <p>LinkInstanceCategoryResponse</p>
 */
public class LinkInstanceCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LinkInstanceCategoryResponseBody body;

    private LinkInstanceCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LinkInstanceCategoryResponse create() {
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
    public LinkInstanceCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LinkInstanceCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LinkInstanceCategoryResponseBody body);

        @Override
        LinkInstanceCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LinkInstanceCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LinkInstanceCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LinkInstanceCategoryResponse response) {
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
        public Builder body(LinkInstanceCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LinkInstanceCategoryResponse build() {
            return new LinkInstanceCategoryResponse(this);
        } 

    } 

}
