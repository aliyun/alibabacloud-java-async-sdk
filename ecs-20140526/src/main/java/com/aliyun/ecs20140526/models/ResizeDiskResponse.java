// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskResponse} extends {@link TeaModel}
 *
 * <p>ResizeDiskResponse</p>
 */
public class ResizeDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeDiskResponseBody body;

    private ResizeDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeDiskResponse create() {
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
    public ResizeDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeDiskResponseBody body);

        @Override
        ResizeDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeDiskResponse response) {
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
        public Builder body(ResizeDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeDiskResponse build() {
            return new ResizeDiskResponse(this);
        } 

    } 

}
