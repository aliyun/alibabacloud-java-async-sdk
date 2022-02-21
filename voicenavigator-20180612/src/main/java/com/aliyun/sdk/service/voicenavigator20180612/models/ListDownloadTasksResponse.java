// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDownloadTasksResponse} extends {@link TeaModel}
 *
 * <p>ListDownloadTasksResponse</p>
 */
public class ListDownloadTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDownloadTasksResponseBody body;

    private ListDownloadTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDownloadTasksResponse create() {
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
    public ListDownloadTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDownloadTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDownloadTasksResponseBody body);

        @Override
        ListDownloadTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDownloadTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDownloadTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDownloadTasksResponse response) {
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
        public Builder body(ListDownloadTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDownloadTasksResponse build() {
            return new ListDownloadTasksResponse(this);
        } 

    } 

}
