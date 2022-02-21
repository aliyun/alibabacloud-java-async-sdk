// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMqConsumerTagResponse} extends {@link TeaModel}
 *
 * <p>GetMqConsumerTagResponse</p>
 */
public class GetMqConsumerTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMqConsumerTagResponseBody body;

    private GetMqConsumerTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMqConsumerTagResponse create() {
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
    public GetMqConsumerTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMqConsumerTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMqConsumerTagResponseBody body);

        @Override
        GetMqConsumerTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMqConsumerTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMqConsumerTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMqConsumerTagResponse response) {
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
        public Builder body(GetMqConsumerTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMqConsumerTagResponse build() {
            return new GetMqConsumerTagResponse(this);
        } 

    } 

}
