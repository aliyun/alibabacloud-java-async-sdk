// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebHostingCustomDomainCorsConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveWebHostingCustomDomainCorsConfigResponse</p>
 */
public class SaveWebHostingCustomDomainCorsConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveWebHostingCustomDomainCorsConfigResponseBody body;

    private SaveWebHostingCustomDomainCorsConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveWebHostingCustomDomainCorsConfigResponse create() {
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
    public SaveWebHostingCustomDomainCorsConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveWebHostingCustomDomainCorsConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveWebHostingCustomDomainCorsConfigResponseBody body);

        @Override
        SaveWebHostingCustomDomainCorsConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveWebHostingCustomDomainCorsConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveWebHostingCustomDomainCorsConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveWebHostingCustomDomainCorsConfigResponse response) {
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
        public Builder body(SaveWebHostingCustomDomainCorsConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveWebHostingCustomDomainCorsConfigResponse build() {
            return new SaveWebHostingCustomDomainCorsConfigResponse(this);
        } 

    } 

}
