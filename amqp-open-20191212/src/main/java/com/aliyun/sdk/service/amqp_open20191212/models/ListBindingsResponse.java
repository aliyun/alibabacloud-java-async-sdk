// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListBindingsResponse</p>
 */
public class ListBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBindingsResponseBody body;

    private ListBindingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBindingsResponse create() {
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
    public ListBindingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBindingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBindingsResponseBody body);

        @Override
        ListBindingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBindingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBindingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBindingsResponse response) {
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
        public Builder body(ListBindingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBindingsResponse build() {
            return new ListBindingsResponse(this);
        } 

    } 

}
