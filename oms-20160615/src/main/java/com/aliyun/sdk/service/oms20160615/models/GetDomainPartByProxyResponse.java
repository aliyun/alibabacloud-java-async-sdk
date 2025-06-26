// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615.models;

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
 * {@link GetDomainPartByProxyResponse} extends {@link TeaModel}
 *
 * <p>GetDomainPartByProxyResponse</p>
 */
public class GetDomainPartByProxyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDomainPartByProxyResponseBody body;

    private GetDomainPartByProxyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDomainPartByProxyResponse create() {
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
    public GetDomainPartByProxyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDomainPartByProxyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDomainPartByProxyResponseBody body);

        @Override
        GetDomainPartByProxyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDomainPartByProxyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetDomainPartByProxyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDomainPartByProxyResponse response) {
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
        public Builder body(GetDomainPartByProxyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDomainPartByProxyResponse build() {
            return new GetDomainPartByProxyResponse(this);
        } 

    } 

}
