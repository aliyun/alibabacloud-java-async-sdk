// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListResourceInstancesResponse</p>
 */
public class ListResourceInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceInstancesResponseBody body;

    private ListResourceInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceInstancesResponse create() {
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
    public ListResourceInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceInstancesResponseBody body);

        @Override
        ListResourceInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceInstancesResponse response) {
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
        public Builder body(ListResourceInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceInstancesResponse build() {
            return new ListResourceInstancesResponse(this);
        } 

    } 

}
