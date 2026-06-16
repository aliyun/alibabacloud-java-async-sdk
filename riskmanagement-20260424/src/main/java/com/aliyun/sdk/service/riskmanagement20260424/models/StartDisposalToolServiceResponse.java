// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link StartDisposalToolServiceResponse} extends {@link TeaModel}
 *
 * <p>StartDisposalToolServiceResponse</p>
 */
public class StartDisposalToolServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StartDisposalToolServiceResponseBody body;

    private StartDisposalToolServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartDisposalToolServiceResponse create() {
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
    public StartDisposalToolServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDisposalToolServiceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartDisposalToolServiceResponseBody body);

        @Override
        StartDisposalToolServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDisposalToolServiceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private StartDisposalToolServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDisposalToolServiceResponse response) {
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
        public Builder body(StartDisposalToolServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDisposalToolServiceResponse build() {
            return new StartDisposalToolServiceResponse(this);
        } 

    } 

}
