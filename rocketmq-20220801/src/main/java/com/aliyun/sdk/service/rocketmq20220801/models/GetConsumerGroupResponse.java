// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerGroupResponse} extends {@link TeaModel}
 *
 * <p>GetConsumerGroupResponse</p>
 */
public class GetConsumerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConsumerGroupResponseBody body;

    private GetConsumerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConsumerGroupResponse create() {
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
    public GetConsumerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConsumerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConsumerGroupResponseBody body);

        @Override
        GetConsumerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConsumerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConsumerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConsumerGroupResponse response) {
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
        public Builder body(GetConsumerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConsumerGroupResponse build() {
            return new GetConsumerGroupResponse(this);
        } 

    } 

}
