// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchFuzzyMatchDomainSensitiveWordResponse} extends {@link TeaModel}
 *
 * <p>BatchFuzzyMatchDomainSensitiveWordResponse</p>
 */
public class BatchFuzzyMatchDomainSensitiveWordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchFuzzyMatchDomainSensitiveWordResponseBody body;

    private BatchFuzzyMatchDomainSensitiveWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public BatchFuzzyMatchDomainSensitiveWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchFuzzyMatchDomainSensitiveWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchFuzzyMatchDomainSensitiveWordResponseBody body);

        @Override
        BatchFuzzyMatchDomainSensitiveWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchFuzzyMatchDomainSensitiveWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchFuzzyMatchDomainSensitiveWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchFuzzyMatchDomainSensitiveWordResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
