// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterDeleteResponse} extends {@link TeaModel}
 *
 * <p>CostCenterDeleteResponse</p>
 */
public class CostCenterDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CostCenterDeleteResponseBody body;

    private CostCenterDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CostCenterDeleteResponse create() {
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
    public CostCenterDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CostCenterDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CostCenterDeleteResponseBody body);

        @Override
        CostCenterDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CostCenterDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CostCenterDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CostCenterDeleteResponse response) {
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
        public Builder body(CostCenterDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CostCenterDeleteResponse build() {
            return new CostCenterDeleteResponse(this);
        } 

    } 

}
