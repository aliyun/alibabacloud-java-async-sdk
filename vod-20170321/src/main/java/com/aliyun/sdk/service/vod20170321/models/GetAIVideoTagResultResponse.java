// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIVideoTagResultResponse} extends {@link TeaModel}
 *
 * <p>GetAIVideoTagResultResponse</p>
 */
public class GetAIVideoTagResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIVideoTagResultResponseBody body;

    private GetAIVideoTagResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIVideoTagResultResponse create() {
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
    public GetAIVideoTagResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIVideoTagResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIVideoTagResultResponseBody body);

        @Override
        GetAIVideoTagResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIVideoTagResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIVideoTagResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIVideoTagResultResponse response) {
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
        public Builder body(GetAIVideoTagResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIVideoTagResultResponse build() {
            return new GetAIVideoTagResultResponse(this);
        } 

    } 

}
