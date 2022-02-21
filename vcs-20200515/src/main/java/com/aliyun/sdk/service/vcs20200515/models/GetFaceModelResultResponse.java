// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceModelResultResponse} extends {@link TeaModel}
 *
 * <p>GetFaceModelResultResponse</p>
 */
public class GetFaceModelResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFaceModelResultResponseBody body;

    private GetFaceModelResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFaceModelResultResponse create() {
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
    public GetFaceModelResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFaceModelResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFaceModelResultResponseBody body);

        @Override
        GetFaceModelResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFaceModelResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFaceModelResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFaceModelResultResponse response) {
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
        public Builder body(GetFaceModelResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFaceModelResultResponse build() {
            return new GetFaceModelResultResponse(this);
        } 

    } 

}
