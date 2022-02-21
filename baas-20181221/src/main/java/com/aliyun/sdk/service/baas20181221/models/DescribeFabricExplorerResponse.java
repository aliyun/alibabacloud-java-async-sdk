// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricExplorerResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricExplorerResponse</p>
 */
public class DescribeFabricExplorerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricExplorerResponseBody body;

    private DescribeFabricExplorerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricExplorerResponse create() {
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
    public DescribeFabricExplorerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricExplorerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricExplorerResponseBody body);

        @Override
        DescribeFabricExplorerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricExplorerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricExplorerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricExplorerResponse response) {
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
        public Builder body(DescribeFabricExplorerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricExplorerResponse build() {
            return new DescribeFabricExplorerResponse(this);
        } 

    } 

}
