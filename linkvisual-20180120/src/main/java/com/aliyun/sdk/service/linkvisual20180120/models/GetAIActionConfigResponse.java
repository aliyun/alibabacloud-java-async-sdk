// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAIActionConfigResponse</p>
 */
public class GetAIActionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIActionConfigResponseBody body;

    private GetAIActionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIActionConfigResponse create() {
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
    public GetAIActionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIActionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIActionConfigResponseBody body);

        @Override
        GetAIActionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIActionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIActionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIActionConfigResponse response) {
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
        public Builder body(GetAIActionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIActionConfigResponse build() {
            return new GetAIActionConfigResponse(this);
        } 

    } 

}
