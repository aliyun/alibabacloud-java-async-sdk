// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTSAResponse} extends {@link TeaModel}
 *
 * <p>DescribeTSAResponse</p>
 */
public class DescribeTSAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTSAResponseBody body;

    private DescribeTSAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTSAResponse create() {
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
    public DescribeTSAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTSAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTSAResponseBody body);

        @Override
        DescribeTSAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTSAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTSAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTSAResponse response) {
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
        public Builder body(DescribeTSAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTSAResponse build() {
            return new DescribeTSAResponse(this);
        } 

    } 

}
