// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetFlowPreviewUrlResponse} extends {@link TeaModel}
 *
 * <p>GetFlowPreviewUrlResponse</p>
 */
public class GetFlowPreviewUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetFlowPreviewUrlResponseBody body;

    private GetFlowPreviewUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetFlowPreviewUrlResponse create() {
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
    public GetFlowPreviewUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFlowPreviewUrlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetFlowPreviewUrlResponseBody body);

        @Override
        GetFlowPreviewUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFlowPreviewUrlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetFlowPreviewUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFlowPreviewUrlResponse response) {
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
        public Builder body(GetFlowPreviewUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFlowPreviewUrlResponse build() {
            return new GetFlowPreviewUrlResponse(this);
        } 

    } 

}
