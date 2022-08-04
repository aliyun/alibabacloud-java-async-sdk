// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConsumerGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListConsumerGroupsResponse</p>
 */
public class ListConsumerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConsumerGroupsResponseBody body;

    private ListConsumerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConsumerGroupsResponse create() {
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
    public ListConsumerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConsumerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConsumerGroupsResponseBody body);

        @Override
        ListConsumerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConsumerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConsumerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConsumerGroupsResponse response) {
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
        public Builder body(ListConsumerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConsumerGroupsResponse build() {
            return new ListConsumerGroupsResponse(this);
        } 

    } 

}
