// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstancePublishTaskStateResponse} extends {@link TeaModel}
 *
 * <p>GetInstancePublishTaskStateResponse</p>
 */
public class GetInstancePublishTaskStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstancePublishTaskStateResponseBody body;

    private GetInstancePublishTaskStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstancePublishTaskStateResponse create() {
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
    public GetInstancePublishTaskStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstancePublishTaskStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstancePublishTaskStateResponseBody body);

        @Override
        GetInstancePublishTaskStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstancePublishTaskStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstancePublishTaskStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstancePublishTaskStateResponse response) {
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
        public Builder body(GetInstancePublishTaskStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstancePublishTaskStateResponse build() {
            return new GetInstancePublishTaskStateResponse(this);
        } 

    } 

}
