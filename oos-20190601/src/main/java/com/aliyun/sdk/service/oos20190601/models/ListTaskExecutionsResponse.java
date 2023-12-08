// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskExecutionsResponse} extends {@link TeaModel}
 *
 * <p>ListTaskExecutionsResponse</p>
 */
public class ListTaskExecutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskExecutionsResponseBody body;

    private ListTaskExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskExecutionsResponse create() {
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
    public ListTaskExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskExecutionsResponseBody body);

        @Override
        ListTaskExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskExecutionsResponse response) {
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
        public Builder body(ListTaskExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskExecutionsResponse build() {
            return new ListTaskExecutionsResponse(this);
        } 

    } 

}
