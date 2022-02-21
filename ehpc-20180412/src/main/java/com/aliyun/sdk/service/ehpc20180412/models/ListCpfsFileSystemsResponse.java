// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCpfsFileSystemsResponse} extends {@link TeaModel}
 *
 * <p>ListCpfsFileSystemsResponse</p>
 */
public class ListCpfsFileSystemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCpfsFileSystemsResponseBody body;

    private ListCpfsFileSystemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCpfsFileSystemsResponse create() {
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
    public ListCpfsFileSystemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCpfsFileSystemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCpfsFileSystemsResponseBody body);

        @Override
        ListCpfsFileSystemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCpfsFileSystemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCpfsFileSystemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCpfsFileSystemsResponse response) {
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
        public Builder body(ListCpfsFileSystemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCpfsFileSystemsResponse build() {
            return new ListCpfsFileSystemsResponse(this);
        } 

    } 

}
