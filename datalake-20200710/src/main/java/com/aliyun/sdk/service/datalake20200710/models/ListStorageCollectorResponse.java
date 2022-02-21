// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStorageCollectorResponse} extends {@link TeaModel}
 *
 * <p>ListStorageCollectorResponse</p>
 */
public class ListStorageCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStorageCollectorResponseBody body;

    private ListStorageCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStorageCollectorResponse create() {
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
    public ListStorageCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStorageCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStorageCollectorResponseBody body);

        @Override
        ListStorageCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStorageCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStorageCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStorageCollectorResponse response) {
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
        public Builder body(ListStorageCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStorageCollectorResponse build() {
            return new ListStorageCollectorResponse(this);
        } 

    } 

}
