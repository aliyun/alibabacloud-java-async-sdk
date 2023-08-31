// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DryRunClusterResponse} extends {@link TeaModel}
 *
 * <p>DryRunClusterResponse</p>
 */
public class DryRunClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DryRunClusterResponseBody body;

    private DryRunClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DryRunClusterResponse create() {
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
    public DryRunClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DryRunClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DryRunClusterResponseBody body);

        @Override
        DryRunClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DryRunClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DryRunClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DryRunClusterResponse response) {
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
        public Builder body(DryRunClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DryRunClusterResponse build() {
            return new DryRunClusterResponse(this);
        } 

    } 

}
