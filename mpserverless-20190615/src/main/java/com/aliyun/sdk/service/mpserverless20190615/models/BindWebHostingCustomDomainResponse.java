// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindWebHostingCustomDomainResponse} extends {@link TeaModel}
 *
 * <p>BindWebHostingCustomDomainResponse</p>
 */
public class BindWebHostingCustomDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindWebHostingCustomDomainResponseBody body;

    private BindWebHostingCustomDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindWebHostingCustomDomainResponse create() {
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
    public BindWebHostingCustomDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindWebHostingCustomDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindWebHostingCustomDomainResponseBody body);

        @Override
        BindWebHostingCustomDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindWebHostingCustomDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindWebHostingCustomDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindWebHostingCustomDomainResponse response) {
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
        public Builder body(BindWebHostingCustomDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindWebHostingCustomDomainResponse build() {
            return new BindWebHostingCustomDomainResponse(this);
        } 

    } 

}
