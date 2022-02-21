// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConsumerGroupSubscribeRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteConsumerGroupSubscribeRelationResponse</p>
 */
public class DeleteConsumerGroupSubscribeRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConsumerGroupSubscribeRelationResponseBody body;

    private DeleteConsumerGroupSubscribeRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConsumerGroupSubscribeRelationResponse create() {
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
    public DeleteConsumerGroupSubscribeRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConsumerGroupSubscribeRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConsumerGroupSubscribeRelationResponseBody body);

        @Override
        DeleteConsumerGroupSubscribeRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConsumerGroupSubscribeRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConsumerGroupSubscribeRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConsumerGroupSubscribeRelationResponse response) {
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
        public Builder body(DeleteConsumerGroupSubscribeRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConsumerGroupSubscribeRelationResponse build() {
            return new DeleteConsumerGroupSubscribeRelationResponse(this);
        } 

    } 

}
