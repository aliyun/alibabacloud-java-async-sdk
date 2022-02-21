// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>BatchAddCdnDomainResponse</p>
 */
public class BatchAddCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddCdnDomainResponseBody body;

    private BatchAddCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddCdnDomainResponse create() {
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
    public BatchAddCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddCdnDomainResponseBody body);

        @Override
        BatchAddCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddCdnDomainResponse response) {
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
        public Builder body(BatchAddCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddCdnDomainResponse build() {
            return new BatchAddCdnDomainResponse(this);
        } 

    } 

}
