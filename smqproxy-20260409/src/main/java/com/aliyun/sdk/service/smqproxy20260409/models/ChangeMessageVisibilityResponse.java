// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link ChangeMessageVisibilityResponse} extends {@link TeaModel}
 *
 * <p>ChangeMessageVisibilityResponse</p>
 */
public class ChangeMessageVisibilityResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeMessageVisibilityResponseBody body;

    private ChangeMessageVisibilityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChangeMessageVisibilityResponse create() {
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
    public ChangeMessageVisibilityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeMessageVisibilityResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChangeMessageVisibilityResponseBody body);

        @Override
        ChangeMessageVisibilityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeMessageVisibilityResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChangeMessageVisibilityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeMessageVisibilityResponse response) {
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
        public Builder body(ChangeMessageVisibilityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeMessageVisibilityResponse build() {
            return new ChangeMessageVisibilityResponse(this);
        } 

    } 

}
