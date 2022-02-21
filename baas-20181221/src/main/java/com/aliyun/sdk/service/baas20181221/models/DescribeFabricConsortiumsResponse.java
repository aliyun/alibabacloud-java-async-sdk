// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumsResponse</p>
 */
public class DescribeFabricConsortiumsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricConsortiumsResponseBody body;

    private DescribeFabricConsortiumsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumsResponse create() {
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
    public DescribeFabricConsortiumsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricConsortiumsResponseBody body);

        @Override
        DescribeFabricConsortiumsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricConsortiumsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumsResponse response) {
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
        public Builder body(DescribeFabricConsortiumsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumsResponse build() {
            return new DescribeFabricConsortiumsResponse(this);
        } 

    } 

}
