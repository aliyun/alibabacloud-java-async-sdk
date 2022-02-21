// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsResponse} extends {@link TeaModel}
 *
 * <p>ListDbfsResponse</p>
 */
public class ListDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDbfsResponseBody body;

    private ListDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDbfsResponse create() {
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
    public ListDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDbfsResponseBody body);

        @Override
        ListDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDbfsResponse response) {
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
        public Builder body(ListDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDbfsResponse build() {
            return new ListDbfsResponse(this);
        } 

    } 

}
