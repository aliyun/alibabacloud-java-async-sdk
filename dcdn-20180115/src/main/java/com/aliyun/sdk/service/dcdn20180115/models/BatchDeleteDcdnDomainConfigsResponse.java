// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDcdnDomainConfigsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteDcdnDomainConfigsResponse</p>
 */
public class BatchDeleteDcdnDomainConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteDcdnDomainConfigsResponseBody body;

    private BatchDeleteDcdnDomainConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteDcdnDomainConfigsResponse create() {
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
    public BatchDeleteDcdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteDcdnDomainConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteDcdnDomainConfigsResponseBody body);

        @Override
        BatchDeleteDcdnDomainConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteDcdnDomainConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteDcdnDomainConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteDcdnDomainConfigsResponse response) {
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
        public Builder body(BatchDeleteDcdnDomainConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteDcdnDomainConfigsResponse build() {
            return new BatchDeleteDcdnDomainConfigsResponse(this);
        } 

    } 

}
