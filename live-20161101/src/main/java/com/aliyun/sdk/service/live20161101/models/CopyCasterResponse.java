// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCasterResponse} extends {@link TeaModel}
 *
 * <p>CopyCasterResponse</p>
 */
public class CopyCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyCasterResponseBody body;

    private CopyCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyCasterResponse create() {
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
    public CopyCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyCasterResponseBody body);

        @Override
        CopyCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyCasterResponse response) {
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
        public Builder body(CopyCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyCasterResponse build() {
            return new CopyCasterResponse(this);
        } 

    } 

}
