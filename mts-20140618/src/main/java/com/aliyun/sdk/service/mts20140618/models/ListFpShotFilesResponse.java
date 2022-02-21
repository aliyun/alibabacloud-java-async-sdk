// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotFilesResponse} extends {@link TeaModel}
 *
 * <p>ListFpShotFilesResponse</p>
 */
public class ListFpShotFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFpShotFilesResponseBody body;

    private ListFpShotFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFpShotFilesResponse create() {
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
    public ListFpShotFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFpShotFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFpShotFilesResponseBody body);

        @Override
        ListFpShotFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFpShotFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFpShotFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFpShotFilesResponse response) {
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
        public Builder body(ListFpShotFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFpShotFilesResponse build() {
            return new ListFpShotFilesResponse(this);
        } 

    } 

}
