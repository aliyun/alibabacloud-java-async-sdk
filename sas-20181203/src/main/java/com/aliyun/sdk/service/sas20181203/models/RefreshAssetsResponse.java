// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAssetsResponse} extends {@link TeaModel}
 *
 * <p>RefreshAssetsResponse</p>
 */
public class RefreshAssetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshAssetsResponseBody body;

    private RefreshAssetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshAssetsResponse create() {
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
    public RefreshAssetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshAssetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshAssetsResponseBody body);

        @Override
        RefreshAssetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshAssetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshAssetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshAssetsResponse response) {
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
        public Builder body(RefreshAssetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshAssetsResponse build() {
            return new RefreshAssetsResponse(this);
        } 

    } 

}
