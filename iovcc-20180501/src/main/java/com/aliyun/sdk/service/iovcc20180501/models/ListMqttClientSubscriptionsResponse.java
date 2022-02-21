// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMqttClientSubscriptionsResponse} extends {@link TeaModel}
 *
 * <p>ListMqttClientSubscriptionsResponse</p>
 */
public class ListMqttClientSubscriptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMqttClientSubscriptionsResponseBody body;

    private ListMqttClientSubscriptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMqttClientSubscriptionsResponse create() {
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
    public ListMqttClientSubscriptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMqttClientSubscriptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMqttClientSubscriptionsResponseBody body);

        @Override
        ListMqttClientSubscriptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMqttClientSubscriptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMqttClientSubscriptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMqttClientSubscriptionsResponse response) {
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
        public Builder body(ListMqttClientSubscriptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMqttClientSubscriptionsResponse build() {
            return new ListMqttClientSubscriptionsResponse(this);
        } 

    } 

}
