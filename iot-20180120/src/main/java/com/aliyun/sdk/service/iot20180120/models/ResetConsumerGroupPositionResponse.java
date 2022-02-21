// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetConsumerGroupPositionResponse} extends {@link TeaModel}
 *
 * <p>ResetConsumerGroupPositionResponse</p>
 */
public class ResetConsumerGroupPositionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetConsumerGroupPositionResponseBody body;

    private ResetConsumerGroupPositionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetConsumerGroupPositionResponse create() {
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
    public ResetConsumerGroupPositionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetConsumerGroupPositionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetConsumerGroupPositionResponseBody body);

        @Override
        ResetConsumerGroupPositionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetConsumerGroupPositionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetConsumerGroupPositionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetConsumerGroupPositionResponse response) {
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
        public Builder body(ResetConsumerGroupPositionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetConsumerGroupPositionResponse build() {
            return new ResetConsumerGroupPositionResponse(this);
        } 

    } 

}
