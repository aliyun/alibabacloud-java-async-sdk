// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskSizeResponse} extends {@link TeaModel}
 *
 * <p>ResizeDiskSizeResponse</p>
 */
public class ResizeDiskSizeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeDiskSizeResponseBody body;

    private ResizeDiskSizeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeDiskSizeResponse create() {
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
    public ResizeDiskSizeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeDiskSizeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeDiskSizeResponseBody body);

        @Override
        ResizeDiskSizeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeDiskSizeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeDiskSizeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeDiskSizeResponse response) {
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
        public Builder body(ResizeDiskSizeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeDiskSizeResponse build() {
            return new ResizeDiskSizeResponse(this);
        } 

    } 

}
