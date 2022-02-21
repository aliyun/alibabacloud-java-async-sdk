// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionResponse} extends {@link TeaModel}
 *
 * <p>GetAIActionResponse</p>
 */
public class GetAIActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIActionResponseBody body;

    private GetAIActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIActionResponse create() {
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
    public GetAIActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIActionResponseBody body);

        @Override
        GetAIActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIActionResponse response) {
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
        public Builder body(GetAIActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIActionResponse build() {
            return new GetAIActionResponse(this);
        } 

    } 

}
