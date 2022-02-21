// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttTopicSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>DescribeMqttTopicSubscriptionResponse</p>
 */
public class DescribeMqttTopicSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMqttTopicSubscriptionResponseBody body;

    private DescribeMqttTopicSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMqttTopicSubscriptionResponse create() {
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
    public DescribeMqttTopicSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMqttTopicSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMqttTopicSubscriptionResponseBody body);

        @Override
        DescribeMqttTopicSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMqttTopicSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMqttTopicSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMqttTopicSubscriptionResponse response) {
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
        public Builder body(DescribeMqttTopicSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMqttTopicSubscriptionResponse build() {
            return new DescribeMqttTopicSubscriptionResponse(this);
        } 

    } 

}
