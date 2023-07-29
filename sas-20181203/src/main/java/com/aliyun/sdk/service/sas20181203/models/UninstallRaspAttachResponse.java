// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallRaspAttachResponse} extends {@link TeaModel}
 *
 * <p>UninstallRaspAttachResponse</p>
 */
public class UninstallRaspAttachResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallRaspAttachResponseBody body;

    private UninstallRaspAttachResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallRaspAttachResponse create() {
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
    public UninstallRaspAttachResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallRaspAttachResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallRaspAttachResponseBody body);

        @Override
        UninstallRaspAttachResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallRaspAttachResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallRaspAttachResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallRaspAttachResponse response) {
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
        public Builder body(UninstallRaspAttachResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallRaspAttachResponse build() {
            return new UninstallRaspAttachResponse(this);
        } 

    } 

}
