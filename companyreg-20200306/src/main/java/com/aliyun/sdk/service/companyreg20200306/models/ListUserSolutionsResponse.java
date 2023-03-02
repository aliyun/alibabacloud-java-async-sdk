// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSolutionsResponse} extends {@link TeaModel}
 *
 * <p>ListUserSolutionsResponse</p>
 */
public class ListUserSolutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserSolutionsResponseBody body;

    private ListUserSolutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserSolutionsResponse create() {
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
    public ListUserSolutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserSolutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserSolutionsResponseBody body);

        @Override
        ListUserSolutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserSolutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserSolutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserSolutionsResponse response) {
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
        public Builder body(ListUserSolutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserSolutionsResponse build() {
            return new ListUserSolutionsResponse(this);
        } 

    } 

}
