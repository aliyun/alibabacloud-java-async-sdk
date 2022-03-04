// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceScreenshotResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceScreenshotResponse</p>
 */
public class GetInstanceScreenshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceScreenshotResponseBody body;

    private GetInstanceScreenshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceScreenshotResponse create() {
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
    public GetInstanceScreenshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceScreenshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceScreenshotResponseBody body);

        @Override
        GetInstanceScreenshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceScreenshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceScreenshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceScreenshotResponse response) {
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
        public Builder body(GetInstanceScreenshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceScreenshotResponse build() {
            return new GetInstanceScreenshotResponse(this);
        } 

    } 

}
