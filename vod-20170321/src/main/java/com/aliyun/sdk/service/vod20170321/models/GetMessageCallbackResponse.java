// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageCallbackResponse} extends {@link TeaModel}
 *
 * <p>GetMessageCallbackResponse</p>
 */
public class GetMessageCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageCallbackResponseBody body;

    private GetMessageCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageCallbackResponse create() {
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
    public GetMessageCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageCallbackResponseBody body);

        @Override
        GetMessageCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageCallbackResponse response) {
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
        public Builder body(GetMessageCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageCallbackResponse build() {
            return new GetMessageCallbackResponse(this);
        } 

    } 

}
