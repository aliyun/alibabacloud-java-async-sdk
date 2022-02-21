// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIAppResponse} extends {@link TeaModel}
 *
 * <p>GetAIAppResponse</p>
 */
public class GetAIAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIAppResponseBody body;

    private GetAIAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIAppResponse create() {
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
    public GetAIAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIAppResponseBody body);

        @Override
        GetAIAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIAppResponse response) {
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
        public Builder body(GetAIAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIAppResponse build() {
            return new GetAIAppResponse(this);
        } 

    } 

}
