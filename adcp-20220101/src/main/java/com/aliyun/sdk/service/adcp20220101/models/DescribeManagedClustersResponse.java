// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeManagedClustersResponse</p>
 */
public class DescribeManagedClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeManagedClustersResponseBody body;

    private DescribeManagedClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeManagedClustersResponse create() {
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
    public DescribeManagedClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeManagedClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeManagedClustersResponseBody body);

        @Override
        DescribeManagedClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeManagedClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeManagedClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeManagedClustersResponse response) {
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
        public Builder body(DescribeManagedClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeManagedClustersResponse build() {
            return new DescribeManagedClustersResponse(this);
        } 

    } 

}
