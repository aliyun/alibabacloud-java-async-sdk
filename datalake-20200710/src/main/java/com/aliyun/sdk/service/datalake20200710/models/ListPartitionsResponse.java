// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionsResponse} extends {@link TeaModel}
 *
 * <p>ListPartitionsResponse</p>
 */
public class ListPartitionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPartitionsResponseBody body;

    private ListPartitionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPartitionsResponse create() {
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
    public ListPartitionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPartitionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPartitionsResponseBody body);

        @Override
        ListPartitionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPartitionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPartitionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPartitionsResponse response) {
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
        public Builder body(ListPartitionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPartitionsResponse build() {
            return new ListPartitionsResponse(this);
        } 

    } 

}
