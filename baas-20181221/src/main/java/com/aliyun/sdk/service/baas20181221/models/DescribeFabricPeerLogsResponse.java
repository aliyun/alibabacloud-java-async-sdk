// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricPeerLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricPeerLogsResponse</p>
 */
public class DescribeFabricPeerLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricPeerLogsResponseBody body;

    private DescribeFabricPeerLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricPeerLogsResponse create() {
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
    public DescribeFabricPeerLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricPeerLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricPeerLogsResponseBody body);

        @Override
        DescribeFabricPeerLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricPeerLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricPeerLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricPeerLogsResponse response) {
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
        public Builder body(DescribeFabricPeerLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricPeerLogsResponse build() {
            return new DescribeFabricPeerLogsResponse(this);
        } 

    } 

}
