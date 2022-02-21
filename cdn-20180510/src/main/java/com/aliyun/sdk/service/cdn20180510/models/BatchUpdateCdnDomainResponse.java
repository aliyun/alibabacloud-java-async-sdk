// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateCdnDomainResponse</p>
 */
public class BatchUpdateCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUpdateCdnDomainResponseBody body;

    private BatchUpdateCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUpdateCdnDomainResponse create() {
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
    public BatchUpdateCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdateCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUpdateCdnDomainResponseBody body);

        @Override
        BatchUpdateCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUpdateCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateCdnDomainResponse response) {
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
        public Builder body(BatchUpdateCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdateCdnDomainResponse build() {
            return new BatchUpdateCdnDomainResponse(this);
        } 

    } 

}
