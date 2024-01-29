// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDiskSpecificationResponse} extends {@link TeaModel}
 *
 * <p>QueryClusterDiskSpecificationResponse</p>
 */
public class QueryClusterDiskSpecificationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryClusterDiskSpecificationResponseBody body;

    private QueryClusterDiskSpecificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryClusterDiskSpecificationResponse create() {
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
    public QueryClusterDiskSpecificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryClusterDiskSpecificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryClusterDiskSpecificationResponseBody body);

        @Override
        QueryClusterDiskSpecificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryClusterDiskSpecificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryClusterDiskSpecificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryClusterDiskSpecificationResponse response) {
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
        public Builder body(QueryClusterDiskSpecificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryClusterDiskSpecificationResponse build() {
            return new QueryClusterDiskSpecificationResponse(this);
        } 

    } 

}
