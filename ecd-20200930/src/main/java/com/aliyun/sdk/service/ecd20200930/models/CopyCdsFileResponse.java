// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCdsFileResponse} extends {@link TeaModel}
 *
 * <p>CopyCdsFileResponse</p>
 */
public class CopyCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyCdsFileResponseBody body;

    private CopyCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyCdsFileResponse create() {
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
    public CopyCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyCdsFileResponseBody body);

        @Override
        CopyCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyCdsFileResponse response) {
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
        public Builder body(CopyCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyCdsFileResponse build() {
            return new CopyCdsFileResponse(this);
        } 

    } 

}
