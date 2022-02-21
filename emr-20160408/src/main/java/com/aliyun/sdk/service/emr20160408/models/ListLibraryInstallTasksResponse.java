// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibraryInstallTasksResponse} extends {@link TeaModel}
 *
 * <p>ListLibraryInstallTasksResponse</p>
 */
public class ListLibraryInstallTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLibraryInstallTasksResponseBody body;

    private ListLibraryInstallTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLibraryInstallTasksResponse create() {
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
    public ListLibraryInstallTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLibraryInstallTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLibraryInstallTasksResponseBody body);

        @Override
        ListLibraryInstallTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLibraryInstallTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLibraryInstallTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLibraryInstallTasksResponse response) {
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
        public Builder body(ListLibraryInstallTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLibraryInstallTasksResponse build() {
            return new ListLibraryInstallTasksResponse(this);
        } 

    } 

}
