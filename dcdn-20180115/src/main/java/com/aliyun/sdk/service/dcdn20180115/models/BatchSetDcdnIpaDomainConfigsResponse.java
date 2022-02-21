// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetDcdnIpaDomainConfigsResponse} extends {@link TeaModel}
 *
 * <p>BatchSetDcdnIpaDomainConfigsResponse</p>
 */
public class BatchSetDcdnIpaDomainConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetDcdnIpaDomainConfigsResponseBody body;

    private BatchSetDcdnIpaDomainConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetDcdnIpaDomainConfigsResponse create() {
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
    public BatchSetDcdnIpaDomainConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetDcdnIpaDomainConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetDcdnIpaDomainConfigsResponseBody body);

        @Override
        BatchSetDcdnIpaDomainConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetDcdnIpaDomainConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetDcdnIpaDomainConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetDcdnIpaDomainConfigsResponse response) {
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
        public Builder body(BatchSetDcdnIpaDomainConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetDcdnIpaDomainConfigsResponse build() {
            return new BatchSetDcdnIpaDomainConfigsResponse(this);
        } 

    } 

}
