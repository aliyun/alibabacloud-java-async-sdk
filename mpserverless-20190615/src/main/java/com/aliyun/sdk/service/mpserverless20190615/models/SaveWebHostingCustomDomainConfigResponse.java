// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebHostingCustomDomainConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveWebHostingCustomDomainConfigResponse</p>
 */
public class SaveWebHostingCustomDomainConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveWebHostingCustomDomainConfigResponseBody body;

    private SaveWebHostingCustomDomainConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveWebHostingCustomDomainConfigResponse create() {
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
    public SaveWebHostingCustomDomainConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveWebHostingCustomDomainConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveWebHostingCustomDomainConfigResponseBody body);

        @Override
        SaveWebHostingCustomDomainConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveWebHostingCustomDomainConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveWebHostingCustomDomainConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveWebHostingCustomDomainConfigResponse response) {
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
        public Builder body(SaveWebHostingCustomDomainConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveWebHostingCustomDomainConfigResponse build() {
            return new SaveWebHostingCustomDomainConfigResponse(this);
        } 

    } 

}
