// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetCdnDomainConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchSetCdnDomainConfigResponse</p>
 */
public class BatchSetCdnDomainConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetCdnDomainConfigResponseBody body;

    private BatchSetCdnDomainConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetCdnDomainConfigResponse create() {
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
    public BatchSetCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetCdnDomainConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetCdnDomainConfigResponseBody body);

        @Override
        BatchSetCdnDomainConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetCdnDomainConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetCdnDomainConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetCdnDomainConfigResponse response) {
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
        public Builder body(BatchSetCdnDomainConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetCdnDomainConfigResponse build() {
            return new BatchSetCdnDomainConfigResponse(this);
        } 

    } 

}
