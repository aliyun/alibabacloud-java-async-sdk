// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAssetRefreshTaskConfigResponse} extends {@link TeaModel}
 *
 * <p>ChangeAssetRefreshTaskConfigResponse</p>
 */
public class ChangeAssetRefreshTaskConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeAssetRefreshTaskConfigResponseBody body;

    private ChangeAssetRefreshTaskConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeAssetRefreshTaskConfigResponse create() {
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
    public ChangeAssetRefreshTaskConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeAssetRefreshTaskConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeAssetRefreshTaskConfigResponseBody body);

        @Override
        ChangeAssetRefreshTaskConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeAssetRefreshTaskConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeAssetRefreshTaskConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeAssetRefreshTaskConfigResponse response) {
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
        public Builder body(ChangeAssetRefreshTaskConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeAssetRefreshTaskConfigResponse build() {
            return new ChangeAssetRefreshTaskConfigResponse(this);
        } 

    } 

}
