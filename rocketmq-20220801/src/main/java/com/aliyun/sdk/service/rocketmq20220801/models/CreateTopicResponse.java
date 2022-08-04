// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicResponse} extends {@link TeaModel}
 *
 * <p>CreateTopicResponse</p>
 */
public class CreateTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTopicResponseBody body;

    private CreateTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTopicResponse create() {
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
    public CreateTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTopicResponseBody body);

        @Override
        CreateTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTopicResponse response) {
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
        public Builder body(CreateTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTopicResponse build() {
            return new CreateTopicResponse(this);
        } 

    } 

}
