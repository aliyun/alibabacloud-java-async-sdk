// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>BatchStopDcdnDomainResponse</p>
 */
public class BatchStopDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStopDcdnDomainResponseBody body;

    private BatchStopDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStopDcdnDomainResponse create() {
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
    public BatchStopDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStopDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStopDcdnDomainResponseBody body);

        @Override
        BatchStopDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStopDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStopDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStopDcdnDomainResponse response) {
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
        public Builder body(BatchStopDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStopDcdnDomainResponse build() {
            return new BatchStopDcdnDomainResponse(this);
        } 

    } 

}
