// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTTSDemoResponse} extends {@link TeaModel}
 *
 * <p>DescribeTTSDemoResponse</p>
 */
public class DescribeTTSDemoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTTSDemoResponseBody body;

    private DescribeTTSDemoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTTSDemoResponse create() {
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
    public DescribeTTSDemoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTTSDemoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTTSDemoResponseBody body);

        @Override
        DescribeTTSDemoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTTSDemoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTTSDemoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTTSDemoResponse response) {
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
        public Builder body(DescribeTTSDemoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTTSDemoResponse build() {
            return new DescribeTTSDemoResponse(this);
        } 

    } 

}
