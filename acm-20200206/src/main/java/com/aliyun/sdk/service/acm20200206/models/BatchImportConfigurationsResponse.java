// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>BatchImportConfigurationsResponse</p>
 */
public class BatchImportConfigurationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private BatchImportConfigurationsResponseBody body;

    private BatchImportConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchImportConfigurationsResponse create() {
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
    public BatchImportConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchImportConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchImportConfigurationsResponseBody body);

        @Override
        BatchImportConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchImportConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchImportConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchImportConfigurationsResponse response) {
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
        public Builder body(BatchImportConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchImportConfigurationsResponse build() {
            return new BatchImportConfigurationsResponse(this);
        } 

    } 

}
