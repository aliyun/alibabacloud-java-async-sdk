// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLicenseDeviceListResponse} extends {@link TeaModel}
 *
 * <p>QueryLicenseDeviceListResponse</p>
 */
public class QueryLicenseDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLicenseDeviceListResponseBody body;

    private QueryLicenseDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLicenseDeviceListResponse create() {
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
    public QueryLicenseDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLicenseDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLicenseDeviceListResponseBody body);

        @Override
        QueryLicenseDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLicenseDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLicenseDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLicenseDeviceListResponse response) {
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
        public Builder body(QueryLicenseDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLicenseDeviceListResponse build() {
            return new QueryLicenseDeviceListResponse(this);
        } 

    } 

}
