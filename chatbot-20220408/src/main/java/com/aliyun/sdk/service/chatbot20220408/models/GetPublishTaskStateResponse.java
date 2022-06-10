// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublishTaskStateResponse} extends {@link TeaModel}
 *
 * <p>GetPublishTaskStateResponse</p>
 */
public class GetPublishTaskStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPublishTaskStateResponseBody body;

    private GetPublishTaskStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPublishTaskStateResponse create() {
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
    public GetPublishTaskStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPublishTaskStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPublishTaskStateResponseBody body);

        @Override
        GetPublishTaskStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPublishTaskStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPublishTaskStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPublishTaskStateResponse response) {
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
        public Builder body(GetPublishTaskStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPublishTaskStateResponse build() {
            return new GetPublishTaskStateResponse(this);
        } 

    } 

}
