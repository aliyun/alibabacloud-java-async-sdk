// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsForPrivateAccessApplicationResponse} extends {@link TeaModel}
 *
 * <p>ListTagsForPrivateAccessApplicationResponse</p>
 */
public class ListTagsForPrivateAccessApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagsForPrivateAccessApplicationResponseBody body;

    private ListTagsForPrivateAccessApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTagsForPrivateAccessApplicationResponse create() {
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
    public ListTagsForPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagsForPrivateAccessApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTagsForPrivateAccessApplicationResponseBody body);

        @Override
        ListTagsForPrivateAccessApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagsForPrivateAccessApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTagsForPrivateAccessApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagsForPrivateAccessApplicationResponse response) {
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
        public Builder body(ListTagsForPrivateAccessApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagsForPrivateAccessApplicationResponse build() {
            return new ListTagsForPrivateAccessApplicationResponse(this);
        } 

    } 

}
