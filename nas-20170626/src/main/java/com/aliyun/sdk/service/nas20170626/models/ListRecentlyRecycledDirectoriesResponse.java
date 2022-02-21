// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentlyRecycledDirectoriesResponse} extends {@link TeaModel}
 *
 * <p>ListRecentlyRecycledDirectoriesResponse</p>
 */
public class ListRecentlyRecycledDirectoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecentlyRecycledDirectoriesResponseBody body;

    private ListRecentlyRecycledDirectoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecentlyRecycledDirectoriesResponse create() {
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
    public ListRecentlyRecycledDirectoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecentlyRecycledDirectoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecentlyRecycledDirectoriesResponseBody body);

        @Override
        ListRecentlyRecycledDirectoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecentlyRecycledDirectoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecentlyRecycledDirectoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecentlyRecycledDirectoriesResponse response) {
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
        public Builder body(ListRecentlyRecycledDirectoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecentlyRecycledDirectoriesResponse build() {
            return new ListRecentlyRecycledDirectoriesResponse(this);
        } 

    } 

}
