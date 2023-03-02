// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserDetailSolutionsResponse} extends {@link TeaModel}
 *
 * <p>ListUserDetailSolutionsResponse</p>
 */
public class ListUserDetailSolutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserDetailSolutionsResponseBody body;

    private ListUserDetailSolutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserDetailSolutionsResponse create() {
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
    public ListUserDetailSolutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserDetailSolutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserDetailSolutionsResponseBody body);

        @Override
        ListUserDetailSolutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserDetailSolutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserDetailSolutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserDetailSolutionsResponse response) {
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
        public Builder body(ListUserDetailSolutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserDetailSolutionsResponse build() {
            return new ListUserDetailSolutionsResponse(this);
        } 

    } 

}
