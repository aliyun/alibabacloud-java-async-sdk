// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionFilesResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionFilesResponse</p>
 */
public class ListFunctionFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionFilesResponseBody body;

    private ListFunctionFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionFilesResponse create() {
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
    public ListFunctionFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionFilesResponseBody body);

        @Override
        ListFunctionFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionFilesResponse response) {
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
        public Builder body(ListFunctionFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionFilesResponse build() {
            return new ListFunctionFilesResponse(this);
        } 

    } 

}
