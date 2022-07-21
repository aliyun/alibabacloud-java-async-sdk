// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeTopicResponse} extends {@link TeaModel}
 *
 * <p>SubscribeTopicResponse</p>
 */
public class SubscribeTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubscribeTopicResponseBody body;

    private SubscribeTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubscribeTopicResponse create() {
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
    public SubscribeTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubscribeTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubscribeTopicResponseBody body);

        @Override
        SubscribeTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubscribeTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubscribeTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubscribeTopicResponse response) {
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
        public Builder body(SubscribeTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubscribeTopicResponse build() {
            return new SubscribeTopicResponse(this);
        } 

    } 

}
