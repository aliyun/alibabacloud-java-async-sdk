// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetAutomaticFrequencyControlConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAutomaticFrequencyControlConfigResponse</p>
 */
public class GetAutomaticFrequencyControlConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAutomaticFrequencyControlConfigResponseBody body;

    private GetAutomaticFrequencyControlConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAutomaticFrequencyControlConfigResponse create() {
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
    public GetAutomaticFrequencyControlConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutomaticFrequencyControlConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAutomaticFrequencyControlConfigResponseBody body);

        @Override
        GetAutomaticFrequencyControlConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutomaticFrequencyControlConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetAutomaticFrequencyControlConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutomaticFrequencyControlConfigResponse response) {
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
        public Builder body(GetAutomaticFrequencyControlConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutomaticFrequencyControlConfigResponse build() {
            return new GetAutomaticFrequencyControlConfigResponse(this);
        } 

    } 

}
