// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDBClusterStorageUsageResponse} extends {@link TeaModel}
 *
 * <p>RefreshDBClusterStorageUsageResponse</p>
 */
public class RefreshDBClusterStorageUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshDBClusterStorageUsageResponseBody body;

    private RefreshDBClusterStorageUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshDBClusterStorageUsageResponse create() {
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
    public RefreshDBClusterStorageUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshDBClusterStorageUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshDBClusterStorageUsageResponseBody body);

        @Override
        RefreshDBClusterStorageUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshDBClusterStorageUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshDBClusterStorageUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshDBClusterStorageUsageResponse response) {
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
        public Builder body(RefreshDBClusterStorageUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshDBClusterStorageUsageResponse build() {
            return new RefreshDBClusterStorageUsageResponse(this);
        } 

    } 

}
