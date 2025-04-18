// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetNetworkReachableAnalysisResponse} extends {@link TeaModel}
 *
 * <p>GetNetworkReachableAnalysisResponse</p>
 */
public class GetNetworkReachableAnalysisResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetNetworkReachableAnalysisResponseBody body;

    private GetNetworkReachableAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetNetworkReachableAnalysisResponse create() {
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
    public GetNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNetworkReachableAnalysisResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetNetworkReachableAnalysisResponseBody body);

        @Override
        GetNetworkReachableAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNetworkReachableAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetNetworkReachableAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNetworkReachableAnalysisResponse response) {
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
        public Builder body(GetNetworkReachableAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNetworkReachableAnalysisResponse build() {
            return new GetNetworkReachableAnalysisResponse(this);
        } 

    } 

}
