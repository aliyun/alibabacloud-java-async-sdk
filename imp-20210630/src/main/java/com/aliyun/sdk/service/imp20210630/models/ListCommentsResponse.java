// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommentsResponse} extends {@link TeaModel}
 *
 * <p>ListCommentsResponse</p>
 */
public class ListCommentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCommentsResponseBody body;

    private ListCommentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCommentsResponse create() {
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
    public ListCommentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCommentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCommentsResponseBody body);

        @Override
        ListCommentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCommentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCommentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCommentsResponse response) {
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
        public Builder body(ListCommentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCommentsResponse build() {
            return new ListCommentsResponse(this);
        } 

    } 

}
