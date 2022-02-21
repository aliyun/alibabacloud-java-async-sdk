// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListStackInstancesResponse</p>
 */
public class ListStackInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackInstancesResponseBody body;

    private ListStackInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStackInstancesResponse create() {
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
    public ListStackInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStackInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStackInstancesResponseBody body);

        @Override
        ListStackInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStackInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStackInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStackInstancesResponse response) {
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
        public Builder body(ListStackInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStackInstancesResponse build() {
            return new ListStackInstancesResponse(this);
        } 

    } 

}
