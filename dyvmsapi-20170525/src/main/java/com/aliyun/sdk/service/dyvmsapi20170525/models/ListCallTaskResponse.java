// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallTaskResponse} extends {@link TeaModel}
 *
 * <p>ListCallTaskResponse</p>
 */
public class ListCallTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCallTaskResponseBody body;

    private ListCallTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCallTaskResponse create() {
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
    public ListCallTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCallTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCallTaskResponseBody body);

        @Override
        ListCallTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCallTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCallTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCallTaskResponse response) {
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
        public Builder body(ListCallTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCallTaskResponse build() {
            return new ListCallTaskResponse(this);
        } 

    } 

}
