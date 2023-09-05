// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PckCrlResponse} extends {@link TeaModel}
 *
 * <p>PckCrlResponse</p>
 */
public class PckCrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private String body;

    private PckCrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PckCrlResponse create() {
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
    public String getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PckCrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(String body);

        @Override
        PckCrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PckCrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private String body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PckCrlResponse response) {
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
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override
        public PckCrlResponse build() {
            return new PckCrlResponse(this);
        } 

    } 

}
