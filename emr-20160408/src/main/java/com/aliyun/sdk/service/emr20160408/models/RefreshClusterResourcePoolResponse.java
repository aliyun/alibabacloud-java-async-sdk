// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshClusterResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>RefreshClusterResourcePoolResponse</p>
 */
public class RefreshClusterResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshClusterResourcePoolResponseBody body;

    private RefreshClusterResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshClusterResourcePoolResponse create() {
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
    public RefreshClusterResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshClusterResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshClusterResourcePoolResponseBody body);

        @Override
        RefreshClusterResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshClusterResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshClusterResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshClusterResourcePoolResponse response) {
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
        public Builder body(RefreshClusterResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshClusterResourcePoolResponse build() {
            return new RefreshClusterResourcePoolResponse(this);
        } 

    } 

}
