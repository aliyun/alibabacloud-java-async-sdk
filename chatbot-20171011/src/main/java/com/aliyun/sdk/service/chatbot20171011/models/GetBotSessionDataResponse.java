// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBotSessionDataResponse} extends {@link TeaModel}
 *
 * <p>GetBotSessionDataResponse</p>
 */
public class GetBotSessionDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBotSessionDataResponseBody body;

    private GetBotSessionDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBotSessionDataResponse create() {
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
    public GetBotSessionDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBotSessionDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBotSessionDataResponseBody body);

        @Override
        GetBotSessionDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBotSessionDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBotSessionDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBotSessionDataResponse response) {
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
        public Builder body(GetBotSessionDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBotSessionDataResponse build() {
            return new GetBotSessionDataResponse(this);
        } 

    } 

}
