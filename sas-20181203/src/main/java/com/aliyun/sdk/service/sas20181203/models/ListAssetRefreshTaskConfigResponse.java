// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetRefreshTaskConfigResponse} extends {@link TeaModel}
 *
 * <p>ListAssetRefreshTaskConfigResponse</p>
 */
public class ListAssetRefreshTaskConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssetRefreshTaskConfigResponseBody body;

    private ListAssetRefreshTaskConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAssetRefreshTaskConfigResponse create() {
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
    public ListAssetRefreshTaskConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssetRefreshTaskConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAssetRefreshTaskConfigResponseBody body);

        @Override
        ListAssetRefreshTaskConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssetRefreshTaskConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAssetRefreshTaskConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssetRefreshTaskConfigResponse response) {
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
        public Builder body(ListAssetRefreshTaskConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssetRefreshTaskConfigResponse build() {
            return new ListAssetRefreshTaskConfigResponse(this);
        } 

    } 

}
