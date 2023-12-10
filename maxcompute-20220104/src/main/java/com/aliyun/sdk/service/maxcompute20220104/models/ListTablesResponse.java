// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesResponse} extends {@link TeaModel}
 *
 * <p>ListTablesResponse</p>
 */
public class ListTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTablesResponseBody body;

    private ListTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTablesResponse create() {
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
    public ListTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTablesResponseBody body);

        @Override
        ListTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTablesResponse response) {
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
        public Builder body(ListTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTablesResponse build() {
            return new ListTablesResponse(this);
        } 

    } 

}
