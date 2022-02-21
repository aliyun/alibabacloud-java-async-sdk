// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteCdnDomainConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteCdnDomainConfigResponse</p>
 */
public class BatchDeleteCdnDomainConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteCdnDomainConfigResponseBody body;

    private BatchDeleteCdnDomainConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteCdnDomainConfigResponse create() {
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
    public BatchDeleteCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteCdnDomainConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteCdnDomainConfigResponseBody body);

        @Override
        BatchDeleteCdnDomainConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteCdnDomainConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteCdnDomainConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteCdnDomainConfigResponse response) {
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
        public Builder body(BatchDeleteCdnDomainConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteCdnDomainConfigResponse build() {
            return new BatchDeleteCdnDomainConfigResponse(this);
        } 

    } 

}
