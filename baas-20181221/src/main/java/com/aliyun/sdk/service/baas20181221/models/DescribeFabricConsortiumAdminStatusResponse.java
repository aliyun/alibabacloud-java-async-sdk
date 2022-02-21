// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumAdminStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumAdminStatusResponse</p>
 */
public class DescribeFabricConsortiumAdminStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricConsortiumAdminStatusResponseBody body;

    private DescribeFabricConsortiumAdminStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumAdminStatusResponse create() {
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
    public DescribeFabricConsortiumAdminStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumAdminStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricConsortiumAdminStatusResponseBody body);

        @Override
        DescribeFabricConsortiumAdminStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumAdminStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricConsortiumAdminStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumAdminStatusResponse response) {
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
        public Builder body(DescribeFabricConsortiumAdminStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumAdminStatusResponse build() {
            return new DescribeFabricConsortiumAdminStatusResponse(this);
        } 

    } 

}
