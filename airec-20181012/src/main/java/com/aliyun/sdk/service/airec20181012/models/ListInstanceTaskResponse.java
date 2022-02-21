// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceTaskResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceTaskResponse</p>
 */
public class ListInstanceTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceTaskResponseBody body;

    private ListInstanceTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceTaskResponse create() {
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
    public ListInstanceTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceTaskResponseBody body);

        @Override
        ListInstanceTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceTaskResponse response) {
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
        public Builder body(ListInstanceTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceTaskResponse build() {
            return new ListInstanceTaskResponse(this);
        } 

    } 

}
