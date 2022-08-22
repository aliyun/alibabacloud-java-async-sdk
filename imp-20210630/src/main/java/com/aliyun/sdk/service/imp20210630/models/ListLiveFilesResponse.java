// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveFilesResponse} extends {@link TeaModel}
 *
 * <p>ListLiveFilesResponse</p>
 */
public class ListLiveFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLiveFilesResponseBody body;

    private ListLiveFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLiveFilesResponse create() {
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
    public ListLiveFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLiveFilesResponseBody body);

        @Override
        ListLiveFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLiveFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveFilesResponse response) {
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
        public Builder body(ListLiveFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveFilesResponse build() {
            return new ListLiveFilesResponse(this);
        } 

    } 

}
