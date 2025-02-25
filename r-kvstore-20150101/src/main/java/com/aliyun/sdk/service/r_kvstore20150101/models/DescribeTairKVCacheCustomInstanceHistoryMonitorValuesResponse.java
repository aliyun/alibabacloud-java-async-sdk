// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse</p>
 */
public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body;

    private DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse create() {
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
    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body);

        @Override
        DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse response) {
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
        public Builder body(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse build() {
            return new DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse(this);
        } 

    } 

}
