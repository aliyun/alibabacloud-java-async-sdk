// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveEdgeTransferResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveEdgeTransferResponse</p>
 */
public class DescribeLiveEdgeTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveEdgeTransferResponseBody body;

    private DescribeLiveEdgeTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveEdgeTransferResponse create() {
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
    public DescribeLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveEdgeTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveEdgeTransferResponseBody body);

        @Override
        DescribeLiveEdgeTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveEdgeTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveEdgeTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveEdgeTransferResponse response) {
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
        public Builder body(DescribeLiveEdgeTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveEdgeTransferResponse build() {
            return new DescribeLiveEdgeTransferResponse(this);
        } 

    } 

}
