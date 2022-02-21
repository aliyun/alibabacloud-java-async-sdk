// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerStatusResponse} extends {@link TeaModel}
 *
 * <p>GetConsumerStatusResponse</p>
 */
public class GetConsumerStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConsumerStatusResponseBody body;

    private GetConsumerStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConsumerStatusResponse create() {
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
    public GetConsumerStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConsumerStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConsumerStatusResponseBody body);

        @Override
        GetConsumerStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConsumerStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConsumerStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConsumerStatusResponse response) {
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
        public Builder body(GetConsumerStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConsumerStatusResponse build() {
            return new GetConsumerStatusResponse(this);
        } 

    } 

}
