// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionByTopicResponse} extends {@link TeaModel}
 *
 * <p>ListSubscriptionByTopicResponse</p>
 */
public class ListSubscriptionByTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSubscriptionByTopicResponseBody body;

    private ListSubscriptionByTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSubscriptionByTopicResponse create() {
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
    public ListSubscriptionByTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSubscriptionByTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSubscriptionByTopicResponseBody body);

        @Override
        ListSubscriptionByTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSubscriptionByTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSubscriptionByTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSubscriptionByTopicResponse response) {
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
        public Builder body(ListSubscriptionByTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSubscriptionByTopicResponse build() {
            return new ListSubscriptionByTopicResponse(this);
        } 

    } 

}
