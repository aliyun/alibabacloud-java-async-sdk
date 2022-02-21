// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumOrderersResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumOrderersResponse</p>
 */
public class DescribeFabricConsortiumOrderersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricConsortiumOrderersResponseBody body;

    private DescribeFabricConsortiumOrderersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumOrderersResponse create() {
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
    public DescribeFabricConsortiumOrderersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumOrderersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricConsortiumOrderersResponseBody body);

        @Override
        DescribeFabricConsortiumOrderersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumOrderersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricConsortiumOrderersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumOrderersResponse response) {
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
        public Builder body(DescribeFabricConsortiumOrderersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumOrderersResponse build() {
            return new DescribeFabricConsortiumOrderersResponse(this);
        } 

    } 

}
