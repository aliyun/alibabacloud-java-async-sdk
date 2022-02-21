// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumDeletableResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumDeletableResponse</p>
 */
public class DescribeFabricConsortiumDeletableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricConsortiumDeletableResponseBody body;

    private DescribeFabricConsortiumDeletableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumDeletableResponse create() {
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
    public DescribeFabricConsortiumDeletableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumDeletableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricConsortiumDeletableResponseBody body);

        @Override
        DescribeFabricConsortiumDeletableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumDeletableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricConsortiumDeletableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumDeletableResponse response) {
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
        public Builder body(DescribeFabricConsortiumDeletableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumDeletableResponse build() {
            return new DescribeFabricConsortiumDeletableResponse(this);
        } 

    } 

}
