// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionsByFilterResponse} extends {@link TeaModel}
 *
 * <p>ListPartitionsByFilterResponse</p>
 */
public class ListPartitionsByFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPartitionsByFilterResponseBody body;

    private ListPartitionsByFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPartitionsByFilterResponse create() {
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
    public ListPartitionsByFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPartitionsByFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPartitionsByFilterResponseBody body);

        @Override
        ListPartitionsByFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPartitionsByFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPartitionsByFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPartitionsByFilterResponse response) {
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
        public Builder body(ListPartitionsByFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPartitionsByFilterResponse build() {
            return new ListPartitionsByFilterResponse(this);
        } 

    } 

}
