// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTopicResponse} extends {@link TeaModel}
 *
 * <p>DeleteTopicResponse</p>
 */
public class DeleteTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTopicResponseBody body;

    private DeleteTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTopicResponse create() {
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
    public DeleteTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTopicResponseBody body);

        @Override
        DeleteTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTopicResponse response) {
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
        public Builder body(DeleteTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTopicResponse build() {
            return new DeleteTopicResponse(this);
        } 

    } 

}
