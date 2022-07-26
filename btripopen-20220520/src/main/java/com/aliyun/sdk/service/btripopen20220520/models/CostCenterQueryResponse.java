// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterQueryResponse} extends {@link TeaModel}
 *
 * <p>CostCenterQueryResponse</p>
 */
public class CostCenterQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CostCenterQueryResponseBody body;

    private CostCenterQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CostCenterQueryResponse create() {
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
    public CostCenterQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CostCenterQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CostCenterQueryResponseBody body);

        @Override
        CostCenterQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CostCenterQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CostCenterQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CostCenterQueryResponse response) {
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
        public Builder body(CostCenterQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CostCenterQueryResponse build() {
            return new CostCenterQueryResponse(this);
        } 

    } 

}
