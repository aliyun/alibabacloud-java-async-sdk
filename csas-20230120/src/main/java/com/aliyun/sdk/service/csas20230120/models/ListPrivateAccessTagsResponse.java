// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessTagsResponse} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessTagsResponse</p>
 */
public class ListPrivateAccessTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivateAccessTagsResponseBody body;

    private ListPrivateAccessTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrivateAccessTagsResponse create() {
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
    public ListPrivateAccessTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivateAccessTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrivateAccessTagsResponseBody body);

        @Override
        ListPrivateAccessTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivateAccessTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrivateAccessTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivateAccessTagsResponse response) {
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
        public Builder body(ListPrivateAccessTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivateAccessTagsResponse build() {
            return new ListPrivateAccessTagsResponse(this);
        } 

    } 

}
