// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilesResponse} extends {@link TeaModel}
 *
 * <p>ListFilesResponse</p>
 */
public class ListFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFilesResponseBody body;

    private ListFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFilesResponse create() {
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
    public ListFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFilesResponseBody body);

        @Override
        ListFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFilesResponse response) {
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
        public Builder body(ListFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFilesResponse build() {
            return new ListFilesResponse(this);
        } 

    } 

}
