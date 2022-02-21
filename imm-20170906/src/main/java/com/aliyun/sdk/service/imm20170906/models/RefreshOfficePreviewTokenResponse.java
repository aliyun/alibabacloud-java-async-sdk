// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshOfficePreviewTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshOfficePreviewTokenResponse</p>
 */
public class RefreshOfficePreviewTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshOfficePreviewTokenResponseBody body;

    private RefreshOfficePreviewTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshOfficePreviewTokenResponse create() {
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
    public RefreshOfficePreviewTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshOfficePreviewTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshOfficePreviewTokenResponseBody body);

        @Override
        RefreshOfficePreviewTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshOfficePreviewTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshOfficePreviewTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshOfficePreviewTokenResponse response) {
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
        public Builder body(RefreshOfficePreviewTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshOfficePreviewTokenResponse build() {
            return new RefreshOfficePreviewTokenResponse(this);
        } 

    } 

}
