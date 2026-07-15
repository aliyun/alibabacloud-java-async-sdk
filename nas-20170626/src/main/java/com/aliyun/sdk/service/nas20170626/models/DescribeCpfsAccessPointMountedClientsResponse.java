// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCpfsAccessPointMountedClientsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCpfsAccessPointMountedClientsResponse</p>
 */
public class DescribeCpfsAccessPointMountedClientsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCpfsAccessPointMountedClientsResponseBody body;

    private DescribeCpfsAccessPointMountedClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCpfsAccessPointMountedClientsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public DescribeCpfsAccessPointMountedClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCpfsAccessPointMountedClientsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCpfsAccessPointMountedClientsResponseBody body);

        @Override
        DescribeCpfsAccessPointMountedClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCpfsAccessPointMountedClientsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeCpfsAccessPointMountedClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCpfsAccessPointMountedClientsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(DescribeCpfsAccessPointMountedClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCpfsAccessPointMountedClientsResponse build() {
            return new DescribeCpfsAccessPointMountedClientsResponse(this);
        } 

    } 

}
