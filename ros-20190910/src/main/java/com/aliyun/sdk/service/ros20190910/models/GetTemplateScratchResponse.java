// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateScratchResponse} extends {@link TeaModel}
 *
 * <p>GetTemplateScratchResponse</p>
 */
public class GetTemplateScratchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTemplateScratchResponseBody body;

    private GetTemplateScratchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTemplateScratchResponse create() {
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
    public GetTemplateScratchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTemplateScratchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTemplateScratchResponseBody body);

        @Override
        GetTemplateScratchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTemplateScratchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTemplateScratchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTemplateScratchResponse response) {
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
        public Builder body(GetTemplateScratchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTemplateScratchResponse build() {
            return new GetTemplateScratchResponse(this);
        } 

    } 

}
