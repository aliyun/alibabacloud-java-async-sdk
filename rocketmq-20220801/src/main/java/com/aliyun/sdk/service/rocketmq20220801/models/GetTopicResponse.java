// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicResponse} extends {@link TeaModel}
 *
 * <p>GetTopicResponse</p>
 */
public class GetTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTopicResponseBody body;

    private GetTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTopicResponse create() {
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
    public GetTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTopicResponseBody body);

        @Override
        GetTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTopicResponse response) {
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
        public Builder body(GetTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTopicResponse build() {
            return new GetTopicResponse(this);
        } 

    } 

}
