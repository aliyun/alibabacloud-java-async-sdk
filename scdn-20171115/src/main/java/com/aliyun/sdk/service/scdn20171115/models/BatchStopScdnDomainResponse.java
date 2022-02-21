// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopScdnDomainResponse} extends {@link TeaModel}
 *
 * <p>BatchStopScdnDomainResponse</p>
 */
public class BatchStopScdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStopScdnDomainResponseBody body;

    private BatchStopScdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStopScdnDomainResponse create() {
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
    public BatchStopScdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStopScdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStopScdnDomainResponseBody body);

        @Override
        BatchStopScdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStopScdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStopScdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStopScdnDomainResponse response) {
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
        public Builder body(BatchStopScdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStopScdnDomainResponse build() {
            return new BatchStopScdnDomainResponse(this);
        } 

    } 

}
