// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeColdStorageSizeResponse} extends {@link TeaModel}
 *
 * <p>ResizeColdStorageSizeResponse</p>
 */
public class ResizeColdStorageSizeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResizeColdStorageSizeResponseBody body;

    private ResizeColdStorageSizeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResizeColdStorageSizeResponse create() {
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
    public ResizeColdStorageSizeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResizeColdStorageSizeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResizeColdStorageSizeResponseBody body);

        @Override
        ResizeColdStorageSizeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResizeColdStorageSizeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResizeColdStorageSizeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResizeColdStorageSizeResponse response) {
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
        public Builder body(ResizeColdStorageSizeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResizeColdStorageSizeResponse build() {
            return new ResizeColdStorageSizeResponse(this);
        } 

    } 

}
