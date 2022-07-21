// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTensorboardsResponse} extends {@link TeaModel}
 *
 * <p>ListTensorboardsResponse</p>
 */
public class ListTensorboardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTensorboardsResponseBody body;

    private ListTensorboardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTensorboardsResponse create() {
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
    public ListTensorboardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTensorboardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTensorboardsResponseBody body);

        @Override
        ListTensorboardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTensorboardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTensorboardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTensorboardsResponse response) {
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
        public Builder body(ListTensorboardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTensorboardsResponse build() {
            return new ListTensorboardsResponse(this);
        } 

    } 

}
