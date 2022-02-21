// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDcdnDomainResponse} extends {@link TeaModel}
 *
 * <p>BatchAddDcdnDomainResponse</p>
 */
public class BatchAddDcdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddDcdnDomainResponseBody body;

    private BatchAddDcdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddDcdnDomainResponse create() {
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
    public BatchAddDcdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddDcdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddDcdnDomainResponseBody body);

        @Override
        BatchAddDcdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddDcdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddDcdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddDcdnDomainResponse response) {
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
        public Builder body(BatchAddDcdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddDcdnDomainResponse build() {
            return new BatchAddDcdnDomainResponse(this);
        } 

    } 

}
