// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectResponse} extends {@link TeaModel}
 *
 * <p>ListProjectResponse</p>
 */
public class ListProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectResponseBody body;

    private ListProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectResponse create() {
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
    public ListProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectResponseBody body);

        @Override
        ListProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectResponse response) {
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
        public Builder body(ListProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectResponse build() {
            return new ListProjectResponse(this);
        } 

    } 

}
