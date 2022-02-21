// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshContainerAssetsResponse} extends {@link TeaModel}
 *
 * <p>RefreshContainerAssetsResponse</p>
 */
public class RefreshContainerAssetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshContainerAssetsResponseBody body;

    private RefreshContainerAssetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshContainerAssetsResponse create() {
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
    public RefreshContainerAssetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshContainerAssetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshContainerAssetsResponseBody body);

        @Override
        RefreshContainerAssetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshContainerAssetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshContainerAssetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshContainerAssetsResponse response) {
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
        public Builder body(RefreshContainerAssetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshContainerAssetsResponse build() {
            return new RefreshContainerAssetsResponse(this);
        } 

    } 

}
