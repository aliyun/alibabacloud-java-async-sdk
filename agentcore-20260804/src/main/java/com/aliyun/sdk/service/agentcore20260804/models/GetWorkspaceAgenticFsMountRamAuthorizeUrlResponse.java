// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse} extends {@link TeaModel}
 *
 * <p>GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse</p>
 */
public class GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody body;

    private GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse create() {
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
    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody body);

        @Override
        GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse response) {
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
        public Builder body(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse build() {
            return new GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse(this);
        } 

    } 

}
