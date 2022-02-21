// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionFilesByProjectIdResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionFilesByProjectIdResponse</p>
 */
public class ListFunctionFilesByProjectIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionFilesByProjectIdResponseBody body;

    private ListFunctionFilesByProjectIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionFilesByProjectIdResponse create() {
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
    public ListFunctionFilesByProjectIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionFilesByProjectIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionFilesByProjectIdResponseBody body);

        @Override
        ListFunctionFilesByProjectIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionFilesByProjectIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionFilesByProjectIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionFilesByProjectIdResponse response) {
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
        public Builder body(ListFunctionFilesByProjectIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionFilesByProjectIdResponse build() {
            return new ListFunctionFilesByProjectIdResponse(this);
        } 

    } 

}
