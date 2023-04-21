// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCdsFilesResponse} extends {@link TeaModel}
 *
 * <p>ListCdsFilesResponse</p>
 */
public class ListCdsFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCdsFilesResponseBody body;

    private ListCdsFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCdsFilesResponse create() {
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
    public ListCdsFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCdsFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCdsFilesResponseBody body);

        @Override
        ListCdsFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCdsFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCdsFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCdsFilesResponse response) {
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
        public Builder body(ListCdsFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCdsFilesResponse build() {
            return new ListCdsFilesResponse(this);
        } 

    } 

}
