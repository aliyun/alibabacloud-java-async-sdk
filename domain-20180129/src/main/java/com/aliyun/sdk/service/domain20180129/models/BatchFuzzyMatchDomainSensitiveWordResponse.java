// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchFuzzyMatchDomainSensitiveWordResponse} extends {@link TeaModel}
 *
 * <p>BatchFuzzyMatchDomainSensitiveWordResponse</p>
 */
public class BatchFuzzyMatchDomainSensitiveWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchFuzzyMatchDomainSensitiveWordResponseBody body;

    private BatchFuzzyMatchDomainSensitiveWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchFuzzyMatchDomainSensitiveWordResponse create() {
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
    public BatchFuzzyMatchDomainSensitiveWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchFuzzyMatchDomainSensitiveWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchFuzzyMatchDomainSensitiveWordResponseBody body);

        @Override
        BatchFuzzyMatchDomainSensitiveWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchFuzzyMatchDomainSensitiveWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchFuzzyMatchDomainSensitiveWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchFuzzyMatchDomainSensitiveWordResponse response) {
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
        public Builder body(BatchFuzzyMatchDomainSensitiveWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchFuzzyMatchDomainSensitiveWordResponse build() {
            return new BatchFuzzyMatchDomainSensitiveWordResponse(this);
        } 

    } 

}
