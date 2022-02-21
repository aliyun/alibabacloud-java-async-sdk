// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMqttRootTopicResponse} extends {@link TeaModel}
 *
 * <p>DeleteMqttRootTopicResponse</p>
 */
public class DeleteMqttRootTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMqttRootTopicResponseBody body;

    private DeleteMqttRootTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMqttRootTopicResponse create() {
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
    public DeleteMqttRootTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMqttRootTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMqttRootTopicResponseBody body);

        @Override
        DeleteMqttRootTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMqttRootTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMqttRootTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMqttRootTopicResponse response) {
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
        public Builder body(DeleteMqttRootTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMqttRootTopicResponse build() {
            return new DeleteMqttRootTopicResponse(this);
        } 

    } 

}
