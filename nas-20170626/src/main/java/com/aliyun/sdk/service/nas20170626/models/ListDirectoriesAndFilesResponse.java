// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesAndFilesResponse} extends {@link TeaModel}
 *
 * <p>ListDirectoriesAndFilesResponse</p>
 */
public class ListDirectoriesAndFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDirectoriesAndFilesResponseBody body;

    private ListDirectoriesAndFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDirectoriesAndFilesResponse create() {
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
    public ListDirectoriesAndFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDirectoriesAndFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDirectoriesAndFilesResponseBody body);

        @Override
        ListDirectoriesAndFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDirectoriesAndFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDirectoriesAndFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDirectoriesAndFilesResponse response) {
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
        public Builder body(ListDirectoriesAndFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDirectoriesAndFilesResponse build() {
            return new ListDirectoriesAndFilesResponse(this);
        } 

    } 

}
