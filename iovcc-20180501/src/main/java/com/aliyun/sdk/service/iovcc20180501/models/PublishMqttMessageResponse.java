// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishMqttMessageResponse} extends {@link TeaModel}
 *
 * <p>PublishMqttMessageResponse</p>
 */
public class PublishMqttMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishMqttMessageResponseBody body;

    private PublishMqttMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishMqttMessageResponse create() {
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
    public PublishMqttMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishMqttMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishMqttMessageResponseBody body);

        @Override
        PublishMqttMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishMqttMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishMqttMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishMqttMessageResponse response) {
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
        public Builder body(PublishMqttMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishMqttMessageResponse build() {
            return new PublishMqttMessageResponse(this);
        } 

    } 

}
