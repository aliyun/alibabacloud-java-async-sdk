// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceVncUrlResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceVncUrlResponse</p>
 */
public class ListInstanceVncUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceVncUrlResponseBody body;

    private ListInstanceVncUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceVncUrlResponse create() {
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
    public ListInstanceVncUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceVncUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceVncUrlResponseBody body);

        @Override
        ListInstanceVncUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceVncUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceVncUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceVncUrlResponse response) {
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
        public Builder body(ListInstanceVncUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceVncUrlResponse build() {
            return new ListInstanceVncUrlResponse(this);
        } 

    } 

}
