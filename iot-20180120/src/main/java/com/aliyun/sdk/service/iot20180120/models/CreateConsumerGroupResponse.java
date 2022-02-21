// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateConsumerGroupResponse</p>
 */
public class CreateConsumerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConsumerGroupResponseBody body;

    private CreateConsumerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConsumerGroupResponse create() {
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
    public CreateConsumerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConsumerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConsumerGroupResponseBody body);

        @Override
        CreateConsumerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConsumerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConsumerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConsumerGroupResponse response) {
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
        public Builder body(CreateConsumerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConsumerGroupResponse build() {
            return new CreateConsumerGroupResponse(this);
        } 

    } 

}
