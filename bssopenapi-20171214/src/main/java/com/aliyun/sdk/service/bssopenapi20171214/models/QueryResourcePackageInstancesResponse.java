// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourcePackageInstancesResponse} extends {@link TeaModel}
 *
 * <p>QueryResourcePackageInstancesResponse</p>
 */
public class QueryResourcePackageInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryResourcePackageInstancesResponseBody body;

    private QueryResourcePackageInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryResourcePackageInstancesResponse create() {
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
    public QueryResourcePackageInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResourcePackageInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryResourcePackageInstancesResponseBody body);

        @Override
        QueryResourcePackageInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResourcePackageInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryResourcePackageInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResourcePackageInstancesResponse response) {
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
        public Builder body(QueryResourcePackageInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResourcePackageInstancesResponse build() {
            return new QueryResourcePackageInstancesResponse(this);
        } 

    } 

}
