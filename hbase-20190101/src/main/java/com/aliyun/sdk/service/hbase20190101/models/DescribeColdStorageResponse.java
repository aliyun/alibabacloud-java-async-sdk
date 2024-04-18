// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColdStorageResponse} extends {@link TeaModel}
 *
 * <p>DescribeColdStorageResponse</p>
 */
public class DescribeColdStorageResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeColdStorageResponseBody body;

    private DescribeColdStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeColdStorageResponse create() {
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
    public DescribeColdStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeColdStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeColdStorageResponseBody body);

        @Override
        DescribeColdStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeColdStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeColdStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeColdStorageResponse response) {
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
        public Builder body(DescribeColdStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeColdStorageResponse build() {
            return new DescribeColdStorageResponse(this);
        } 

    } 

}
